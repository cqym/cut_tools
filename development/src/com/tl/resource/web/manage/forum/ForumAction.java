package com.tl.resource.web.manage.forum;

import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.tl.common.util.LoginInforUtil;
import com.tl.common.util.PaginationSupport;
import com.tl.resource.business.dto.LoginInforDto;
import com.tl.resource.business.dto.UserDto;
import com.tl.resource.business.manage.ForumService;
import com.tl.resource.dao.pojo.TForum;

public class ForumAction extends DispatchAction {
  private ForumService forumService;

  public ActionForward addTheme(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    LoginInforDto loginInfor = LoginInforUtil.getLoginInfor(request);
    UserDto user = loginInfor.getUser();
    PrintWriter out = response.getWriter();
    TForum forum = (TForum) JSONObject.toBean(JSONObject.fromObject(request.getParameter("forum")), TForum.class);
    forum.setForumType(TForum.THEME_TYPE);
    forum.setEditDate(new Date());
    forum.setUserId(user.getId());
    forum.setStatus(TForum.STATUS_WAIT_OP);
    forum.setUserName(user.getUserName());
    forumService.add(forum);
    out.print("true");
    out.flush();
    out.close();
    return null;
  }

  public ActionForward followTheme(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    LoginInforDto loginInfor = LoginInforUtil.getLoginInfor(request);
    UserDto user = loginInfor.getUser();
    PrintWriter out = response.getWriter();
    TForum forum = (TForum) JSONObject.toBean(JSONObject.fromObject(request.getParameter("forum")), TForum.class);
    forum.setForumType(TForum.FOLLOW_TYPE);
    forum.setEditDate(new Date());
    forum.setUserId(user.getId());
    forum.setUserName(user.getUserName());
    forumService.add(forum);
    out.print("true");
    out.flush();
    out.close();
    return null;
  }

  public ActionForward update(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    LoginInforDto loginInfor = LoginInforUtil.getLoginInfor(request);
    UserDto user = loginInfor.getUser();
    PrintWriter out = response.getWriter();
    TForum forum = (TForum) JSONObject.toBean(JSONObject.fromObject(request.getParameter("forum")), TForum.class);
    forumService.update(forum);
    out.print("true");
    out.flush();
    out.close();
    return null;
  }

  public ActionForward endById(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    LoginInforDto loginInfor = LoginInforUtil.getLoginInfor(request);
    PrintWriter out = response.getWriter();

    forumService.endById(request.getParameter("id"));
    out.print("true");
    out.flush();
    out.close();
    return null;
  }

  public ActionForward deleteById(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    PrintWriter out = response.getWriter();
    forumService.deleteById(request.getParameter("id"));
    out.print("true");
    out.flush();
    out.close();
    return null;
  }

  public ActionForward getFroumById(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    throws Exception {
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    PrintWriter out = response.getWriter();
    TForum f = forumService.getTForumById(request.getParameter("id"));
    out.print(JSONObject.fromObject(f));
    out.flush();
    out.close();
    return null;
  }

  public ActionForward forumThemeList(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    throws Exception {
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    PrintWriter out = response.getWriter();
    String startIndex = request.getParameter("start");
    String pageSize = request.getParameter("limit");
    if (startIndex == null) {
      startIndex = "0";
    }
    if (pageSize == null) {
      pageSize = "10";
    }
    Map<String, String> mparams = new HashMap<String, String>();
    mparams.put("title", request.getParameter("title"));
    mparams.put("status", request.getParameter("status"));
    mparams.put("forumType", request.getParameter("forumType"));
    mparams.put("parentId", request.getParameter("parentId"));

    PaginationSupport pageInfor = forumService.findForum4Page(mparams, Integer.valueOf(startIndex), Integer.valueOf(pageSize));
    out.println(JSONObject.fromObject(pageInfor).toString());
    out.flush();
    out.close();
    return null;
  }

  public ForumService getForumService() {
    return forumService;
  }

  public void setForumService(ForumService forumService) {
    this.forumService = forumService;
  }

}
