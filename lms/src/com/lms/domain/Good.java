package com.lms.domain;

/**
 * Good entity. @author MyEclipse Persistence Tools
 */

public class Good implements java.io.Serializable {

	// Fields

	private Integer xbh;
	private String xb;
	private String ks;
	private Integer ms;
	private String color;
	private Integer num;
	private Float price;
	private Integer dbh;

	// Constructors

	/** default constructor */
	public Good() {
	}

	/** full constructor */
	public Good(String xb, String ks, Integer ms, String color, Integer num,
			Float price, Integer dbh) {
		this.xb = xb;
		this.ks = ks;
		this.ms = ms;
		this.color = color;
		this.num = num;
		this.price = price;
		this.dbh = dbh;
	}

	// Property accessors

	public Integer getXbh() {
		return this.xbh;
	}

	public void setXbh(Integer xbh) {
		this.xbh = xbh;
	}

	public String getXb() {
		return this.xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public String getKs() {
		return this.ks;
	}

	public void setKs(String ks) {
		this.ks = ks;
	}

	public Integer getMs() {
		return this.ms;
	}

	public void setMs(Integer ms) {
		this.ms = ms;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public Integer getDbh() {
		return this.dbh;
	}

	public void setDbh(Integer dbh) {
		this.dbh = dbh;
	}

}