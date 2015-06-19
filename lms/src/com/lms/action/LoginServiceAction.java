package com.lms.action;

import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lms.dao.impl.UserDAO;
import com.lms.domain.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginServiceAction extends ActionSupport{
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
	  JOptionPane.showMessageDialog(null, "dddddd");
	  UserDAO userdao = (UserDAO)ctx.getBean("UserDAO");
	  
	  List<User> userlist = (List<User>)userdao.findByUsername(username);
	  JOptionPane.showMessageDialog(null, "hhhhhhhh");
	  if(userlist == null)
	  {
		  JOptionPane.showMessageDialog(null, "你他妈在逗我?");
	  }
	  for(User user:userlist)
	  {
		  if(user.getPassword().equals(password))
		  {
			  return SUCCESS;
		  }
		  else
		  {
			  return ERROR;
		  }
	  }
	  return ERROR;
  }
  
  
}
