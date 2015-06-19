package com.lms.domain;

/**
 * Szjlb entity. @author MyEclipse Persistence Tools
 */

public class Szjlb implements java.io.Serializable {

	// Fields

	private Integer id;
	private String xks;
	private String xb;
	private Integer num;
	private Float price;
	private Integer mdbh;

	// Constructors

	/** default constructor */
	public Szjlb() {
	}

	/** full constructor */
	public Szjlb(String xks, String xb, Integer num, Float price, Integer mdbh) {
		this.xks = xks;
		this.xb = xb;
		this.num = num;
		this.price = price;
		this.mdbh = mdbh;
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

}