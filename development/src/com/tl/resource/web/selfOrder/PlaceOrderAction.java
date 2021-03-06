package com.tl.resource.web.selfOrder;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.tl.resource.business.selfOrder.SelfOrderService;
import com.tl.resource.dao.pojo.TOrderInfor;

public class PlaceOrderAction extends Action {

  private SelfOrderService selfOrderService;

  /**
   * 提交下单
   */
  @Override
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
    response.setContentType("text/html;charset=utf-8");
    String[] ids = request.getParameterValues("ids");
    if (ids != null && ids.length > 0) {
      for (int i = 0; i < ids.length; i++) {
        TOrderInfor order = new TOrderInfor();
        order.setId(ids[i]);
        order.setStatus(4);
        int rt = selfOrderService.PlaceOrder(order);
        if (rt == 0) {
          PrintWriter out = response.getWriter();
          out.write("{success : false, msg : '所下单据有数量为零的情况，下单失败！'}");
          out.flush();
          out.close();
          return null;
        }
      }
    }
    PrintWriter out = response.getWriter();
    out.write("{success : true, msg : '提交下单成功'}");
    out.flush();
    out.close();
    return null;
  }

  public SelfOrderService getSelfOrderService() {
    return selfOrderService;
  }

  public void setSelfOrderService(SelfOrderService selfOrderService) {
    this.selfOrderService = selfOrderService;
  }

}
