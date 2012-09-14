package com.tl.resource.dao;

import com.tl.resource.dao.pojo.TMatReserveInfor;
import com.tl.resource.dao.pojo.TMatReserveInforExample;
import java.util.List;

public interface TMatReserveInforDAO {

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_reserve_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	void insert(TMatReserveInfor record);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_reserve_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	int updateByPrimaryKey(TMatReserveInfor record);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_reserve_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	int updateByPrimaryKeySelective(TMatReserveInfor record);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_reserve_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	List selectByExample(TMatReserveInforExample example);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_reserve_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	TMatReserveInfor selectByPrimaryKey(String id);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_reserve_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	int deleteByExample(TMatReserveInforExample example);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_reserve_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_reserve_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	int countByExample(TMatReserveInforExample example);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_reserve_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	int updateByExampleSelective(TMatReserveInfor record,
			TMatReserveInforExample example);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_reserve_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	int updateByExample(TMatReserveInfor record, TMatReserveInforExample example);
}