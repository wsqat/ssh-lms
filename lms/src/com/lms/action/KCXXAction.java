package com.lms.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.apache.struts2.ServletActionContext;

import com.lms.bean.Ckuxx;
import com.lms.domain.Fkcb;
import com.lms.domain.Good;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class KCXXAction extends ActionSupport {
	
	private int mdbh;
	
	private Ckuxx kcxx;
	
	
	
	public int getMdbh() {
		return mdbh;
	}



	public void setMdbh(int mdbh) {
		this.mdbh = mdbh;
	}



	public Ckuxx getKcxx() {
		return kcxx;
	}



	public void setKcxx(Ckuxx kcxx) {
		this.kcxx = kcxx;
	}

	

	public String execute() throws Exception{
		kcxx = new Ckuxx();
		HttpSession session = ServletActionContext.getRequest().getSession();
		this.setMdbh((Integer)session.getAttribute("mdbh"));
		
		Map request = (Map) ActionContext.getContext().get("request");
		
		//request.put("mdxxblist", mdxxblist);
		List<Fkcb> goodlist =  kcxx.lookmdkc(mdbh);
		
		for(Fkcb kcxx:goodlist)
		  {
				if(goodlist != null)
			  {

			      request.put("goodlist", goodlist);
			      
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
