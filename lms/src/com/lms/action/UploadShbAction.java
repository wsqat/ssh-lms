package com.lms.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lms.bean.Lshb;
import com.lms.dao.impl.LsshbDAO;
import com.lms.dao.impl.SzjlbDAO;
import com.lms.domain.Lsshb;
import com.lms.domain.Szjlb;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UploadShbAction extends ActionSupport
{
	
	private String xb;
	private String xks;
	private int num0;
	private int num1;
	private int num2;
	private int num3;
	private int num4;
	private int num5;
	

	public int getNum0() {
		return num0;
	}

	public void setNum0(int num0) {
		this.num0 = num0;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	public int getNum4() {
		return num4;
	}

	public void setNum4(int num4) {
		this.num4 = num4;
	}

	public int getNum5() {
		return num5;
	}

	public void setNum5(int num5) {
		this.num5 = num5;
	}

	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public String getXks() {
		return xks;
	}

	public void setXks(String xks) {
		this.xks = xks;
	}

	

	public Lsshb getLsshb() {
		return lsshb;
	}

	public void setLsshb(Lsshb lsshb) {
		this.lsshb = lsshb;
	}


	private int dbh;
	
	public int getDbh() {
		return dbh;
	}

	public void setDbh(int dbh) {
		this.dbh = dbh;
	}

	
	private Lsshb lsshb;
	
	public Lsshb getLshb() {
		return lsshb;
	}

	public void setLshb(Lsshb lsshb) {
		this.lsshb = lsshb;
	}
	
	private Lshb lshb;  
	

		public void setLshb(Lshb lshb) {
		this.lshb = lshb;
	}

		//查询报货表
		public String execute() throws Exception
		{
			
			this.setDbh((Integer) ActionContext.getContext().getSession().get("mdbh"));
			
			/*HttpSession session = ServletActionContext.getRequest().getSession();
			this.setUsername(session.getAttribute("username").toString());
			JOptionPane.showMessageDialog(null, this.getUsername());*/
			
			ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
			//通过username，搜索门店信息
			/*MdxxbDAO mdxxbDao = (MdxxbDAO)ctx.getBean("MdxxbDAO"); 
			List<Mdxxb> mdxxblist = (List<Mdxxb>)mdxxbDao.findByMdjl(this.getUsername());
			//获取门店编号，
			this.setDbh(mdxxblist.get(0).getMdbh());*/
			
			SzjlbDAO szjlbDAO = (SzjlbDAO)ctx.getBean("SzjlbDAO");
			List<Szjlb> szjlblist = (List<Szjlb>)szjlbDAO.findByMdbh(dbh);
			
			//JOptionPane.showMessageDialog(null, "mdbh:"+dbh);
			
			for(Szjlb szjlb:szjlblist)
			  {
				  if(szjlb.getMdbh().equals(dbh))
				  {
					  Map request = (Map) ActionContext.getContext().get("request");  
				      request.put("lsshblist", szjlblist);
				      /*JOptionPane.showMessageDialog(null, "goodlist.get(0).getDbh():"+goodlist.get(0).getDbh());
				      JOptionPane.showMessageDialog(null, "goodlist.get(1).getDbh():"+goodlist.get(1).getDbh());*/
					  return SUCCESS;
				  }
				  else
				  {
					  return ERROR;
				  }
			  }
			
			//获取商品详情表
			/*Map request = (Map) ActionContext.getContext().get("request");
			request.put("goodlist", goodlist);*/
			
			
			return SUCCESS;
			
		}
		
		//上传报货表
		public String create() throws Exception{
			  
        	  //读取session-mdbh
			  this.setDbh((Integer) ActionContext.getContext().getSession().get("mdbh"));
			  
			  //JOptionPane.showMessageDialog(null, "dbh:"+dbh);
			  ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
			  //JOptionPane.showMessageDialog(null, "dddddd");
			  //LsshbDAO lsshbDAO = (LsshbDAO)ctx.getBean("LsshbDAO");
			  
			  Map request = (Map) ActionContext.getContext().get("request");
			  
			  //Date now = new Date();
			  //List<Lsshb> lsshblist = new ArrayList<Lsshb>();
			  
			  //JOptionPane.showMessageDialog(null, "num0:"+num0);
			
			  List<Lsshb> lsshblist = new ArrayList<Lsshb>();
			  Lshb lshb = new Lshb();
			  Date now = new Date();
			  Lsshb lsshb  = new Lsshb();
			  lsshb.setMdbh((int)dbh);
			  lsshb.setNum(num0);
			  lsshb.setXb("男");
			  lsshb.setXks("运动鞋");
			  lsshb.setTimes(now);
			  lsshblist.add(lsshb);
			  
			  //JOptionPane.showMessageDialog(null, "lsshb:"+lsshb);
			  
			  lsshb  = new Lsshb();
			  lsshb.setMdbh((int)dbh);
			  lsshb.setNum(num1);
			  lsshb.setXb("男");
			  lsshb.setXks("跑步鞋");
			  lsshb.setTimes(now);
			  lsshblist.add(lsshb);
			  
			  lsshb  = new Lsshb();
			  lsshb.setMdbh((int)dbh);
			  lsshb.setNum(num2);
			  lsshb.setXb("男");
			  lsshb.setXks("休闲鞋");
			  lsshb.setTimes(now);
			  lsshblist.add(lsshb);
			  
			  
			  lsshb  = new Lsshb();
			  lsshb.setMdbh((int)dbh);
			  lsshb.setNum(num3);
			  lsshb.setXb("女");
			  lsshb.setXks("运动鞋");
			  lsshb.setTimes(now);
			  lsshblist.add(lsshb);
			  
			  lsshb  = new Lsshb();
			  lsshb.setMdbh((int)dbh);
			  lsshb.setNum(num4);
			  lsshb.setXb("女");
			  lsshb.setXks("跑步鞋");
			  lsshb.setTimes(now);
			  lsshblist.add(lsshb);
			  
			  lsshb  = new Lsshb();
			  lsshb.setMdbh((int)dbh);
			  lsshb.setNum(num5);
			  lsshb.setXb("女");
			  lsshb.setXks("休闲鞋");
			  lsshb.setTimes(now);
			  lsshblist.add(lsshb);
			  boolean flag = lshb.lurushb(lsshblist);
			  if(flag){
				  
				  return SUCCESS;
			  }
			  else
				  return ERROR;

			  
			  //List<User> userlist = (List<User>)userdao.findByUsername(username);
			  
			  //JOptionPane.showMessageDialog(null, "hhhhhhhh");
						
			  //Map request = (Map) ActionContext.getContext().get("request");
			  //request.put("userlist", userlist);
		}

}
