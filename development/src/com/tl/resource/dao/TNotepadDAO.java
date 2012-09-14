package com.tl.resource.dao;

import com.tl.resource.dao.pojo.TNotepad;
import com.tl.resource.dao.pojo.TNotepadExample;
import java.util.List;

public interface TNotepadDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    int countByExample(TNotepadExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    int deleteByExample(TNotepadExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    void insert(TNotepad record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    void insertSelective(TNotepad record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    List selectByExample(TNotepadExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    TNotepad selectByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    int updateByExampleSelective(TNotepad record, TNotepadExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    int updateByExample(TNotepad record, TNotepadExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    int updateByPrimaryKeySelective(TNotepad record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_notepad
     *
     * @ibatorgenerated Mon May 24 16:08:51 CST 2010
     */
    int updateByPrimaryKey(TNotepad record);
}