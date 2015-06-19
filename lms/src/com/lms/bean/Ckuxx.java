package com.lms.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lms.dao.impl.FkcbDAO;
import com.lms.domain.Fkcb;


public class Ckuxx {
	
	private FkcbDAO fkcbDao;
	
	public Ckuxx()
	{
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");		  
		 fkcbDao = (FkcbDAO)ctx.getBean("FkcbDAO");
	}
		
	public List<Fkcb>lookmdkc(int mdbh)
	{		
		return  fkcbDao.findByMdbh(mdbh);
	}
	


}
