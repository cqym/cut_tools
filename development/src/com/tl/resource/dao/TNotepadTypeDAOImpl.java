package com.tl.resource.dao;

import com.tl.resource.dao.pojo.TNotepadType;
import com.tl.resource.dao.pojo.TNotepadTypeExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TNotepadTypeDAOImpl extends SqlMapClientDaoSupport implements TNotepadTypeDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad_type
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    public TNotepadTypeDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad_type
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    public int countByExample(TNotepadTypeExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("t_notepad_type.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad_type
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    public int deleteByExample(TNotepadTypeExample example) {
        int rows = getSqlMapClientTemplate().delete("t_notepad_type.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad_type
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    public int deleteByPrimaryKey(String id) {
        TNotepadType key = new TNotepadType();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("t_notepad_type.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad_type
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    public void insert(TNotepadType record) {
        getSqlMapClientTemplate().insert("t_notepad_type.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad_type
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    public void insertSelective(TNotepadType record) {
        getSqlMapClientTemplate().insert("t_notepad_type.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad_type
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    public List selectByExample(TNotepadTypeExample example) {
        List list = getSqlMapClientTemplate().queryForList("t_notepad_type.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad_type
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    public TNotepadType selectByPrimaryKey(String id) {
        TNotepadType key = new TNotepadType();
        key.setId(id);
        TNotepadType record = (TNotepadType) getSqlMapClientTemplate().queryForObject("t_notepad_type.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad_type
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    public int updateByExampleSelective(TNotepadType record, TNotepadTypeExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("t_notepad_type.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad_type
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    public int updateByExample(TNotepadType record, TNotepadTypeExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("t_notepad_type.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad_type
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    public int updateByPrimaryKeySelective(TNotepadType record) {
        int rows = getSqlMapClientTemplate().update("t_notepad_type.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad_type
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    public int updateByPrimaryKey(TNotepadType record) {
        int rows = getSqlMapClientTemplate().update("t_notepad_type.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table t_notepad_type
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    private static class UpdateByExampleParms extends TNotepadTypeExample {
        private Object record;

        public UpdateByExampleParms(Object record, TNotepadTypeExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}