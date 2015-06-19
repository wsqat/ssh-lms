package com.lms.domain;

/**
 * Clxxb entity. @author MyEclipse Persistence Tools
 */

public class Clxxb implements java.io.Serializable {

	// Fields

	private Integer bh;
	private String cph;
	private Integer zhl;
	private String isfree;

	// Constructors

	/** default constructor */
	public Clxxb() {
	}

	/** full constructor */
	public Clxxb(String cph, Integer zhl, String isfree) {
		this.cph = cph;
		this.zhl = zhl;
		this.isfree = isfree;
	}

	// Property accessors

	public Integer getBh() {
		return this.bh;
	}

	public void setBh(Integer bh) {
		this.bh = bh;
	}

	public String getCph() {
		return this.cph;
	}

	public void setCph(String cph) {
		this.cph = cph;
	}

	public Integer getZhl() {
		return this.zhl;
	}

	public void setZhl(Integer zhl) {
		this.zhl = zhl;
	}

	public String getIsfree() {
		return this.isfree;
	}

	public void setIsfree(String isfree) {
		this.isfree = isfree;
	}

}