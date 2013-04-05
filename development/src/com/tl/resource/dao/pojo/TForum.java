package com.tl.resource.dao.pojo;

import java.util.Date;

public class TForum {
  public static final Integer THEME_TYPE = 0;

  public static final Integer FOLLOW_TYPE = 1;

  public static final Integer STATUS_WAIT_OP = 0;

  public static final Integer STATUS_END_OP = 1;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_forum.id
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  private String id;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_forum.title
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  private String title;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_forum.user_id
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  private String userId;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_forum.user_name
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  private String userName;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_forum.edit_date
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  private Date editDate;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_forum.status
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  private Integer status;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_forum.parent_id
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  private String parentId;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_forum.forum_type
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  private Integer forumType;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_forum.accept_User_Name
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  private String acceptUserName;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_forum.memo
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  private String memo;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_forum.process_Date
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  private Date processDate;

  /**
   * This field was generated by Apache iBATIS ibator.
   * This field corresponds to the database column t_forum.content
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  private String content;

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_forum.id
   *
   * @return the value of t_forum.id
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public String getId() {
    return id;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_forum.id
   *
   * @param id the value for t_forum.id
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_forum.title
   *
   * @return the value of t_forum.title
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public String getTitle() {
    return title;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_forum.title
   *
   * @param title the value for t_forum.title
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_forum.user_id
   *
   * @return the value of t_forum.user_id
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public String getUserId() {
    return userId;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_forum.user_id
   *
   * @param userId the value for t_forum.user_id
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_forum.user_name
   *
   * @return the value of t_forum.user_name
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public String getUserName() {
    return userName;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_forum.user_name
   *
   * @param userName the value for t_forum.user_name
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_forum.edit_date
   *
   * @return the value of t_forum.edit_date
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public Date getEditDate() {
    return editDate;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_forum.edit_date
   *
   * @param editDate the value for t_forum.edit_date
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public void setEditDate(Date editDate) {
    this.editDate = editDate;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_forum.status
   *
   * @return the value of t_forum.status
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public Integer getStatus() {
    return status;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_forum.status
   *
   * @param status the value for t_forum.status
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_forum.parent_id
   *
   * @return the value of t_forum.parent_id
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public String getParentId() {
    return parentId;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_forum.parent_id
   *
   * @param parentId the value for t_forum.parent_id
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_forum.forum_type
   *
   * @return the value of t_forum.forum_type
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public Integer getForumType() {
    return forumType;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_forum.forum_type
   *
   * @param forumType the value for t_forum.forum_type
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public void setForumType(Integer forumType) {
    this.forumType = forumType;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_forum.accept_User_Name
   *
   * @return the value of t_forum.accept_User_Name
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public String getAcceptUserName() {
    return acceptUserName;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_forum.accept_User_Name
   *
   * @param acceptUserName the value for t_forum.accept_User_Name
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public void setAcceptUserName(String acceptUserName) {
    this.acceptUserName = acceptUserName;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_forum.memo
   *
   * @return the value of t_forum.memo
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public String getMemo() {
    return memo;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_forum.memo
   *
   * @param memo the value for t_forum.memo
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public void setMemo(String memo) {
    this.memo = memo;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_forum.process_Date
   *
   * @return the value of t_forum.process_Date
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public Date getProcessDate() {
    return processDate;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_forum.process_Date
   *
   * @param processDate the value for t_forum.process_Date
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public void setProcessDate(Date processDate) {
    this.processDate = processDate;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method returns the value of the database column t_forum.content
   *
   * @return the value of t_forum.content
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public String getContent() {
    return content;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method sets the value of the database column t_forum.content
   *
   * @param content the value for t_forum.content
   *
   * @ibatorgenerated Sat Mar 30 16:44:11 CST 2013
   */
  public void setContent(String content) {
    this.content = content;
  }
}