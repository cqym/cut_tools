package com.tl.resource.dao.pojo;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TCusSalesPriceHistory {
  private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_cus_sales_price_history.id
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  private String id;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_cus_sales_price_history.product_tool_infor_id
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  private String productToolInforId;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_cus_sales_price_history.parent_id
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  private String parentId;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_cus_sales_price_history.leaf
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  private Integer leaf;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_cus_sales_price_history.customer_infor_id
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  private String customerInforId;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_cus_sales_price_history.product_code
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  private String productCode;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_cus_sales_price_history.history_price
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  private BigDecimal historyPrice;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_cus_sales_price_history.rebate
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  private BigDecimal rebate;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_cus_sales_price_history.net_price
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  private BigDecimal netPrice;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_cus_sales_price_history.brand_code
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  private String brandCode;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_cus_sales_price_history.edit_date
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  private Date editDate;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_cus_sales_price_history.user_id
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  private String userId;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_cus_sales_price_history.user_name
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  private String userName;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_cus_sales_price_history.sale_price_date
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  private Date salePriceDate;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_cus_sales_price_history.status
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  private Integer status;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_cus_sales_price_history.quotation_code
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  private String quotationCode;

  /**
   * 子结点
   */
  private List<TCusSalesPriceHistory> children;

  /**
   * 前台树组件UI
   */
  private String uiProvider = "col";

  private String iconCls = "task";

  private String editDateString;

  private BigDecimal taxNetPrice;

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_cus_sales_price_history.id
   *
   * @return the value of t_cus_sales_price_history.id
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public String getId() {
    return id;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_cus_sales_price_history.id
   *
   * @param id the value for t_cus_sales_price_history.id
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_cus_sales_price_history.product_tool_infor_id
   *
   * @return the value of t_cus_sales_price_history.product_tool_infor_id
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public String getProductToolInforId() {
    return productToolInforId;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_cus_sales_price_history.product_tool_infor_id
   *
   * @param productToolInforId the value for t_cus_sales_price_history.product_tool_infor_id
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public void setProductToolInforId(String productToolInforId) {
    this.productToolInforId = productToolInforId;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_cus_sales_price_history.parent_id
   *
   * @return the value of t_cus_sales_price_history.parent_id
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public String getParentId() {
    return parentId;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_cus_sales_price_history.parent_id
   *
   * @param parentId the value for t_cus_sales_price_history.parent_id
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_cus_sales_price_history.leaf
   *
   * @return the value of t_cus_sales_price_history.leaf
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public Integer getLeaf() {
    return leaf;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_cus_sales_price_history.leaf
   *
   * @param leaf the value for t_cus_sales_price_history.leaf
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public void setLeaf(Integer leaf) {
    this.leaf = leaf;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_cus_sales_price_history.customer_infor_id
   *
   * @return the value of t_cus_sales_price_history.customer_infor_id
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public String getCustomerInforId() {
    return customerInforId;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_cus_sales_price_history.customer_infor_id
   *
   * @param customerInforId the value for t_cus_sales_price_history.customer_infor_id
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public void setCustomerInforId(String customerInforId) {
    this.customerInforId = customerInforId;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_cus_sales_price_history.product_code
   *
   * @return the value of t_cus_sales_price_history.product_code
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public String getProductCode() {
    return productCode;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_cus_sales_price_history.product_code
   *
   * @param productCode the value for t_cus_sales_price_history.product_code
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_cus_sales_price_history.history_price
   *
   * @return the value of t_cus_sales_price_history.history_price
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public BigDecimal getHistoryPrice() {
    return historyPrice;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_cus_sales_price_history.history_price
   *
   * @param historyPrice the value for t_cus_sales_price_history.history_price
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public void setHistoryPrice(BigDecimal historyPrice) {
    this.historyPrice = historyPrice;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_cus_sales_price_history.rebate
   *
   * @return the value of t_cus_sales_price_history.rebate
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public BigDecimal getRebate() {
    return rebate;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_cus_sales_price_history.rebate
   *
   * @param rebate the value for t_cus_sales_price_history.rebate
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public void setRebate(BigDecimal rebate) {
    this.rebate = rebate;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_cus_sales_price_history.net_price
   *
   * @return the value of t_cus_sales_price_history.net_price
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public BigDecimal getNetPrice() {
    return netPrice;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_cus_sales_price_history.net_price
   *
   * @param netPrice the value for t_cus_sales_price_history.net_price
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public void setNetPrice(BigDecimal netPrice) {
    this.netPrice = netPrice;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_cus_sales_price_history.brand_code
   *
   * @return the value of t_cus_sales_price_history.brand_code
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public String getBrandCode() {
    return brandCode;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_cus_sales_price_history.brand_code
   *
   * @param brandCode the value for t_cus_sales_price_history.brand_code
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public void setBrandCode(String brandCode) {
    this.brandCode = brandCode;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_cus_sales_price_history.edit_date
   *
   * @return the value of t_cus_sales_price_history.edit_date
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public Date getEditDate() {
    return editDate;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_cus_sales_price_history.edit_date
   *
   * @param editDate the value for t_cus_sales_price_history.edit_date
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public void setEditDate(Date editDate) {
    this.editDate = editDate;

    if (editDate != null) {
      editDateString = df.format(editDate);
    }
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_cus_sales_price_history.user_id
   *
   * @return the value of t_cus_sales_price_history.user_id
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public String getUserId() {
    return userId;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_cus_sales_price_history.user_id
   *
   * @param userId the value for t_cus_sales_price_history.user_id
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_cus_sales_price_history.user_name
   *
   * @return the value of t_cus_sales_price_history.user_name
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public String getUserName() {
    return userName;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_cus_sales_price_history.user_name
   *
   * @param userName the value for t_cus_sales_price_history.user_name
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_cus_sales_price_history.sale_price_date
   *
   * @return the value of t_cus_sales_price_history.sale_price_date
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public Date getSalePriceDate() {
    return salePriceDate;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_cus_sales_price_history.sale_price_date
   *
   * @param salePriceDate the value for t_cus_sales_price_history.sale_price_date
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public void setSalePriceDate(Date salePriceDate) {
    this.salePriceDate = salePriceDate;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_cus_sales_price_history.status
   *
   * @return the value of t_cus_sales_price_history.status
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public Integer getStatus() {
    return status;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_cus_sales_price_history.status
   *
   * @param status the value for t_cus_sales_price_history.status
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_cus_sales_price_history.quotation_code
   *
   * @return the value of t_cus_sales_price_history.quotation_code
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public String getQuotationCode() {
    return quotationCode;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_cus_sales_price_history.quotation_code
   *
   * @param quotationCode the value for t_cus_sales_price_history.quotation_code
   *
   * @ibatorgenerated Fri Oct 16 10:53:03 CST 2009
   */
  public void setQuotationCode(String quotationCode) {
    this.quotationCode = quotationCode;
  }

  public List<TCusSalesPriceHistory> getChildren() {
    return children;
  }

  public void setChildren(List<TCusSalesPriceHistory> children) {
    this.children = children;
  }

  public String getUiProvider() {
    return uiProvider;
  }

  public void setUiProvider(String uiProvider) {
    this.uiProvider = uiProvider;
  }

  public String getIconCls() {
    return iconCls;
  }

  public void setIconCls(String iconCls) {
    this.iconCls = iconCls;
  }

  public String getEditDateString() {
    return editDateString;
  }

  public void setEditDateString(String editDateString) {
    this.editDateString = editDateString;
  }

  public BigDecimal getTaxNetPrice() {
    return taxNetPrice;
  }

  public void setTaxNetPrice(BigDecimal taxNetPrice) {
    this.taxNetPrice = taxNetPrice;
  }

}