package com.lms.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import javax.swing.JOptionPane;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lms.dao.impl.LsshbDAO;
import com.lms.dao.impl.SzjlbDAO;
import com.lms.dao.impl.ZfdbhbDAO;
import com.lms.domain.Lsshb;
import com.lms.domain.Szjlb;
import com.lms.domain.Zfdbhb;

public class SubmitBaoHuo {
	// 更新上周记录表 szjlb
	// 插入历史报货表 lsbhb
	// 插入临时分店报货表 zfdbhb

	public static class Parameter {
		public Parameter() {
		}

		public Parameter(int num, int mdbh)
		{
			this.num = num;
			this.mdbh = mdbh;
			
		}

		private int num;

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		private int mdbh;

		public int getMdbh() {
			return mdbh;
		}

		public void setMdbh(int mdbh) {
			this.mdbh = mdbh;
		}

	}

	private SzjlbDAO szjlbDao;
	private LsshbDAO lsshbDao;
	private ZfdbhbDAO zfdbhbDao;

	public SubmitBaoHuo() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		szjlbDao = (SzjlbDAO) ctx.getBean("SzjlbDAO");
		lsshbDao = (LsshbDAO) ctx.getBean("LsshbDAO");
		zfdbhbDao = (ZfdbhbDAO) ctx.getBean("ZfdbhbDAO");
	}

	// public boolean submitBaoHuo(List<Szjlb> szjlb)
	public boolean submitBaoHuo(List<Parameter> par) {
		// 更新上周记录表 szjlb
		List<Szjlb> szjlb = szjlbDao.findByMdbh(par.get(0).getMdbh());
		try {
			int i = 0;
			for (Szjlb szjl : szjlb) {
				szjlb.get(i).setNum(par.get(i).getNum());
				i++;
			}
			List<Zfdbhb> Listzfd = zfdbhbDao.findByMdbh(szjlb.get(0).getMdbh());
			if (Listzfd.get(0).getIsSolve().equals("否"))
				return false;

			List<Szjlb> temp1 = szjlbDao.findByMdbh(szjlb.get(0).getMdbh());
			for (Szjlb szjl : temp1)
				szjlbDao.delete(szjl);
			for (Zfdbhb zf : Listzfd) {

				zfdbhbDao.delete(zf);
			}

			List<Szjlb> checkList;
			Lsshb lsshb;
			Zfdbhb zfdbhb;

			for (Szjlb sz : szjlb) {

				szjlbDao.save(sz);

				// 插入历史报货表 lsbhb

				lsshb = new Lsshb();
				lsshb.setMdbh(sz.getMdbh());
				lsshb.setNum(sz.getNum());
				lsshb.setXb(sz.getXb());
				lsshb.setXks(sz.getXks());
				lsshb.setTimes(new Date());

				lsshbDao.save(lsshb);

				zfdbhb = new Zfdbhb();
				zfdbhb.setMdbh(sz.getMdbh());
				zfdbhb.setNum(sz.getNum());
				zfdbhb.setXb(sz.getXb());
				zfdbhb.setXks(sz.getXks());
				zfdbhb.setPrice(sz.getPrice());
				zfdbhb.setTimes(new Date());
				zfdbhb.setIsSolve("是");
				zfdbhbDao.save(zfdbhb);
				// 更新临时分店报货表 zfdbhb

			}
			return true;

		} catch (Exception e) {
			return false;
		}
	}

}
