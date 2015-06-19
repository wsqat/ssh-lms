package com.lms.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lms.bean.BaoHuo;
import com.lms.bean.Ckuxx;
import com.lms.bean.SubmitBaoHuo;
import com.lms.dao.impl.SzjlbDAO;
import com.lms.domain.Fkcb;
import com.lms.domain.Szjlb;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BhbAction extends ActionSupport {

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


	private int dbh;
	
	public int getDbh() {
		return dbh;
	}

	public void setDbh(int dbh) {
		this.dbh = dbh;
	}

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	private BaoHuo baohuo;
	
	
	
	public BaoHuo getBaohuo() {
		return baohuo;
	}

	public void setBaohuo(BaoHuo baohuo) {
		this.baohuo = baohuo;
	}

	private int money;
	
	
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	
	private Ckuxx kcxx;
	
	
	public Ckuxx getKcxx() {
		return kcxx;
	}

	public void setKcxx(Ckuxx kcxx) {
		this.kcxx = kcxx;
	}

	//生成报货表
	public String create() throws Exception{
		
		//kcxx = new Ckuxx();
		HttpSession session = ServletActionContext.getRequest().getSession();
		this.setDbh((Integer)session.getAttribute("mdbh"));
		
		Map request = (Map) ActionContext.getContext().get("request");
		
		baohuo = new BaoHuo();
		
		//request.put("mdxxblist", mdxxblist);
		List<Szjlb> baohuolist =  (List<Szjlb>) baohuo.baohuo(dbh, money);
		
		for(Szjlb resNum :baohuolist)
		  {
				if(baohuolist != null)
			  {
			      request.put("baohuolist", baohuolist);
				  return SUCCESS;
			  }
			  else
			  {
				  return ERROR;
			  }
		  }
		return SUCCESS;
	}
	
	//查询报货表
	public String execute() throws Exception
	{
		
		this.setDbh((Integer) ActionContext.getContext().getSession().get("mdbh"));
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		SzjlbDAO goodDao = (SzjlbDAO)ctx.getBean("SzjlbDAO");
		List<Szjlb> goodlist = (List<Szjlb>)goodDao.findByMdbh(dbh);
		
		//JOptionPane.showMessageDialog(null, "goodlist.get(0).getDbh():"+goodlist.get(0).getDbh());
		for(Szjlb szjlb:goodlist)
		  {
			  if(szjlb.getMdbh().equals(dbh))
			  {				  
				  Map request = (Map) ActionContext.getContext().get("request");  
			      request.put("goodlist", goodlist);
			      //JOptionPane.showMessageDialog(null, "goodlist.get(0).getDbh():"+goodlist.get(0).getDbh());
			      //JOptionPane.showMessageDialog(null, "goodlist.get(1).getDbh():"+goodlist.get(1).getDbh());
				  return SUCCESS;
			  }
			  else
			  {
				  return ERROR;
			  }
		  }
		
		//获取商品详情表
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("goodlist", goodlist);
		
		
		return SUCCESS;
		
	}
	
	
	//提交
	public String upload() throws Exception{
		
		  List<SubmitBaoHuo.Parameter>  lsshblist = new ArrayList<SubmitBaoHuo.Parameter>();
			  lsshblist.add(new SubmitBaoHuo.Parameter(num0,dbh));
			  lsshblist.add(new SubmitBaoHuo.Parameter(num1,dbh));
			  lsshblist.add(new SubmitBaoHuo.Parameter(num2,dbh));
			  lsshblist.add(new SubmitBaoHuo.Parameter(num3,dbh));
			  lsshblist.add(new SubmitBaoHuo.Parameter(num4,dbh));
			  lsshblist.add(new SubmitBaoHuo.Parameter(num5,dbh));
		SubmitBaoHuo sub = new SubmitBaoHuo();
		if(sub.submitBaoHuo(lsshblist))
			return SUCCESS;
		else
			return ERROR;
	}
	
	
}
