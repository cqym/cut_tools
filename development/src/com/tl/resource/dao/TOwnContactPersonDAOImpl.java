package com.tl.resource.dao;

import com.tl.resource.dao.pojo.TOwnContactPerson;
import com.tl.resource.dao.pojo.TOwnContactPersonExample;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TOwnContactPersonDAOImpl extends SqlMapClientDaoSupport implements TOwnContactPersonDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_own_contact_person
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public TOwnContactPersonDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_own_contact_person
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public int countByExample(TOwnContactPersonExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("t_own_contact_person.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_own_contact_person
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public int deleteByExample(TOwnContactPersonExample example) {
        int rows = getSqlMapClientTemplate().delete("t_own_contact_person.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_own_contact_person
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public int deleteByPrimaryKey(String id) {
        TOwnContactPerson key = new TOwnContactPerson();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("t_own_contact_person.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_own_contact_person
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public void insert(TOwnContactPerson record) {
        getSqlMapClientTemplate().insert("t_own_contact_person.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_own_contact_person
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public void insertSelective(TOwnContactPerson record) {
        getSqlMapClientTemplate().insert("t_own_contact_person.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_own_contact_person
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public List selectByExample(TOwnContactPersonExample example) {
        List list = getSqlMapClientTemplate().queryForList("t_own_contact_person.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_own_contact_person
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public TOwnContactPerson selectByPrimaryKey(String id) {
        TOwnContactPerson key = new TOwnContactPerson();
        key.setId(id);
        TOwnContactPerson record = (TOwnContactPerson) getSqlMapClientTemplate().queryForObject("t_own_contact_person.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_own_contact_person
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public int updateByExampleSelective(TOwnContactPerson record, TOwnContactPersonExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("t_own_contact_person.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_own_contact_person
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public int updateByExample(TOwnContactPerson record, TOwnContactPersonExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("t_own_contact_person.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_own_contact_person
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public int updateByPrimaryKeySelective(TOwnContactPerson record) {
        int rows = getSqlMapClientTemplate().update("t_own_contact_person.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_own_contact_person
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    public int updateByPrimaryKey(TOwnContactPerson record) {
        int rows = getSqlMapClientTemplate().update("t_own_contact_person.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table t_own_contact_person
     *
     * @ibatorgenerated Mon Sep 13 09:49:07 CST 2010
     */
    private static class UpdateByExampleParms extends TOwnContactPersonExample {
        private Object record;

        public UpdateByExampleParms(Object record, TOwnContactPersonExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }

	@Override
	public List<TOwnContactPerson> getSelectedUser(Map<String, Object> parmMap) {
		List<TOwnContactPerson> list = this.getSqlMapClientTemplate().queryForList("t_own_contact_person.getSelectedUser", parmMap);
		return list;
	}

	@Override
	public List<TOwnContactPerson> getWillSelectUser(Map<String, Object> parmMap) {
		List<TOwnContactPerson> list = this.getSqlMapClientTemplate().queryForList("t_own_contact_person.getWillSelectUser", parmMap);
		return list;
	}

	@Override
	public int getWillSelectUserCount(Map<String, Object> parmMap) {
		int cnt = (Integer)this.getSqlMapClientTemplate().queryForObject("t_own_contact_person.getWillSelectUserCount", parmMap);
		return cnt;
	}
}