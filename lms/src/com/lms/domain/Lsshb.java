package com.lms.domain;

import java.util.Date;

/**
 * Lsshb entity. @author MyEclipse Persistence Tools
 */

public class Lsshb implements java.io.Serializable {

	// Fields

	private Integer idlsshb;
	private String xks;
	private String xb;
	private Integer num;
	private Date times;
	private Integer mdbh;

	// Constructors

	/** default constructor */
	public Lsshb() {
	}

	/** full constructor */
	public Lsshb(String xks, String xb, Integer num, Date times, Integer mdbh) {
		this.xks = xks;
		this.xb = xb;
		this.num = num;
		this.times = times;
		this.mdbh = mdbh;
	}

	// Property accessors

	public Integer getIdlsshb() {
		return this.idlsshb;
	}

	public void setIdlsshb(Integer idlsshb) {
		this.idlsshb = idlsshb;
	}

	public String getXks() {
		return this.xks;
	}

	public void setXks(String xks) {
		this.xks = xks;
	}

	public String getXb() {
		return this.xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Date getTimes() {
		return this.times;
	}

	public void setTimes(Date times) {
		this.times = times;
	}

	public Integer getMdbh() {
		return this.mdbh;
	}

	public void setMdbh(Integer mdbh) {
		this.mdbh = mdbh;
	}

}