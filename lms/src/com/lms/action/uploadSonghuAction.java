package com.lms.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lms.bean.Lbh;
import com.lms.bean.Solvefbh;
import com.lms.bean.tempSong;
import com.lms.dao.impl.MdxxbDAO;
import com.lms.dao.impl.ZdxxbDAO;
import com.lms.dao.impl.ZlstjbDAO;
import com.lms.domain.Lsbhb;
import com.lms.domain.Lsshb;
import com.lms.domain.Lssonghb;
import com.lms.domain.Mdxxb;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class uploadSonghuAction extends ActionSupport{
	
	
	private int rowsPerPage = 10;// 每页显示几条  
	  
   private int page = 1; // 默认当前页  
 
   private int totalPage;// 总共多少页  
 
   private int totalNum;// 总过多少条 
   
   

public int getRowsPerPage() {
	return rowsPerPage;
}

public void setRowsPerPage(int rowsPerPage) {
	this.rowsPerPage = rowsPerPage;
}

public int getPage() {
	return page;
}

public void setPage(int page) {
	this.page = page;
}

public int getTotalPage() {
	return totalPage;
}

public void setTotalPage(int totalPage) {
	this.totalPage = totalPage;
}

public int getTotalNum() {
	return totalNum;
}

public void setTotalNum(int totalNum) {
	this.totalNum = totalNum;
}

public Solvefbh getSolvefbh() {
	return solvefbh;
}

public void setSolvefbh(Solvefbh solvefbh) {
	this.solvefbh = solvefbh;
}

	private Solvefbh solvefbh = new Solvefbh();
	
	public String execute() throws Exception{
		
		//JOptionPane.showMessageDialog(null, "6666");
		Map request = (Map) ActionContext.getContext().get("request");
		//JOptionPane.showMessageDialog(null, "8888");
		
		List<Lssonghb> songbhList= solvefbh.solvefbh();
		
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");		  
		 MdxxbDAO mdxxbDao = (MdxxbDAO)ctx.getBean("MdxxbDAO");
	   
		 
		 
		 List<tempSong> ListSongres = new ArrayList<tempSong>();
		 
		 
		
		
		if(!((Integer)request.get("page")>0))
			this.setPage(1);
		
		List<Lssonghb> songbhlist= solvefbh.showSong(songbhList,rowsPerPage,page);

		
		
		if(songbhlist==null)
			return ERROR;

		
		 for(Lssonghb temp: songbhlist)
		 {
			 tempSong song = new tempSong();
			 song.setId(temp.getId());
			 song.setMdbh(temp.getMdbh());
			 Mdxxb mdxxb = mdxxbDao.findById(temp.getMdbh());
			 song.setMdmc(mdxxb.getMdmc());
			 song.setNum(temp.getNum());
			 song.setTimes(temp.getTimes());
			 song.setXb(temp.getXb());
			 song.setXks(temp.getXks());
			 song.setSjmc(temp.getSjmc());
			 song.setClpz(temp.getClpz());
			 ListSongres.add(song);
		 }
		
		//获取总条数
		this.setTotalNum(solvefbh.pageNum(songbhList));
		
		//JOptionPane.showMessageDialog(null, "totalNum: "+totalNum);
		this.setTotalPage((int)(totalNum/rowsPerPage));
		
		if( ((Integer)request.get("page")>0) && ((Integer)request.get("page")<totalPage))
			this.setPage((Integer)request.get("page"));  
		else
			this.setPage(1);
		request.put("page", page);
		request.put("songbhlist", songbhlist);
	    request.put("totalPage", totalPage);
		return SUCCESS;
		

	}
}
