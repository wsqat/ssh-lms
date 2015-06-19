package com.lms.domain;

import java.util.Date;

/**
 * Songhb entity. @author MyEclipse Persistence Tools
 */

public class Songhb implements java.io.Serializable {

	// Fields

	private Integer idbh;
	private Integer mdbh;
	private String sjbh;
	private String clbh;
	private Date times;

	// Constructors

	/** default constructor */
	public Songhb() {
	}

	/** full constructor */
	public Songhb(Integer mdbh, String sjbh, String clbh, Date times) {
		this.mdbh = mdbh;
		this.sjbh = sjbh;
		this.clbh = clbh;
		this.times = times;
	}

	// Property accessors

	public Integer getIdbh() {
		return this.idbh;
	}

	public void setIdbh(Integer idbh) {
		this.idbh = idbh;
	}

	public Integer getMdbh() {
		return this.mdbh;
	}

	public void setMdbh(Integer mdbh) {
		this.mdbh = mdbh;
	}

	public String getSjbh() {
		return this.sjbh;
	}

	public void setSjbh(String sjbh) {
		this.sjbh = sjbh;
	}

	public String getClbh() {
		return this.clbh;
	}

	public void setClbh(String clbh) {
		this.clbh = clbh;
	}

	public Date getTimes() {
		return this.times;
	}

	public void setTimes(Date times) {
		this.times = times;
	}

}