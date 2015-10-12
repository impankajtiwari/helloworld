package com.pankajtiwari.dao.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author pankajtiwari
 */
@Entity
@Table(name="agency",schema="mts_sandiego")
public class Agency implements Serializable {

	private static final long serialVersionUID = 8646097527017274836L;
	
	@Id
    @Column(name="agency_id")
	private String agencyId;
	@Column(name="agency_phone")
	private String agencyPhone;
	@Column(name="agency_url")
	private String agencyURL;
	@Column(name="agency_name")
	private String agencyName;
	@Column(name="agency_timezone")
	private String agencyTimeZone;
	@Column(name="agency_lang")
	private String agencyLang;
	
	public String getAgencyPhone() {
		return agencyPhone;
	}
	public void setAgencyPhone(String agencyPhone) {
		this.agencyPhone = agencyPhone;
	}
	public String getAgencyURL() {
		return agencyURL;
	}
	public void setAgencyURL(String agencyURL) {
		this.agencyURL = agencyURL;
	}
	public String getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(String agencyId) {
		this.agencyId = agencyId;
	}
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public String getAgencyTimeZone() {
		return agencyTimeZone;
	}
	public void setAgencyTimeZone(String agencyTimeZone) {
		this.agencyTimeZone = agencyTimeZone;
	}
	public String getAgencyLang() {
		return agencyLang;
	}
	public void setAgencyLang(String agencyLang) {
		this.agencyLang = agencyLang;
	}
}
