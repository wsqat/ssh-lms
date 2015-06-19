package com.lms.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lms.dao.impl.MdxxbDAO;
import com.lms.dao.impl.UserDAO;
import com.lms.domain.Mdxxb;
import com.lms.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	
	private User user;
	
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	private String username;
	
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}
	

	public String execute() throws Exception{
		  //读取session-username
		  this.setUsername(ActionContext.getContext().getSession().get("username").toString());
		
		  ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		  //JOptionPane.showMessageDialog(null, "dddddd");
		  UserDAO userdao = (UserDAO)ctx.getBean("UserDAO");
		  
		  List<User> userlist = (List<User>)userdao.findByUsername(username);
		  //JOptionPane.showMessageDialog(null, "hhhhhhhh");
				  
					
		  Map request = (Map) ActionContext.getContext().get("request");
		  request.put("userlist", userlist);
		  
		  return SUCCESS;
	}
	
	/*updatePUser*/
	//跳转至update.jsp
	public String redirect() throws Exception{
		
		HttpSession session = ServletActionContext.getRequest().getSession();
		this.setUsername(session.getAttribute("username").toString());
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过username，搜索门店信息
		UserDAO userDao = (UserDAO)ctx.getBean("UserDAO"); 
		List<User> userlist = (List<User>)userDao.findByUsername(username);
		
		Map request = (Map) ActionContext.getContext().get("request");
		
		request.put("userlist", userlist);
		return SUCCESS;
	}
	
	public String update() throws Exception{
		//读取session-username
		  this.setUsername(ActionContext.getContext().getSession().get("username").toString());
		
		  ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		  //JOptionPane.showMessageDialog(null, "dddddd");
		  UserDAO userdao = (UserDAO)ctx.getBean("UserDAO");
		  
		  //更新
		  userdao.attachDirty(user);
		  
		  List<User> userlist = (List<User>)userdao.findByUsername(username);
		  
		  //JOptionPane.showMessageDialog(null, "hhhhhhhh");
					
		  Map request = (Map) ActionContext.getContext().get("request");
		  request.put("userlist", userlist);
		  
		 return SUCCESS;
	}
		
		
}
