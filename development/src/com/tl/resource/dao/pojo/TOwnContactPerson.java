package com.tl.resource.dao.pojo;

public class TOwnContactPerson {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column t_own_contact_person.id
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    private String id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column t_own_contact_person.customer_id
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    private String customerId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column t_own_contact_person.user_id
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    private String userId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column t_own_contact_person.user_name
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    private String userName;
    
    private String trueName;
    private String departName;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column t_own_contact_person.id
     *
     * @return the value of t_own_contact_person.id
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column t_own_contact_person.id
     *
     * @param id the value for t_own_contact_person.id
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column t_own_contact_person.customer_id
     *
     * @return the value of t_own_contact_person.customer_id
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column t_own_contact_person.customer_id
     *
     * @param customerId the value for t_own_contact_person.customer_id
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column t_own_contact_person.user_id
     *
     * @return the value of t_own_contact_person.user_id
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column t_own_contact_person.user_id
     *
     * @param userId the value for t_own_contact_person.user_id
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column t_own_contact_person.user_name
     *
     * @return the value of t_own_contact_person.user_name
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column t_own_contact_person.user_name
     *
     * @param userName the value for t_own_contact_person.user_name
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}
}