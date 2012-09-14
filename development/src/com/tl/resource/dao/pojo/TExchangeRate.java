package com.tl.resource.dao.pojo;

import java.math.BigDecimal;

public class TExchangeRate {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column t_exchange_rate.id
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	private String id;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column t_exchange_rate.currency_name
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	private String currencyName;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column t_exchange_rate.currency_mark
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	private String currencyMark;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column t_exchange_rate.rate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	private BigDecimal rate = BigDecimal.ZERO;

	
	private int benchmark;
	
	
	public int getBenchmark() {
		return benchmark;
	}

	public void setBenchmark(int benchmark) {
		this.benchmark = benchmark;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column t_exchange_rate.id
	 * @return  the value of t_exchange_rate.id
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column t_exchange_rate.id
	 * @param id  the value for t_exchange_rate.id
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column t_exchange_rate.currency_name
	 * @return  the value of t_exchange_rate.currency_name
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public String getCurrencyName() {
		return currencyName;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column t_exchange_rate.currency_name
	 * @param currencyName  the value for t_exchange_rate.currency_name
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column t_exchange_rate.currency_mark
	 * @return  the value of t_exchange_rate.currency_mark
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public String getCurrencyMark() {
		return currencyMark;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column t_exchange_rate.currency_mark
	 * @param currencyMark  the value for t_exchange_rate.currency_mark
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public void setCurrencyMark(String currencyMark) {
		this.currencyMark = currencyMark;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column t_exchange_rate.rate
	 * @return  the value of t_exchange_rate.rate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public BigDecimal getRate() {
		return rate;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column t_exchange_rate.rate
	 * @param rate  the value for t_exchange_rate.rate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public void setRate(BigDecimal rate) {
		this.rate = rate;
		if(rate == null) this.rate = BigDecimal.ZERO;
	}
	
	public String getText(){
		return this.currencyName + "1:" + this.rate.doubleValue();
	}
}