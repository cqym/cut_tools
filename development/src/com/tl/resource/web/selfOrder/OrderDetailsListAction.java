package com.tl.resource.web.selfOrder;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.tl.common.util.PaginationSupport;
import com.tl.resource.business.contractOrder.ContractOrderService;
import com.tl.resource.business.dto.OrderDetialsDto;
import com.tl.resource.business.reserveOrder.ReserveOrderService;
import com.tl.resource.business.selfOrder.SelfOrderService;

public class OrderDetailsListAction extends Action{

	private SelfOrderService selfOrderService;
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub

		response.setContentType("text/html;charset=utf-8");
		String size = request.getParameter("limit") == null?"15":request.getParameter("limit");
		String start = request.getParameter("start") == null?"0":request.getParameter("start");
		int pageSize = Integer.parseInt(size);
		int startIndex = Integer.parseInt(start);
		String orderId = request.getParameter("orderId");
		Map<String, Object> parmMap = new HashMap<String, Object>();
		parmMap.put("orderId", orderId);
		parmMap.put("startIndex", startIndex);
		parmMap.put("pageSize", pageSize);
		int total = selfOrderService.getOrderDetialTotalCountByOrderId(orderId);
		List<OrderDetialsDto> orderDetail = selfOrderService.getOrderDetailsList(parmMap);
		PaginationSupport pageInfo  = new PaginationSupport(orderDetail,total,pageSize,startIndex);
		try {
			System.out.println("fsdfdsfsd-----");
			String pageInfoJson = JSONObject.fromObject(pageInfo).toString();
			System.out.println(pageInfoJson);
			PrintWriter out = response.getWriter();
			out.write(pageInfoJson);
			out.flush();
			out.close();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public SelfOrderService getSelfOrderService() {
		return selfOrderService;
	}

	public void setSelfOrderService(SelfOrderService selfOrderService) {
		this.selfOrderService = selfOrderService;
	}

	
	

}
