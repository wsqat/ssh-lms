package com.lms.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lms.dao.impl.MdxxbDAO;
import com.lms.domain.Mdxxb;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LookMdxxAction extends ActionSupport {
	
	private Mdxxb mdxx;
	
	
	
	public Mdxxb getMdxx() {
		return mdxx;
	}

	public void setMdxx(Mdxxb mdxx) {
		this.mdxx = mdxx;
	}

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String execute() throws Exception{
		
		HttpSession session = ServletActionContext.getRequest().getSession();
		this.setUsername(session.getAttribute("username").toString());
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过username，搜索门店信息
		MdxxbDAO mdxxbDao = (MdxxbDAO)ctx.getBean("MdxxbDAO"); 
		List<Mdxxb> mdxxblist = (List<Mdxxb>)mdxxbDao.findByMdjl(this.getUsername());
		
		Map request = (Map) ActionContext.getContext().get("request");
		
		request.put("mdxxblist", mdxxblist);
		
		//session.setAttribute("mdxxblist1",mdxxblist);
		
		
		//将门店编号存入session
		ActionContext.getContext().getSession().put("mdbh", mdxxblist.get(0).getMdbh());
		ActionContext.getContext().getSession().put("mdmc", mdxxblist.get(0).getMdmc());
		return SUCCESS;
	}
	
	//跳转至update.jsp
	public String redirect() throws Exception{
		HttpSession session = ServletActionContext.getRequest().getSession();
		this.setUsername(session.getAttribute("username").toString());
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过username，搜索门店信息
		MdxxbDAO mdxxbDao = (MdxxbDAO)ctx.getBean("MdxxbDAO"); 
		List<Mdxxb> mdxxblist = (List<Mdxxb>)mdxxbDao.findByMdjl(this.getUsername());
		
		Map request = (Map) ActionContext.getContext().get("request");
		
		request.put("mdxxblist", mdxxblist);
		return SUCCESS;
	}
	
	//更新
	public String update() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		this.setUsername(session.getAttribute("username").toString());
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过username，搜索门店信息
		MdxxbDAO mdxxbDao = (MdxxbDAO)ctx.getBean("MdxxbDAO"); 
		//更新
		mdxxbDao.attachDirty(mdxx);
		//读取
		List<Mdxxb> mdxxblist = (List<Mdxxb>)mdxxbDao.findByMdjl(this.getUsername());
		
		Map request = (Map) ActionContext.getContext().get("request");
		
		request.put("mdxxblist", mdxxblist);
		
		
		
		return SUCCESS;
	}
	
}
