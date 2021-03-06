package com.tl.resource.dao;

import com.tl.resource.dao.pojo.TMatAccountsInfor;
import com.tl.resource.dao.pojo.TMatAccountsInforExample;
import java.util.List;

public interface TMatAccountsInforDAO {

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	void insert(TMatAccountsInfor record);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	int updateByPrimaryKey(TMatAccountsInfor record);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	int updateByPrimaryKeySelective(TMatAccountsInfor record);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	List selectByExample(TMatAccountsInforExample example);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	TMatAccountsInfor selectByPrimaryKey(String id);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	int deleteByExample(TMatAccountsInforExample example);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	int countByExample(TMatAccountsInforExample example);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	int updateByExampleSelective(TMatAccountsInfor record,
			TMatAccountsInforExample example);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	int updateByExample(TMatAccountsInfor record,
			TMatAccountsInforExample example);
}