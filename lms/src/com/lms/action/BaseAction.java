package com.lms.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements SessionAware, ServletRequestAware, ServletResponseAware {
	
	ActionContext context = ActionContext.getContext();
	HttpServletRequest request;
	HttpServletResponse response;
	SessionMap session;
	
	//获取request,response,session方式一，非IoC方式，不用实现SessionAware, ServletRequestAware, ServletResponseAware
	//ActionContext context = ActionContext.getContext();
	//HttpServletRequest request = (HttpServletRequest) context.get(ServletActionContext.HTTP_REQUEST);
	//HttpServletResponse response = (HttpServletResponse) context.get(ServletActionContext.HTTP_RESPONSE);
	//Map session = context.getSession();
	//SessionMap session = (SessionMap) context.get(ActionContext.SESSION);
	
	//获取request,response,session方式一，IoC方式，必须实现SessionAware, ServletRequestAware, ServletResponseAware
	public void setSession(Map map) {
		this.session = (SessionMap) map;
	}
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}
	
}
