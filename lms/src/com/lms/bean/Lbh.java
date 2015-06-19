package com.lms.bean;
/*历史报货表*/
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lms.dao.impl.LsbhbDAO;
import com.lms.domain.Lsbhb;

public class Lbh {
	
	private LsbhbDAO lsbhbDao;
	public Lbh()
	{
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");		  
		 lsbhbDao = (LsbhbDAO)ctx.getBean("LsbhbDAO");
	}
	
    private List<Lsbhb> lookbhjl(int mdbh)
    {   	
    	return lsbhbDao.findByMdbh(mdbh) ;
    }
    public List<Lsbhb> showbhjl(int mdbh,int pageSize,int pageNum)//返回空表示 该页是不存在数据
    {
    	List<Lsbhb> templist = lookbhjl(mdbh);
    	List<Lsbhb> reslist = new ArrayList<Lsbhb>();
    	
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
    public int sumPage(int mdbh)
    {
    	List<Lsbhb> templist = lookbhjl(mdbh);
    	return templist.size();
    }
}
