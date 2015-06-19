package com.lms.domain;

import java.util.Date;

/**
 * Zlstjb entity. @author MyEclipse Persistence Tools
 */

public class Zlstjb implements java.io.Serializable {

	// Fields

	private Integer id;
	private String xks;
	private String xb;
	private Integer num;
	private Date times;

	// Constructors

	/** default constructor */
	public Zlstjb() {
	}

	/** full constructor */
	public Zlstjb(String xks, String xb, Integer num, Date times) {
		this.xks = xks;
		this.xb = xb;
		this.num = num;
		this.times = times;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

}