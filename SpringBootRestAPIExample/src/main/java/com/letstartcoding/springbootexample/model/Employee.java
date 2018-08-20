package com.letstartcoding.springbootexample.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "EMPLOYEE_REGISTRATION_MANAGEMENT")
@EntityListeners(AuditingEntityListener.class)
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int iID;
	
	@NotBlank
	String sFIRST_NAME, sMIDDLE_NAME, sLAST_NAME, sEMAIL_ADDRESS, sDESIGNATION, sEMPLOYEE_CODE;
	
	 
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	Date dtCREATED_DATE, dtUPDATED_DATE;

	public int getiID() {
		return iID;
	}

	public void setiID(int iID) {
		this.iID = iID;
	}

	public String getsFIRST_NAME() {
		return sFIRST_NAME;
	}

	public void setsFIRST_NAME(String sFIRST_NAME) {
		this.sFIRST_NAME = sFIRST_NAME;
	}

	public String getsMIDDLE_NAME() {
		return sMIDDLE_NAME;
	}

	public void setsMIDDLE_NAME(String sMIDDLE_NAME) {
		this.sMIDDLE_NAME = sMIDDLE_NAME;
	}

	public String getsLAST_NAME() {
		return sLAST_NAME;
	}

	public void setsLAST_NAME(String sLAST_NAME) {
		this.sLAST_NAME = sLAST_NAME;
	}

	public String getsEMAIL_ADDRESS() {
		return sEMAIL_ADDRESS;
	}

	public void setsEMAIL_ADDRESS(String sEMAIL_ADDRESS) {
		this.sEMAIL_ADDRESS = sEMAIL_ADDRESS;
	}

	public String getsDESIGNATION() {
		return sDESIGNATION;
	}

	public void setsDESIGNATION(String sDESIGNATION) {
		this.sDESIGNATION = sDESIGNATION;
	}

	public String getsEMPLOYEE_CODE() {
		return sEMPLOYEE_CODE;
	}

	public void setsEMPLOYEE_CODE(String sEMPLOYEE_CODE) {
		this.sEMPLOYEE_CODE = sEMPLOYEE_CODE;
	}

	public Date getDtCREATED_DATE() {
		return dtCREATED_DATE;
	}

	public void setDtCREATED_DATE(Date dtCREATED_DATE) {
		this.dtCREATED_DATE = dtCREATED_DATE;
	}

	public Date getDtUPDATED_DATE() {
		return dtUPDATED_DATE;
	}

	public void setDtUPDATED_DATE(Date dtUPDATED_DATE) {
		this.dtUPDATED_DATE = dtUPDATED_DATE;
	}

}
