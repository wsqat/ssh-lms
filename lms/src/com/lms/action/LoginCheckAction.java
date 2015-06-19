package com.lms.action;

import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lms.dao.impl.MdxxbDAO;
import com.lms.dao.impl.UserDAO;
import com.lms.domain.Mdxxb;
import com.lms.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginCheckAction extends ActionSupport{


public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

  private String username;
  private String password;

  
  public String execute() throws Exception
  {
	  
	  ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	  //JOptionPane.showMessageDialog(null, "dddddd");
	  UserDAO userdao = (UserDAO)ctx.getBean("UserDAO");
	  
	  List<User> userlist = (List<User>)userdao.findByUsername(username);
	  //JOptionPane.showMessageDialog(null, "hhhhhhhh");
	  if(userlist == null)
	  {
		  //JOptionPane.showMessageDialog(null, "你他妈在逗我?");
		  return ERROR;
	  }
	  for(User user:userlist)
	  {
		  if(user.getPassword().equals(password))
		  {
			  ActionContext.getContext().getSession().put("username", user.getUsername());
			  if(user.getUsername().compareTo("admin")==0){
//			      ActionContext.getContext().getSession().put("mdbh", "0");
			      ActionContext.getContext().getSession().put("mdmc", "总店");
			      return SUCCESS;
			  }
				  
			  //通过username，搜索门店信息
			  MdxxbDAO mdxxbDao = (MdxxbDAO)ctx.getBean("MdxxbDAO"); 
			  List<Mdxxb> mdxxblist = (List<Mdxxb>)mdxxbDao.findByMdjl(user.getUsername());
		
			  //JOptionPane.showMessageDialog(null, "dao");
			  
			  Map request = (Map) ActionContext.getContext().get("request");  
		      request.put("mdxxblist", mdxxblist);
		      //将门店编号存入session
		      ActionContext.getContext().getSession().put("mdbh", mdxxblist.get(0).getMdbh());
		      ActionContext.getContext().getSession().put("mdmc", mdxxblist.get(0).getMdmc());
			  
			  
			  return SUCCESS;
		  }
		  else
		  {
			  return ERROR;
		  }
	  }
	  return ERROR;
  }
  
  
  //注销系统
  public String logout() throws Exception{
	  return SUCCESS;
  }
  
}
