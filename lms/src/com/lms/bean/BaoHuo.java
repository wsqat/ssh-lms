package com.lms.bean;

import java.util.ArrayList;
import java.util.List;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lms.dao.impl.SzjlbDAO;
import com.lms.domain.Szjlb;

public class BaoHuo {
	
	private List<Szjlb>res;
	private  SzjlbDAO szjlbdao;
	public BaoHuo()
	{
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");		  
	     szjlbdao = (SzjlbDAO)ctx.getBean("SzjlbDAO");
		 res = new ArrayList<Szjlb>();
	}
    
	public List<Szjlb> baohuo(int mdbh,int money)
	{
		  
		  List<Szjlb> listjl = szjlbdao.findByMdbh(mdbh);	
		  
		  List<Float> rate = new ArrayList<Float>();	  
		  float sumMoney = 0;
		  
		  for(Szjlb szjlb:listjl)
		  {			  
			  sumMoney += szjlb.getNum() * szjlb.getPrice();			  
		  }
		  
		  for(Szjlb szjlb:listjl)
		  {			  
			 float tempmoney = szjlb.getNum() * szjlb.getPrice();
			 float temprate = tempmoney / sumMoney;
			 rate.add(temprate);
	
		  }	
		  
		  int i = 0;
		  for(Szjlb szjlb:listjl)
		  {			  
			  float xiemoney = rate.get(i) * money;	
			  Szjlb tempres = new Szjlb();
			  int xieNum = (int)(xiemoney / szjlb.getPrice());		
			  tempres.setNum(xieNum);
			  tempres.setXks(szjlb.getXks());
			  tempres.setXb(szjlb.getXb());
              tempres.setPrice(szjlb.getPrice());             
			 // JOptionPane.showMessageDialog(null, xiemoney + " " + szjlb.getPrice());
			  res.add(tempres);
			  i++;
		  }	  			  
		return res;
	}
}