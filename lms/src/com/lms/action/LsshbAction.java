package com.lms.action;

import java.util.List;
import java.util.Map;

import com.lms.bean.Lshb;
import com.lms.domain.Lsshb;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/*浏览历史收货表*/
public class LsshbAction extends ActionSupport {
	 
	private int mdbh;
	
	private int rowsPerPage = 10;// 每页显示几条  
	  
    private int page = 1; // 默认当前页  
  
    private int totalPage;// 总共多少页  
  
    private int totalNum;// 总过多少条 
    
    
	public int getMdbh() {
		return mdbh;
	}

	public void setMdbh(int mdbh) {
		this.mdbh = mdbh;
	}

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

	public Lshb getLshb() {
		return lshb;
	}

	public void setLshb(Lshb lshb) {
		this.lshb = lshb;
	}

	private Lshb lshb;
	
	public String execute() throws Exception{
		
		this.setMdbh((Integer)ActionContext.getContext().getSession().get("mdbh"));
		Map request = (Map) ActionContext.getContext().get("request");
		/*if(request.get("page")!=null)
			this.setPage((Integer)request.get("page"));*/
		if(!((Integer)request.get("page")>0))
			this.setPage(1);
			
		lshb = new Lshb();
		List<Lsshb> lsshb = (List<Lsshb>)lshb.showShjl(mdbh, rowsPerPage, page);
		if(lsshb==null)
			return ERROR;
		
		//获取总条数
		this.setTotalNum(lshb.SumPage(mdbh));
		this.setTotalPage((int)(totalNum/rowsPerPage));
		
		if( ((Integer)request.get("page")>0) && ((Integer)request.get("page")<totalPage))
			this.setPage((Integer)request.get("page"));
		else
			this.setPage(1);
		request.put("page", page);
	    request.put("lsshb", lsshb);
	    request.put("totalPage", totalPage);
		
		return SUCCESS;
	}
	
}