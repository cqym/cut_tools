package com.tl.resource.dao;

import com.tl.resource.dao.pojo.TBillsCodeDef;
import com.tl.resource.dao.pojo.TBillsCodeDefExample;
import java.util.List;

public interface TBillsCodeDefDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_bills_code_def
     *
     * @ibatorgenerated Sun Nov 22 16:19:50 CST 2009
     */
    int countByExample(TBillsCodeDefExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_bills_code_def
     *
     * @ibatorgenerated Sun Nov 22 16:19:50 CST 2009
     */
    int deleteByExample(TBillsCodeDefExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_bills_code_def
     *
     * @ibatorgenerated Sun Nov 22 16:19:50 CST 2009
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_bills_code_def
     *
     * @ibatorgenerated Sun Nov 22 16:19:50 CST 2009
     */
    void insert(TBillsCodeDef record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_bills_code_def
     *
     * @ibatorgenerated Sun Nov 22 16:19:50 CST 2009
     */
    void insertSelective(TBillsCodeDef record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_bills_code_def
     *
     * @ibatorgenerated Sun Nov 22 16:19:50 CST 2009
     */
    List selectByExample(TBillsCodeDefExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_bills_code_def
     *
     * @ibatorgenerated Sun Nov 22 16:19:50 CST 2009
     */
    TBillsCodeDef selectByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_bills_code_def
     *
     * @ibatorgenerated Sun Nov 22 16:19:50 CST 2009
     */
    int updateByExampleSelective(TBillsCodeDef record, TBillsCodeDefExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_bills_code_def
     *
     * @ibatorgenerated Sun Nov 22 16:19:50 CST 2009
     */
    int updateByExample(TBillsCodeDef record, TBillsCodeDefExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_bills_code_def
     *
     * @ibatorgenerated Sun Nov 22 16:19:50 CST 2009
     */
    int updateByPrimaryKeySelective(TBillsCodeDef record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_bills_code_def
     *
     * @ibatorgenerated Sun Nov 22 16:19:50 CST 2009
     */
    int updateByPrimaryKey(TBillsCodeDef record);
}