package com.lms.domain;

/**
 * Sjxxb entity. @author MyEclipse Persistence Tools
 */

public class Sjxxb implements java.io.Serializable {

	// Fields

	private Integer bh;
	private String xm;
	private String lxdh;
	private String isfree;

	// Constructors

	/** default constructor */
	public Sjxxb() {
	}

	/** full constructor */
	public Sjxxb(String xm, String lxdh, String isfree) {
		this.xm = xm;
		this.lxdh = lxdh;
		this.isfree = isfree;
	}

	// Property accessors

	public Integer getBh() {
		return this.bh;
	}

	public void setBh(Integer bh) {
		this.bh = bh;
	}

	public String getXm() {
		return this.xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getLxdh() {
		return this.lxdh;
	}

	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}

	public String getIsfree() {
		return this.isfree;
	}

	public void setIsfree(String isfree) {
		this.isfree = isfree;
	}

}