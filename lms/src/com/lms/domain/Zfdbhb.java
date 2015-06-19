package com.lms.domain;

import java.util.Date;

/**
 * Zfdbhb entity. @author MyEclipse Persistence Tools
 */

public class Zfdbhb implements java.io.Serializable {

	// Fields

	private Integer id;
	private String xb;
	private String xks;
	private Integer num;
	private Float price;
	private Integer mdbh;
	private Date times;
	private String isSolve;

	// Constructors

	/** default constructor */
	public Zfdbhb() {
	}

	/** full constructor */
	public Zfdbhb(String xb, String xks, Integer num, Float price,
			Integer mdbh, Date times, String isSolve) {
		this.xb = xb;
		this.xks = xks;
		this.num = num;
		this.price = price;
		this.mdbh = mdbh;
		this.times = times;
		this.isSolve = isSolve;
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

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
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

	public String getIsSolve() {
		return this.isSolve;
	}

	public void setIsSolve(String isSolve) {
		this.isSolve = isSolve;
	}

}