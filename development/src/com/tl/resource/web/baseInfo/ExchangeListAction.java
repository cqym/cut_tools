/**
 * 
 */
package com.tl.resource.web.baseInfo;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.tl.resource.business.baseInfo.BaseInfoService;
import com.tl.resource.dao.pojo.TExchangeRate;

/**
 * @author xtaia
 * 汇率列表信息
 */
public class ExchangeListAction extends Action {

	private BaseInfoService baseInfoService;

	public BaseInfoService getBaseInfoService() {
		return baseInfoService;
	}

	public void setBaseInfoService(BaseInfoService baseInfoService) {
		this.baseInfoService = baseInfoService;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.setContentType("text/html;charset=utf-8");

		String start = request.getParameter("start");
		String limit = request.getParameter("limit");
		
		
		Map<String, Object> parmMap = new HashMap<String, Object>();
		
		parmMap.put("start", Integer.parseInt(start));
		parmMap.put("limit", Integer.parseInt(limit));
		
		int total = baseInfoService.getExchangeTotal();
		
		List<TExchangeRate> list = baseInfoService.getExchangeByPage(parmMap);
		
		String jsonStr = JSONArray.fromObject(list).toString();
		String resultStr = "{totalProperty : " + total + ", exchangeList : "  + jsonStr + "}";
		
		
		PrintWriter out = response.getWriter();
		out.write(resultStr);
		out.flush();
		out.close();

		return null;
	}

}
