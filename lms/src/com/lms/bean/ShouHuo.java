package com.lms.bean;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lms.dao.impl.SzjlbDAO;
import com.lms.domain.Szjlb;

public class ShouHuo {
	private SzjlbDAO szjlbDao; 
	public ShouHuo()
	{
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");		  
		 szjlbDao = (SzjlbDAO)ctx.getBean("SzjlbDAO");
	} 
	public List<Szjlb>lookSzjlb(int mdbh)
	{
		List<Szjlb> res = szjlbDao.findByMdbh(mdbh);	
		return res;
	}

}
