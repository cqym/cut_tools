package com.tl.resource.web.planOrder;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.tl.common.util.PaginationSupport;
import com.tl.common.util.RegexUtils;
import com.tl.resource.business.dto.TreeDto;
import com.tl.resource.business.planOrder.PlanOrderService;
import com.tl.resource.business.reserveOrder.ReserveOrderService;

public class ProductListAction extends Action{

	private PlanOrderService planOrderService;
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.setContentType("text/html;charset=utf-8");
		String size = request.getParameter("limit") == null?"20":request.getParameter("limit");
		String start = request.getParameter("start") == null?"0":request.getParameter("start");
		int pageSize = Integer.parseInt(size);
		int startIndex = Integer.parseInt(start);
		String supplierId = request.getParameter("supplierId");
		//搜索字符串	
		String searchStr = request.getParameter("searchStr");
		String productCode = "";
		String brandCode = "";
		String productName = "";
		if(searchStr != null && !"".equals(searchStr)) {
			
			JSONObject search = JSONObject.fromObject(searchStr);
			
			try {
				productCode = search.getString("productCode");
				brandCode = search.getString("brandCode");
				productName = search.getString("productName");
			} catch(Exception e) {
				
			}
		}
		Map<String, Object> parmMap = new HashMap<String, Object>();
		
		String sort = request.getParameter("sort");
		if(sort != null){
			parmMap.put("sort", RegexUtils.toDataBaseColName(sort));
			parmMap.put("dir", request.getParameter("dir"));
		}
		
		parmMap.put("productCode", productCode);
		parmMap.put("brandCode", brandCode);
		parmMap.put("productName", productName);
		parmMap.put("supplierId", supplierId);	
		parmMap.put("startIndex", startIndex);
		parmMap.put("pageSize", pageSize);
		int total = planOrderService.getProToolsTotal(parmMap);
		List<TreeDto> proList = planOrderService.getProToolsBySearch(parmMap);
		PaginationSupport pageInfo  = new PaginationSupport(proList,total,pageSize,startIndex);
		String pageInfoJson = JSONObject.fromObject(pageInfo).toString();
		PrintWriter out = response.getWriter();
		out.write(pageInfoJson);
		out.flush();
		out.close();
		return null;
	}
	public PlanOrderService getPlanOrderService() {
		return planOrderService;
	}
	public void setPlanOrderService(PlanOrderService planOrderService) {
		this.planOrderService = planOrderService;
	}
	
	
	
	
	
}
