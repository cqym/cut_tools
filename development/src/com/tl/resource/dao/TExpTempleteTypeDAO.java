package com.tl.resource.dao;

import com.tl.resource.dao.pojo.TExpTempleteType;
import com.tl.resource.dao.pojo.TExpTempleteTypeExample;
import java.util.List;

public interface TExpTempleteTypeDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table t_exp_templete_type
     *
     * @abatorgenerated Mon May 02 19:59:23 CST 2011
     */
    void insert(TExpTempleteType record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table t_exp_templete_type
     *
     * @abatorgenerated Mon May 02 19:59:23 CST 2011
     */
    int updateByPrimaryKey(TExpTempleteType record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table t_exp_templete_type
     *
     * @abatorgenerated Mon May 02 19:59:23 CST 2011
     */
    int updateByPrimaryKeySelective(TExpTempleteType record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table t_exp_templete_type
     *
     * @abatorgenerated Mon May 02 19:59:23 CST 2011
     */
    List selectByExample(TExpTempleteTypeExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table t_exp_templete_type
     *
     * @abatorgenerated Mon May 02 19:59:23 CST 2011
     */
    TExpTempleteType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table t_exp_templete_type
     *
     * @abatorgenerated Mon May 02 19:59:23 CST 2011
     */
    int deleteByExample(TExpTempleteTypeExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table t_exp_templete_type
     *
     * @abatorgenerated Mon May 02 19:59:23 CST 2011
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table t_exp_templete_type
     *
     * @abatorgenerated Mon May 02 19:59:23 CST 2011
     */
    int countByExample(TExpTempleteTypeExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table t_exp_templete_type
     *
     * @abatorgenerated Mon May 02 19:59:23 CST 2011
     */
    int updateByExampleSelective(TExpTempleteType record, TExpTempleteTypeExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table t_exp_templete_type
     *
     * @abatorgenerated Mon May 02 19:59:23 CST 2011
     */
    int updateByExample(TExpTempleteType record, TExpTempleteTypeExample example);
}