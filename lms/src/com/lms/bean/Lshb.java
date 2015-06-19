package com.lms.bean;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lms.dao.impl.FkcbDAO;
import com.lms.dao.impl.LsshbDAO;
import com.lms.domain.Fkcb;
import com.lms.domain.Lsshb;

public class Lshb {
	
	private LsshbDAO lsshbDao; 
	private FkcbDAO fkcbDao;
	public Lshb()
	{
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");		  
		 lsshbDao = (LsshbDAO)ctx.getBean("LsshbDAO");
		 fkcbDao = (FkcbDAO)ctx.getBean("FkcbDAO");
	} 
    public List<Lsshb> lookshjl(int mdbh)
    {   	
    	return lsshbDao.findByMdbh(mdbh) ;
    }
    public List<Lsshb> showShjl(int mdbh,int pageSize,int pageNum)//返回空表示 该页是不存在数据
    {
    	List<Lsshb> templist = lookshjl(mdbh);
    	List<Lsshb> reslist = new ArrayList<Lsshb>();
    	
    	int i =  (pageNum - 1) * pageSize;
    	
    	if(i >= templist.size())
    	{
    		return null;
    	}
    	
    	for(;i < pageNum * pageSize && i < templist.size(); i++ )
    	{
    		reslist.add(templist.get(i));
    	}
    	return reslist;
    }
    public int SumPage(int mdbh)
    {
    	return lookshjl(mdbh).size();
    }
    public boolean lurushb(List<Lsshb> listlsshb)
    {
    	try
    	{
    		if(!updatefkcb(listlsshb))
    		{
    			return false;
    		}
   		    int i = 0;
    		for(Lsshb lssh : listlsshb)
    		{
    			lsshbDao.save(listlsshb.get(i));
    			i++;
    		}   		
    		return true;
    	}
    	catch(Exception e)
    	{
    		System.out.println("更新收货表出错");
    		return false;
    	}
    }
    private boolean updatefkcb(List<Lsshb> listlsshb)
    {
    	
    	try
    	{
    		List<Fkcb> fkcblist = fkcbDao.findByMdbh(listlsshb.get(0).getMdbh());
    		int i = 0;
    		for(Fkcb updkcp : fkcblist)
    		{
    			
    			int oldNum = updkcp.getNum();
    			int newNum = oldNum  + listlsshb.get(i).getNum();
    			fkcbDao.delete(updkcp);
    			updkcp.setNum(newNum);
    			fkcbDao.save(updkcp);
    			i++;
    		}
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
    }
	
}
