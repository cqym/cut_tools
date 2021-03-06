package com.tl.resource.dao;

import com.tl.resource.dao.pojo.TAuditInstance;
import com.tl.resource.dao.pojo.TAuditInstanceExample;
import java.util.List;

public interface TAuditInstanceDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_instance
     *
     * @ibatorgenerated Tue Oct 20 11:57:32 CST 2009
     */
    int countByExample(TAuditInstanceExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_instance
     *
     * @ibatorgenerated Tue Oct 20 11:57:32 CST 2009
     */
    int deleteByExample(TAuditInstanceExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_instance
     *
     * @ibatorgenerated Tue Oct 20 11:57:32 CST 2009
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_instance
     *
     * @ibatorgenerated Tue Oct 20 11:57:32 CST 2009
     */
    void insert(TAuditInstance record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_instance
     *
     * @ibatorgenerated Tue Oct 20 11:57:32 CST 2009
     */
    void insertSelective(TAuditInstance record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_instance
     *
     * @ibatorgenerated Tue Oct 20 11:57:32 CST 2009
     */
    List selectByExample(TAuditInstanceExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_instance
     *
     * @ibatorgenerated Tue Oct 20 11:57:32 CST 2009
     */
    TAuditInstance selectByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_instance
     *
     * @ibatorgenerated Tue Oct 20 11:57:32 CST 2009
     */
    int updateByExampleSelective(TAuditInstance record, TAuditInstanceExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_instance
     *
     * @ibatorgenerated Tue Oct 20 11:57:32 CST 2009
     */
    int updateByExample(TAuditInstance record, TAuditInstanceExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_instance
     *
     * @ibatorgenerated Tue Oct 20 11:57:32 CST 2009
     */
    int updateByPrimaryKeySelective(TAuditInstance record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_instance
     *
     * @ibatorgenerated Tue Oct 20 11:57:32 CST 2009
     */
    int updateByPrimaryKey(TAuditInstance record);

	Integer getMinOrder(String auditInforId, String bussinessId);
	
	public List getAuditorsIns(String auditPersonId,String flowInforId,int startIndex,int pageSize);
	public int getAuditorsInsCount(String auditPersonId,String flowInforId);
}