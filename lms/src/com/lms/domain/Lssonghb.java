package com.lms.domain;

import java.util.Date;

/**
 * Lssonghb entity. @author MyEclipse Persistence Tools
 */

public class Lssonghb implements java.io.Serializable {

	// Fields

	private Integer id;
	private String xb;
	private String xks;
	private Integer num;
	private Integer mdbh;
	private Date times;
	private String sjmc;
	private String clpz;
	// Constructors

	/** default constructor */
	public Lssonghb() {
	}

	/** full constructor */
	public Lssonghb(String xb, String xks, Integer num, Integer mdbh,
			Date times, String sjmc, String clpz) {
		this.xb = xb;
		this.xks = xks;
		this.num = num;
		this.mdbh = mdbh;
		this.times = times;
		this.sjmc = sjmc;
		this.clpz = clpz;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getXb() {
		return this.xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public String getXks() {
		return this.xks;
	}

	public void setXks(String xks) {
		this.xks = xks;
	}

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getMdbh() {
		return this.mdbh;
	}

	public void setMdbh(Integer mdbh) {
		this.mdbh = mdbh;
	}

	public Date getTimes() {
		return this.times;
	}

	public void setTimes(Date times) {
		this.times = times;
	}

	public String getSjmc() {
		return this.sjmc;
	}

	public void setSjmc(String sjmc) {
		this.sjmc = sjmc;
	}

	public String getClpz() {
		return this.clpz;
	}

	public void setClpz(String clpz) {
		this.clpz = clpz;
	}

}