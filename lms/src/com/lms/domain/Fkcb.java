package com.lms.domain;

/**
 * Fkcb entity. @author MyEclipse Persistence Tools
 */

public class Fkcb implements java.io.Serializable {

	// Fields

	private Integer idfkcb;
	private String xks;
	private String xb;
	private Integer num;
	private Integer mdbh;

	// Constructors

	/** default constructor */
	public Fkcb() {
	}

	/** full constructor */
	public Fkcb(String xks, String xb, Integer num, Integer mdbh) {
		this.xks = xks;
		this.xb = xb;
		this.num = num;
		this.mdbh = mdbh;
	}

	// Property accessors

	public Integer getIdfkcb() {
		return this.idfkcb;
	}

	public void setIdfkcb(Integer idfkcb) {
		this.idfkcb = idfkcb;
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

	public Integer getMdbh() {
		return this.mdbh;
	}

	public void setMdbh(Integer mdbh) {
		this.mdbh = mdbh;
	}

}