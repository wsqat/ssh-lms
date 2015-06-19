package com.lms.domain;

/**
 * Mdxxb entity. @author MyEclipse Persistence Tools
 */

public class Mdxxb implements java.io.Serializable {

	// Fields

	private Integer mdbh;
	private String mdmc;
	private String mdjl;
	private String lxdh;
	private String dz;

	// Constructors

	/** default constructor */
	public Mdxxb() {
	}

	/** full constructor */
	public Mdxxb(String mdmc, String mdjl, String lxdh, String dz) {
		this.mdmc = mdmc;
		this.mdjl = mdjl;
		this.lxdh = lxdh;
		this.dz = dz;
	}

	// Property accessors

	public Integer getMdbh() {
		return this.mdbh;
	}

	public void setMdbh(Integer mdbh) {
		this.mdbh = mdbh;
	}

	public String getMdmc() {
		return this.mdmc;
	}

	public void setMdmc(String mdmc) {
		this.mdmc = mdmc;
	}

	public String getMdjl() {
		return this.mdjl;
	}

	public void setMdjl(String mdjl) {
		this.mdjl = mdjl;
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