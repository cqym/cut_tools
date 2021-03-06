package com.tl.resource.business.dto;

import java.math.BigDecimal;

public class ProductSaleBillDto {
  private String toolsId;

  private String contractCode;

  private String customerCode;

  private String customerName;

  private BigDecimal contractAmount;

  private BigDecimal scheduleAmount;

  private BigDecimal tryAmount;

  private BigDecimal netPrice;

  private BigDecimal money;

  public String getToolsId() {
    return toolsId;
  }

  public void setToolsId(String toolsId) {
    this.toolsId = toolsId;
  }

  public String getContractCode() {
    return contractCode;
  }

  public void setContractCode(String contractCode) {
    this.contractCode = contractCode;
  }

  public String getCustomerCode() {
    return customerCode;
  }

  public void setCustomerCode(String customerCode) {
    this.customerCode = customerCode;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public BigDecimal getContractAmount() {
    return contractAmount;
  }

  public void setContractAmount(BigDecimal contractAmount) {
    this.contractAmount = contractAmount;
  }

  public BigDecimal getScheduleAmount() {
    return scheduleAmount;
  }

  public void setScheduleAmount(BigDecimal scheduleAmount) {
    this.scheduleAmount = scheduleAmount;
  }

  public BigDecimal getTryAmount() {
    return tryAmount;
  }

  public void setTryAmount(BigDecimal tryAmount) {
    this.tryAmount = tryAmount;
  }

  public BigDecimal getNetPrice() {
    return netPrice;
  }

  public void setNetPrice(BigDecimal netPrice) {
    this.netPrice = netPrice;
  }

  public BigDecimal getMoney() {
    return money;
  }

  public void setMoney(BigDecimal money) {
    this.money = money;
  }

}
