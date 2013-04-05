package com.tl.resource.business.manage;

import java.util.Map;

import com.tl.common.util.GenerateSerial;
import com.tl.common.util.PaginationSupport;
import com.tl.resource.dao.TForumDAO;
import com.tl.resource.dao.pojo.TForum;
import com.tl.resource.dao.pojo.TForumExample;
import com.tl.resource.dao.pojo.TForumExample.Criteria;

public class ForumServiceImp implements ForumService {
  private TForumDAO forumDao = null;

  @Override
  public void add(TForum forum) {
    forum.setId(GenerateSerial.getUUID());
    forumDao.insert(forum);
  }

  @Override
  public void deleteById(String id) {
    // TODO Auto-generated method stub
    forumDao.deleteByPrimaryKey(id);
  }

  @Override
  public PaginationSupport findForum4Page(Map<String, String> param, Integer startIndex, Integer pageSize) {
    TForumExample example = new TForumExample();
    Criteria c = example.createCriteria();
    if (param.get("forumType") != null) {
      c.andForumTypeEqualTo(Integer.valueOf(param.get("forumType")));
    }
    if (param.get("status") != null) {
      c.andStatusEqualTo(Integer.valueOf(param.get("status")));
    }
    if (param.get("title") != null) {
      c.andTitleLike("%" + param.get("title") + "%");
    }
    if (param.get("parentId") != null) {
      c.andParentIdEqualTo(param.get("parentId"));
    }
    example.setOrderByClause(" edit_date desc");
    return new PaginationSupport(forumDao.selectByExampleWithBLOBs(example), new Long(forumDao.countByExample(example)).intValue(), pageSize,
      startIndex);

  }

  @Override
  public void update(TForum forum) {
    // TODO Auto-generated method stub
    forumDao.updateByPrimaryKeySelective(forum);
  }

  public TForumDAO getForumDao() {
    return forumDao;
  }

  public void setForumDao(TForumDAO forumDao) {
    this.forumDao = forumDao;
  }

  public TForum getTForumById(String id) {
    // TODO Auto-generated method stub
    return forumDao.selectByPrimaryKey(id);
  }

  @Override
  public void endById(String id) {
    // TODO Auto-generated method stub
    TForum po = forumDao.selectByPrimaryKey(id);
    po.setStatus(TForum.STATUS_END_OP);
    forumDao.updateByPrimaryKeyWithoutBLOBs(po);
  }

}
