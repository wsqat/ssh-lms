package com.lms.domain;

/**
 * Zdxxb entity. @author MyEclipse Persistence Tools
 */

public class Zdxxb implements java.io.Serializable {

	// Fields

	private Integer zdbh;
	private String zdmc;
	private String zdjl;
	private String lxdh;
	private String dz;

	// Constructors

	/** default constructor */
	public Zdxxb() {
	}

	/** minimal constructor */
	public Zdxxb(String zdmc) {
		this.zdmc = zdmc;
	}

	/** full constructor */
	public Zdxxb(String zdmc, String zdjl, String lxdh, String dz) {
		this.zdmc = zdmc;
		this.zdjl = zdjl;
		this.lxdh = lxdh;
		this.dz = dz;
	}

	// Property accessors

	public Integer getZdbh() {
		return this.zdbh;
	}

	public void setZdbh(Integer zdbh) {
		this.zdbh = zdbh;
	}

	public String getZdmc() {
		return this.zdmc;
	}

	public void setZdmc(String zdmc) {
		this.zdmc = zdmc;
	}

	public String getZdjl() {
		return this.zdjl;
	}

	public void setZdjl(String zdjl) {
		this.zdjl = zdjl;
	}

	public String getLxdh() {
		return this.lxdh;
	}

	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}

	public String getDz() {
		return this.dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

}