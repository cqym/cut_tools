package com.tl.resource.dao;

import com.tl.resource.dao.pojo.TProductSource;
import com.tl.resource.dao.pojo.TProductSourceExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TProductSourceDAOImpl extends SqlMapClientDaoSupport implements TProductSourceDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_source
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    public TProductSourceDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_source
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    public int countByExample(TProductSourceExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("t_product_source.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_source
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    public int deleteByExample(TProductSourceExample example) {
        int rows = getSqlMapClientTemplate().delete("t_product_source.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_source
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    public int deleteByPrimaryKey(String id) {
        TProductSource key = new TProductSource();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("t_product_source.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_source
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    public void insert(TProductSource record) {
        getSqlMapClientTemplate().insert("t_product_source.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_source
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    public void insertSelective(TProductSource record) {
        getSqlMapClientTemplate().insert("t_product_source.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_source
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    public List selectByExample(TProductSourceExample example) {
        List list = getSqlMapClientTemplate().queryForList("t_product_source.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_source
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    public TProductSource selectByPrimaryKey(String id) {
        TProductSource key = new TProductSource();
        key.setId(id);
        TProductSource record = (TProductSource) getSqlMapClientTemplate().queryForObject("t_product_source.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_source
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    public int updateByExampleSelective(TProductSource record, TProductSourceExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("t_product_source.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_source
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    public int updateByExample(TProductSource record, TProductSourceExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("t_product_source.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_source
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    public int updateByPrimaryKeySelective(TProductSource record) {
        int rows = getSqlMapClientTemplate().update("t_product_source.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_source
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    public int updateByPrimaryKey(TProductSource record) {
        int rows = getSqlMapClientTemplate().update("t_product_source.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table t_product_source
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    private static class UpdateByExampleParms extends TProductSourceExample {
        private Object record;

        public UpdateByExampleParms(Object record, TProductSourceExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }

	@Override
	public List<TProductSource> getProSourceByName(String name) {
		return this.getSqlMapClientTemplate().queryForList("t_product_source.getProSourceByName", name);
	}

	@Override
	public List<TProductSource> getProSourceByAll() {
		return this.getSqlMapClientTemplate().queryForList("t_product_source.getProSourceByAll");
	}
}