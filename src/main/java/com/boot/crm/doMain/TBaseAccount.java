package com.boot.crm.doMain;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * TBaseAccount entity. @author MyEclipse Persistence Tools
 */
//@Entity
//@Table(name = "t_base_account")
//public class TBaseAccount implements java.io.Serializable {
//
//	// Fields
//
//	private String accountid;
//	private String accounttype;
//	private String objectid;
//	private String yxzt;
//	private String loginname;
//	private String deviceid;
//	private String passwd;
//	private String islogin;
//	private Date logintine;
//	private String currenttoken;
//	private Integer errors;
//	private Date createtime;
//	private Date lastupdatetime;
//	private String lastupdateuser;
//	private String objectanme;
//	private String objectsex;
//	private String zjhm;
//	private String mobile;
//	private String hospitalid;
//	private String hospitalname;
//
//	// Constructors
//
//	/** default constructor */
//	public TBaseAccount() {
//	}
//
//	/** minimal constructor */
//	public TBaseAccount(String accountid) {
//		this.accountid = accountid;
//	}
//
//	/** full constructor */
//	public TBaseAccount(String accountid, String accounttype, String objectid,
//                        String yxzt, String loginname, String deviceid, String passwd,
//                        String islogin, Date logintine, String currenttoken,
//                        Integer errors, Timestamp createtime, Timestamp lastupdatetime,
//                        String lastupdateuser, String objectanme, String objectsex,
//                        String zjhm, String mobile, String hospitalid, String hospitalname) {
//		this.accountid = accountid;
//		this.accounttype = accounttype;
//		this.objectid = objectid;
//		this.yxzt = yxzt;
//		this.loginname = loginname;
//		this.deviceid = deviceid;
//		this.passwd = passwd;
//		this.islogin = islogin;
//		this.logintine = logintine;
//		this.currenttoken = currenttoken;
//		this.errors = errors;
//		this.createtime = createtime;
//		this.lastupdatetime = lastupdatetime;
//		this.lastupdateuser = lastupdateuser;
//		this.objectanme = objectanme;
//		this.objectsex = objectsex;
//		this.zjhm = zjhm;
//		this.mobile = mobile;
//		this.hospitalid = hospitalid;
//		this.hospitalname = hospitalname;
//	}
//
//	// Property accessors
//	@Id
//	@Column(name = "ACCOUNTID", unique = true, nullable = false, length = 50)
//	public String getAccountid() {
//		return this.accountid;
//	}
//
//	public void setAccountid(String accountid) {
//		this.accountid = accountid;
//	}
//
//	@Column(name = "ACCOUNTTYPE", length = 50)
//	public String getAccounttype() {
//		return this.accounttype;
//	}
//
//	public void setAccounttype(String accounttype) {
//		this.accounttype = accounttype;
//	}
//
//	@Column(name = "OBJECTID", length = 50)
//	public String getObjectid() {
//		return this.objectid;
//	}
//
//	public void setObjectid(String objectid) {
//		this.objectid = objectid;
//	}
//
//	@Column(name = "YXZT", length = 50)
//	public String getYxzt() {
//		return this.yxzt;
//	}
//
//	public void setYxzt(String yxzt) {
//		this.yxzt = yxzt;
//	}
//
//	@Column(name = "LOGINNAME", length = 50)
//	public String getLoginname() {
//		return this.loginname;
//	}
//
//	public void setLoginname(String loginname) {
//		this.loginname = loginname;
//	}
//
//	@Column(name = "DEVICEID", length = 50)
//	public String getDeviceid() {
//		return this.deviceid;
//	}
//
//	public void setDeviceid(String deviceid) {
//		this.deviceid = deviceid;
//	}
//
//	@Column(name = "PASSWD", length = 50)
//	public String getPasswd() {
//		return this.passwd;
//	}
//
//	public void setPasswd(String passwd) {
//		this.passwd = passwd;
//	}
//
//	@Column(name = "ISLOGIN", length = 1)
//	public String getIslogin() {
//		return this.islogin;
//	}
//
//	public void setIslogin(String islogin) {
//		this.islogin = islogin;
//	}
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name = "LOGINTINE", length = 19)
//	public Date getLogintine() {
//		return this.logintine;
//	}
//
//	public void setLogintine(Date logintine) {
//		this.logintine = logintine;
//	}
//
//	@Column(name = "CURRENTTOKEN", length = 50)
//	public String getCurrenttoken() {
//		return this.currenttoken;
//	}
//
//	public void setCurrenttoken(String currenttoken) {
//		this.currenttoken = currenttoken;
//	}
//
//	@Column(name = "ERRORS", precision = 4, scale = 0)
//	public Integer getErrors() {
//		return this.errors;
//	}
//
//	public void setErrors(Integer errors) {
//		this.errors = errors;
//	}
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name = "CREATETIME", length = 19)
//	public Date getCreatetime() {
//		return this.createtime;
//	}
//
//	public void setCreatetime(Date createtime) {
//		this.createtime = createtime;
//	}
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name = "LASTUPDATETIME", length = 19)
//	public Date getLastupdatetime() {
//		return this.lastupdatetime;
//	}
//
//	public void setLastupdatetime(Date lastupdatetime) {
//		this.lastupdatetime = lastupdatetime;
//	}
//
//	@Column(name = "LASTUPDATEUSER", length = 50)
//	public String getLastupdateuser() {
//		return this.lastupdateuser;
//	}
//
//	public void setLastupdateuser(String lastupdateuser) {
//		this.lastupdateuser = lastupdateuser;
//	}
//
//	@Column(name = "OBJECTANME", length = 50)
//	public String getObjectanme() {
//		return this.objectanme;
//	}
//
//	public void setObjectanme(String objectanme) {
//		this.objectanme = objectanme;
//	}
//
//	@Column(name = "OBJECTSEX", length = 50)
//	public String getObjectsex() {
//		return this.objectsex;
//	}
//
//	public void setObjectsex(String objectsex) {
//		this.objectsex = objectsex;
//	}
//
//	@Column(name = "ZJHM", length = 50)
//	public String getZjhm() {
//		return this.zjhm;
//	}
//
//	public void setZjhm(String zjhm) {
//		this.zjhm = zjhm;
//	}
//
//	@Column(name = "MOBILE", length = 50)
//	public String getMobile() {
//		return this.mobile;
//	}
//
//	public void setMobile(String mobile) {
//		this.mobile = mobile;
//	}
//
//	@Column(name = "HOSPITALID", length = 50)
//	public String getHospitalid() {
//		return this.hospitalid;
//	}
//
//	public void setHospitalid(String hospitalid) {
//		this.hospitalid = hospitalid;
//	}
//
//	@Column(name = "HOSPITALNAME", length = 50)
//	public String getHospitalname() {
//		return this.hospitalname;
//	}
//
//	public void setHospitalname(String hospitalname) {
//		this.hospitalname = hospitalname;
//	}
//
//}