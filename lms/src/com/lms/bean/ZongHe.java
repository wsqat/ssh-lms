package com.lms.bean;

import java.util.ArrayList;
import java.util.Date;

import org.apache.tomcat.util.bcel.classfile.Constant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import com.lms.dao.impl.ZfdbhbDAO;
import com.lms.dao.impl.ZlstjbDAO;
import com.lms.domain.Zfdbhb;
import com.lms.domain.Zlstjb;

public class ZongHe {

	private ZfdbhbDAO zfdbhbDao;
	private ZlstjbDAO zlstjDao;
	
	final String SPORTSSHOE = "ÔË¶¯Ð¬";
	final String RUNNINGSHOE = "ÅÜ²½Ð¬";
	final String LEISURESHOE = "ÐÝÏÐÐ¬";
	
	final String MALE = "ÄÐ";
	final String FEMALE = "Å®";
	
	final int MDNUM = 3;
	

	
	public ZongHe() {
		// TODO Auto-generated constructor stub
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");	
		 zfdbhbDao = (ZfdbhbDAO)ctx.getBean("ZfdbhbDAO");
		 zlstjDao = (ZlstjbDAO)ctx.getBean("ZlstjbDAO");
		 
	}
	public boolean zonghe()
	{
		List<Zlstjb> temp = zlstjDao.findAll();
		for(Zlstjb lstj: temp)
		{
			zlstjDao.delete(lstj);
		}
		List<Zfdbhb> totalList = new ArrayList<Zfdbhb>();
		List<Zlstjb> lstjList = new ArrayList<Zlstjb>();
		
		
		for(int mdindex = 1; mdindex <= MDNUM; mdindex++)
		{
			totalList = zfdbhbDao.findByMdbh(mdindex);
		
			for(Zfdbhb fdbh: totalList)
				UpdateList(lstjList,fdbh);				
				
		}
		
		
		for(Zlstjb lstj: lstjList)
		{
			zlstjDao.save(lstj);
		}
		
		return false;
	}
	private void UpdateList(List<Zlstjb> lstjList, Zfdbhb fdbh)
	{
		int i = 0;
		boolean find = false;
		for(Zlstjb lstj: lstjList)
		{
			if(lstj.getXb().equalsIgnoreCase(fdbh.getXb()) && lstj.getXks().equalsIgnoreCase(fdbh.getXks()) )
			{
				int num = lstj.getNum();
				lstjList.get(i).setNum(num + fdbh.getNum());
				Date date = new Date();
				lstjList.get(i).setTimes(date);
				find = true;
			}
			i++;
		}
		if(!find)
		{
			lstjList.add(new Zlstjb(fdbh.getXks(),fdbh.getXb(),fdbh.getNum(),new Date()));
						
		}
		
		
		
	}
}