package com.tl.resource.business.contract;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.tl.common.util.MoneyUtil;
import com.tl.common.util.WebUtils;
import com.tl.resource.dao.TAccessoriesDAO;
import com.tl.resource.dao.TCompanyInforDAO;
import com.tl.resource.dao.TContractInforDAO;
import com.tl.resource.dao.TContractProductDetailDAO;
import com.tl.resource.dao.TContractProjectSortInforDAO;
import com.tl.resource.dao.TCustomersInforDAO;
import com.tl.resource.dao.TExchangeRateDAO;
import com.tl.resource.dao.pojo.TAccessories;
import com.tl.resource.dao.pojo.TAccessoriesExample;
import com.tl.resource.dao.pojo.TCompanyInfor;
import com.tl.resource.dao.pojo.TCompanyInforExample;
import com.tl.resource.dao.pojo.TContractInfor;
import com.tl.resource.dao.pojo.TContractProductDetail;
import com.tl.resource.dao.pojo.TContractProductDetailExample;
import com.tl.resource.dao.pojo.TCustomersInfor;
import com.tl.resource.dao.pojo.TCustomersInforExample;
import com.tl.resource.dao.pojo.TExchangeRate;

public class ContractOutExcelImp implements ContractOutExcel {
	private java.text.DecimalFormat df = new java.text.DecimalFormat("#.00");
	private java.text.DecimalFormat amountdf = new java.text.DecimalFormat("#");
	public static final String TempletePath = "\\upload\\templete\\contract_templete.xls";
	private TContractInforDAO contractInforDAO;
	private TContractProductDetailDAO contractProductDetailDAO;
	private TContractProjectSortInforDAO contractProjectSortInforDAO;
	private TCompanyInforDAO companyInforDAO;
	private TCustomersInforDAO customersInforDAO;
	private TAccessoriesDAO accessoriesDAO;
	private TExchangeRateDAO exchangeRateDAO;
	private Map<String, CellStyle> styles;
	private TCompanyInfor comInfor = new TCompanyInfor();
	private TCustomersInfor cusInfor = new TCustomersInfor();
	private TContractInfor conPo;
	private String logoPath, footerPath, basePath;
	private HSSFSheet dataSheet;
	private HSSFWorkbook workbook;

	@Override
	public void exportExcel(String conId, HttpServletResponse response,
			HttpServletRequest request) throws IOException {
		// 生成Excel文件.
		conPo = contractInforDAO.selectByPrimaryKey(conId);
		basePath = request.getRealPath("/");
		FileInputStream fs = new FileInputStream(basePath + TempletePath);
		workbook = new HSSFWorkbook(fs);
		dataSheet = workbook.getSheetAt(0);
		TCompanyInforExample comExp = new TCompanyInforExample();
		comExp.createCriteria().andCompanyNameEqualTo(conPo.getSellerName());
		List<TCompanyInfor> companys = companyInforDAO.selectByExample(comExp);
		if (companys != null && companys.size() > 0) {
			comInfor = companys.get(0);
		}

		List<Integer> types = new ArrayList<Integer>();
		types.add(3);
		types.add(4);
		TAccessoriesExample accExp = new TAccessoriesExample();
		accExp.createCriteria().andBusinessIdEqualTo(comInfor.getId())
				.andBusinessTypeIn(types);// logo
		List<TAccessories> logoList = accessoriesDAO.selectByExample(accExp);
		if (logoList != null && logoList.size() > 0) {
			for (Iterator iterator = logoList.iterator(); iterator.hasNext();) {
				TAccessories accessories = (TAccessories) iterator.next();
				if (accessories.getBusinessType() == 3) {
					logoPath = accessories.getPath();
					if (logoPath != null) {
						logoPath = basePath
								+ logoPath.replaceAll("\\/", "\\\\");
					}
				} else if (accessories.getBusinessType() == 4) {
					footerPath = accessories.getPath();
					if (footerPath != null) {
						footerPath = basePath
								+ footerPath.replaceAll("\\/", "\\\\");
					}
				}
			}
		}

		TCustomersInforExample cusExp = new TCustomersInforExample();
		cusExp.createCriteria().andCustomerCodeEqualTo(conPo.getCustomerCode());
		List<TCustomersInfor> cusList = customersInforDAO
				.selectByExample(cusExp);
		if (cusList != null && cusList.size() > 0) {
			cusInfor = cusList.get(0);
		}

		exportExcelWorkbook();

		// 输出Excel文件.
		response.setContentType("application/vnd.ms-excel");
		WebUtils.setDownloadableHeader(response, conPo.getContractCode()
				+ ".xls");
		workbook.write(response.getOutputStream());
		response.getOutputStream().flush();
	}

	private void exportExcelWorkbook() {
		Workbook wb = this.workbook;
		Sheet s = this.dataSheet;
		Cell c0;
		Cell c5;
		int rowIndex = 3;
		Drawing patriarch = s.createDrawingPatriarch();
		rowIndex = createSheetHeaderInfor(wb, s, rowIndex, "买 卖 合 同", patriarch);
		rowIndex += 2;
		// rowIndex = createSheetTableHeader(wb, s,rowIndex);

		TContractProductDetailExample example = new TContractProductDetailExample();
		example.createCriteria().andContractInforIdEqualTo(conPo.getId())
				.andParentToolsIdEqualTo("root");
		int prodCount = contractProductDetailDAO.countByExample(example);
		if (prodCount > 6) {//
			Row r8 = s.getRow(++rowIndex);
			c0 = this.getCell(r8, 2);
			c0.setCellValue("产品详见合同清单");

			c0 = this.getCell(r8, 4);
			c0.setCellValue("批");

			c0 = this.getCell(r8, 5);
			c0.setCellValue(1);

			c0 = this.getCell(r8, 6);
			c0.setCellValue(conPo.getProductMoney().toString());

			c0 = this.getCell(r8, 7);
			c0.setCellValue(conPo.getProductMoney().toString());

			c0 = this.getCell(r8, 8);
			c0.setCellValue("见清单");

			c0 = this.getCell(r8, 9);
			c0.setCellValue("见清单");

			Sheet sd = wb.getSheetAt(1);
			int rIndex = 3;
			Drawing patriarch2 = sd.createDrawingPatriarch();
			
			rIndex = createSheetHeaderInfor(wb, sd, rIndex, "合同清单", patriarch2);
			// rIndex = createSheetTableHeader(wb, sd,rIndex);
			rIndex += 1;
			rIndex = createSheetTableData(wb, sd, rIndex, Integer.MAX_VALUE);
			insertFooterImage(sd, (HSSFWorkbook) wb, (short) 0, ++rIndex,
					(short) 9, rIndex, patriarch2);
		} else {

			rowIndex = createSheetTableData(wb, s, rowIndex, 7);
		}
		rowIndex = 14;
		String[] totalRowsValue = { "货品总计：", "税 率： ", "税 金： ", "价税合计： ",
				"整单折扣： ", "最终金额： ", "大写金额： " };

		for (int i = 0; i < totalRowsValue.length; i++) {
			Row t = s.getRow(++rowIndex);
			switch (i) {
			case 0:
				c0 = this.getCell(t, 3);
				BigDecimal tmp = conPo.getProductMoney();
				tmp = tmp == null ? BigDecimal.ZERO : tmp;
				c0.setCellValue(tmp.doubleValue());
				break;
			case 1:
				c0 = this.getCell(t, 3);
				tmp = conPo.getTaxRate();
				tmp = tmp == null ? BigDecimal.ZERO : tmp;
				c0.setCellValue(tmp.doubleValue());
				break;
			case 2:
				c0 = this.getCell(t, 3);
				tmp = conPo.getTaxMoney();
				tmp = tmp == null ? BigDecimal.ZERO : tmp;
				c0.setCellValue(tmp.doubleValue());
				break;
			case 3:
				c0 = this.getCell(t, 3);
				tmp = conPo.getTotalMoney();
				tmp = tmp == null ? BigDecimal.ZERO : tmp;
				c0.setCellValue(tmp.doubleValue());

				break;
			case 4:
				c0 = this.getCell(t, 3);
				if (conPo.getOverallRebate() == null
						|| conPo.getOverallRebate().doubleValue() == 0) {
					t.getCell(0).setCellValue("");
					c0.setCellValue("");
					t.setHeight((short) 0);
				} else {
					tmp = conPo.getOverallRebate();
					tmp = tmp == null ? BigDecimal.ZERO : tmp;
					c0.setCellValue(tmp.doubleValue() / 100);
				}
				break;
			case 5:
				c0 = this.getCell(t, 3);
				tmp = conPo.getFinalMoney();
				tmp = tmp == null ? BigDecimal.ZERO : tmp;
				c0.setCellValue(df.format(tmp.doubleValue()));
				if (conPo.getTotalMoney() == null
						|| conPo.getTotalMoney().doubleValue() == conPo
								.getFinalMoney().doubleValue()) {
					t.getCell(0).setCellValue("");
					c0.setCellValue("");
					t.setHeight((short) 0);
				}
				break;
			case 6:
				c0 = this.getCell(t, 3);
				c0.setCellValue(MoneyUtil.CNValueOf(df.format(conPo
						.getFinalMoney().doubleValue())));
				break;
			default:
				break;
			}
		}
		int colIndex = 0;
		Row t = s.getRow(++rowIndex);
		Cell c1 = this.getCell(t, colIndex);
		// c1.setCellValue(c1.getStringCellValue() + conPo.getReference());

		t = s.getRow(++rowIndex);
		c1 = this.getCell(t, colIndex);
		c1.setCellValue(c1.getStringCellValue()
				+ conPo.getDeliveryAddressType());

		t = s.getRow(++rowIndex);
		c1 = this.getCell(t, colIndex);
		c1.setCellValue(c1.getStringCellValue() + conPo.getTrafficMode());

		rowIndex += 2;

		t = s.getRow(++rowIndex);
		c1 = this.getCell(t, colIndex);
		c1
				.setCellValue(c1.getStringCellValue()
						+ conPo.getClosingAccountMode());

		t = s.getRow(++rowIndex);
		c1 = this.getCell(t, colIndex);
		// c1.setCellValue(c1.getStringCellValue() +
		// conPo.getOtherConvention());

		t = s.getRow(++rowIndex);
		c1 = this.getCell(t, colIndex);
		String temp = conPo.getSignAddress();
		if (temp == null || "无".equals(temp.trim())) {
			temp = "";
		}
		c1.setCellValue(c1.getStringCellValue() + temp);

		++rowIndex;

		t = s.getRow(++rowIndex);
		c1 = this.getCell(t, colIndex);
		// c1.setCellValue(c1.getStringCellValue() + conPo.getEffectConditions()
		// + "传真件具有同等法律效力。");

		rowIndex = 33;
		String[] infors = { "单位名称（章）:", "注册地址: ", "法人代表： ", "委托代理人: ",
				"电      话: ", "开  户 行: ", "帐      号: ", "税      号: ", "邮寄地址： ",
				"邮政编码: " };
		String[] companyArr = { comInfor.getCompanyName(),
				comInfor.getRegAddress(), comInfor.getContactPerson(), "",
				comInfor.getPhone(), comInfor.getBank(),
				comInfor.getAccountNumber(), comInfor.getTaxCode(),
				comInfor.getCompanyAddress(), comInfor.getPostcode() };

		String[] customerArr = { cusInfor.getCustomerName(),
				cusInfor.getComAdress(), "", "", cusInfor.getPhoneFirst(),
				cusInfor.getBank(), cusInfor.getAccountNumber(),
				cusInfor.getTaxCode(), cusInfor.getContractAddress(),
				cusInfor.getPostcode() };
		int colIndex1 = 0, colIndex2 = 5;
		for (int i = 0; i < infors.length; i++) {
			Row tt = s.getRow(++rowIndex);
			c0 = getCell(tt, colIndex1);
			c0.setCellValue(c0.getStringCellValue() + customerArr[i]);

			c5 = getCell(tt, colIndex2);
			c5.setCellValue(c5.getStringCellValue() + companyArr[i]);
		}
		rowIndex += 3;
		insertFooterImage(s, (HSSFWorkbook) wb, (short) 0, rowIndex, (short) 9,
				rowIndex, patriarch);
	}

	private int createSheetTableData(Workbook wb, Sheet s, int rowIndex,
			int maxCount) {
		CellStyle tcs;
		Cell c0;
		Row r8;
		TContractProductDetailExample example = new TContractProductDetailExample();
		example.createCriteria().andContractInforIdEqualTo(conPo.getId())
				.andParentToolsIdEqualTo("root");
		;
		example
				.setOrderByClause("contract_Project_Sort_Id,project_Code,serial_Number");
		List<TContractProductDetail> list = contractProductDetailDAO
				.selectByExample(example);

		int i = 0;

		for (Iterator iterator = list.iterator(); i < maxCount
				&& iterator.hasNext();) {
			TContractProductDetail contractProductDetail = (TContractProductDetail) iterator
					.next();
			r8 = s.getRow(++rowIndex);
			if (r8 == null)
				r8 = s.createRow(rowIndex - 1);
			c0 = getCell(r8, 0);
			c0.setCellValue(contractProductDetail.getProjectCode());

			c0 = getCell(r8, 1);
			c0.setCellValue(contractProductDetail.getSerialNumber());

			c0 = getCell(r8, 2);
			c0.setCellValue(contractProductDetail.getProductName());

			c0 = getCell(r8, 3);
			c0.setCellValue(contractProductDetail.getBrandCode());

			c0 = getCell(r8, 4);
			c0.setCellValue(contractProductDetail.getProductUnit());

			c0 = getCell(r8, 5);
			BigDecimal tmp = contractProductDetail.getAmount();
			tmp = tmp == null ? BigDecimal.ZERO : tmp;
			c0.setCellValue(tmp.intValue());

			c0 = getCell(r8, 6);
			tmp = contractProductDetail.getNetPrice();
			tmp = tmp == null ? BigDecimal.ZERO : tmp;
			c0.setCellValue(tmp.doubleValue());
			c0.setCellType(Cell.CELL_TYPE_NUMERIC);

			c0 = getCell(r8, 7);
			tmp = contractProductDetail.getMoney();
			tmp = tmp == null ? BigDecimal.ZERO : tmp;
			c0.setCellValue(tmp.doubleValue());
			c0.setCellType(Cell.CELL_TYPE_NUMERIC);

			c0 = getCell(r8, 8);
			c0.setCellValue(contractProductDetail.getDeliveryDate());

			c0 = getCell(r8, 9);
			c0.setCellValue(contractProductDetail.getProductBrand());
		}
		return rowIndex;
	}

	private void insertFooterImage(Sheet s, HSSFWorkbook wb, short x1, int y1,
			short x2, int y2, Drawing patriarch) {
		if (this.footerPath != null) {
			HSSFClientAnchor anchor = new HSSFClientAnchor(0, 0, 1023, 250, x1,
					y1, x2, y2);
			patriarch.createPicture(anchor, wb.addPicture(
					getImageByteArray(this.footerPath),
					HSSFWorkbook.PICTURE_TYPE_JPEG));
		}
	}

	private int createSheetHeaderInfor(Workbook wb, Sheet s, int rowIndex,
			String header, Drawing patriarch) {
		if (this.logoPath != null) {
			HSSFClientAnchor anchor = new HSSFClientAnchor(0, 0, 1023, 250,
					(short) 0, 0, (short) (9), 0);
			anchor.setAnchorType(2);
			patriarch.createPicture(anchor, wb.addPicture(
					getImageByteArray(this.logoPath),
					HSSFWorkbook.PICTURE_TYPE_JPEG));
		}
		int colIndex1 = 3;
		int colIndex2 = 7;
		Row r3 = s.getRow(rowIndex);
		Cell c0 = getCell(r3, colIndex1);
		c0.setCellValue(conPo.getCustomerName());
		Cell c5 = getCell(r3, colIndex2);
		c5.setCellValue(conPo.getContractCode());
		// ++rowIndex;
		// Row r4 = s.getRow(++rowIndex);
		// c5 = getCell(r4,colIndex2);
		// c5.setCellValue(conPo.getSignAddress());

		Row r5 = s.getRow(++rowIndex);
		Cell c1 = getCell(r5, colIndex1);
		c1.setCellValue(conPo.getSellerName());
		Cell c6 = getCell(r5, colIndex2);
		if (conPo.getSignDate() != null
				&& conPo.getSignDate().split("-").length >= 3) {
			String[] date = conPo.getSignDate().split("-");
			c6.setCellValue(date[0] + "年" + date[1] + " 月" + date[2] + "日");
		}

		Row r7 = s.getRow(++rowIndex);
		c5 = getCell(r7, colIndex2);
		// c5.setCellValue("");

		TExchangeRate expo = exchangeRateDAO.selectByPrimaryKey(conPo
				.getCurrencyId());
		Row r6 = s.getRow(++rowIndex);
		c5 = getCell(r6, colIndex2);
		c5.setCellValue(expo.getCurrencyName());
		return rowIndex;
	}

	private Cell getCell(Row r3, int index) {
		Cell c0 = (r3.getCell(index) == null ? r3.createCell(index) : r3
				.getCell(index));
		return c0;
	}

	private byte[] getImageByteArray(String logoPath2) {
		ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
		;
		try {
			if (logoPath2 == null)
				return null;
			String[] temp = logoPath2.split("\\.");
			String extName = temp.length >= 2 ? temp[temp.length - 1] : "";
			BufferedImage bufferImg = ImageIO.read(new File(logoPath2));
			ImageIO.write(bufferImg, extName, byteArrayOut);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return byteArrayOut.toByteArray();
	}

	public TContractInforDAO getContractInforDAO() {
		return contractInforDAO;
	}

	public void setContractInforDAO(TContractInforDAO contractInforDAO) {
		this.contractInforDAO = contractInforDAO;
	}

	public TContractProductDetailDAO getContractProductDetailDAO() {
		return contractProductDetailDAO;
	}

	public void setContractProductDetailDAO(
			TContractProductDetailDAO contractProductDetailDAO) {
		this.contractProductDetailDAO = contractProductDetailDAO;
	}

	public TContractProjectSortInforDAO getContractProjectSortInforDAO() {
		return contractProjectSortInforDAO;
	}

	public void setContractProjectSortInforDAO(
			TContractProjectSortInforDAO contractProjectSortInforDAO) {
		this.contractProjectSortInforDAO = contractProjectSortInforDAO;
	}

	public Map<String, CellStyle> getStyles() {
		return styles;
	}

	public void setStyles(Map<String, CellStyle> styles) {
		this.styles = styles;
	}

	public TCompanyInforDAO getCompanyInforDAO() {
		return companyInforDAO;
	}

	public void setCompanyInforDAO(TCompanyInforDAO companyInforDAO) {
		this.companyInforDAO = companyInforDAO;
	}

	public TCustomersInforDAO getCustomersInforDAO() {
		return customersInforDAO;
	}

	public void setCustomersInforDAO(TCustomersInforDAO customersInforDAO) {
		this.customersInforDAO = customersInforDAO;
	}

	public TAccessoriesDAO getAccessoriesDAO() {
		return accessoriesDAO;
	}

	public void setAccessoriesDAO(TAccessoriesDAO accessoriesDAO) {
		this.accessoriesDAO = accessoriesDAO;
	}

	public TExchangeRateDAO getExchangeRateDAO() {
		return exchangeRateDAO;
	}

	public void setExchangeRateDAO(TExchangeRateDAO exchangeRateDAO) {
		this.exchangeRateDAO = exchangeRateDAO;
	}

}
