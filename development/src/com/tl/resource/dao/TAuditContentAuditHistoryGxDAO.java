package com.tl.resource.dao;

import com.tl.resource.dao.pojo.TAuditContentAuditHistoryGx;
import com.tl.resource.dao.pojo.TAuditContentAuditHistoryGxExample;
import java.util.List;

public interface TAuditContentAuditHistoryGxDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    int countByExample(TAuditContentAuditHistoryGxExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    int deleteByExample(TAuditContentAuditHistoryGxExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    void insert(TAuditContentAuditHistoryGx record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    void insertSelective(TAuditContentAuditHistoryGx record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    List selectByExample(TAuditContentAuditHistoryGxExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    int updateByExampleSelective(TAuditContentAuditHistoryGx record, TAuditContentAuditHistoryGxExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    int updateByExample(TAuditContentAuditHistoryGx record, TAuditContentAuditHistoryGxExample example);
}