package com.tl.resource.dao;

import com.tl.resource.dao.pojo.TAuditContentFlowDetailGx;
import com.tl.resource.dao.pojo.TAuditContentFlowDetailGxExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TAuditContentFlowDetailGxDAOImpl extends SqlMapClientDaoSupport implements TAuditContentFlowDetailGxDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_flow_detail_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public TAuditContentFlowDetailGxDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_flow_detail_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public int countByExample(TAuditContentFlowDetailGxExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("t_audit_content_flow_detail_gx.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_flow_detail_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public int deleteByExample(TAuditContentFlowDetailGxExample example) {
        int rows = getSqlMapClientTemplate().delete("t_audit_content_flow_detail_gx.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_flow_detail_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public void insert(TAuditContentFlowDetailGx record) {
        getSqlMapClientTemplate().insert("t_audit_content_flow_detail_gx.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_flow_detail_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public void insertSelective(TAuditContentFlowDetailGx record) {
        getSqlMapClientTemplate().insert("t_audit_content_flow_detail_gx.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_flow_detail_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public List selectByExample(TAuditContentFlowDetailGxExample example) {
        List list = getSqlMapClientTemplate().queryForList("t_audit_content_flow_detail_gx.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_flow_detail_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public int updateByExampleSelective(TAuditContentFlowDetailGx record, TAuditContentFlowDetailGxExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("t_audit_content_flow_detail_gx.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_flow_detail_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public int updateByExample(TAuditContentFlowDetailGx record, TAuditContentFlowDetailGxExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("t_audit_content_flow_detail_gx.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table t_audit_content_flow_detail_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    private static class UpdateByExampleParms extends TAuditContentFlowDetailGxExample {
        private Object record;

        public UpdateByExampleParms(Object record, TAuditContentFlowDetailGxExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}