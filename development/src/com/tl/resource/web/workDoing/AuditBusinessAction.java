package com.tl.resource.web.workDoing;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.tl.common.util.LoginInforUtil;
import com.tl.resource.business.dto.BusinessInforDto;
import com.tl.resource.business.dto.LoginInforDto;
import com.tl.resource.business.workDoing.AuditBusinessService;

public class AuditBusinessAction extends DispatchAction {
  private AuditBusinessService auditBusinessService;

  public ActionForward getAuditBusinessNodes(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    throws Exception {
    response.setCharacterEncoding("utf-8");
    PrintWriter out = response.getWriter();
    String pid = request.getParameter("node");
    LoginInforDto loginInfor = LoginInforUtil.getLoginInfor(request);
    List<BusinessInforDto> list = auditBusinessService.getBusinessDataInfor(pid, loginInfor);
    String rt = JSONArray.fromObject(list).toString();
    out.println(rt);
    out.flush();
    out.close();
    return null;
  }

  public AuditBusinessService getAuditBusinessService() {
    return auditBusinessService;
  }

  public void setAuditBusinessService(AuditBusinessService auditBusinessService) {
    this.auditBusinessService = auditBusinessService;
  }

}
