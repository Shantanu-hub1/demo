package com.Ulearn.PackageService.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name="tbl_inst_package")
public class PackageEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PK_ID")
	private Long pkId;
	@Column(name="INST_ID")
	private Long instId;
	@Column(name = "PK_TYPE")
	private String pkType;
	@Column(name = "PK_NAME")
	private String pkName;
	@Column(name = "PK_FNAME")
	private String pkFname;
	@Column(name = "PK_NUSERS")
	private Long pkNusers;
	@Column(name="PK_VALIDITY_TYPE")
	private String pkValidityType;
	@Column(name="PK_VALIDITY_NUM")
	private int pkValidityNum;
	@Column(name="PK_CDATE")
	@JsonFormat(pattern =  "yyyy-MM-dd",shape = Shape.STRING)
	private Date pkCdate;
	@Column(name = "PK_COMMENT")
	private String pkComment;
	@Column(name = "PARENT_ID")
	private Long parrentId;
	@Column(name = "IS_ACTIVE")
	private int isActive;
	@Column(name = "IS_DELETED")
	private int isDeleted;
	@Column(name = "PK_STATUS")
	private String pkStatus;
	@Column(name="CREATED_ON")
	@JsonFormat(pattern =  "yyyy-MM-dd",shape = Shape.STRING)
	private Date createdOn;
	@Column(name="UPDATED_ON")
	@JsonFormat(pattern =  "yyyy-MM-dd",shape = Shape.STRING)
	private Date updatedOn;
	@ManyToOne
	@JoinColumn(name="INST_ID",insertable = false,updatable = false)
	private InstituteEntity instituteEntity;
	public PackageEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PackageEntity(Long pkId, Long instId, String pkType, String pkName, String pkFname, Long pkNusers,
			String pkValidityType, int pkValidityNum, Date pkCdate, String pkComment, Long parrentId, int isActive,
			int isDeleted, String pkStatus, Date createdOn, Date updatedOn) {
		super();
		this.pkId = pkId;
		this.instId = instId;
		this.pkType = pkType;
		this.pkName = pkName;
		this.pkFname = pkFname;
		this.pkNusers = pkNusers;
		this.pkValidityType = pkValidityType;
		this.pkValidityNum = pkValidityNum;
		this.pkCdate = pkCdate;
		this.pkComment = pkComment;
		this.parrentId = parrentId;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
		this.pkStatus = pkStatus;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}
	@Override
	public String toString() {
		return "PackageEntity [pkId=" + pkId + ", instId=" + instId + ", pkType=" + pkType + ", pkName=" + pkName
				+ ", pkFname=" + pkFname + ", pkNusers=" + pkNusers + ", pkValidityType=" + pkValidityType
				+ ", pkValidityNum=" + pkValidityNum + ", pkCdate=" + pkCdate + ", pkComment=" + pkComment
				+ ", parrentId=" + parrentId + ", isActive=" + isActive + ", isDeleted=" + isDeleted + ", pkStatus="
				+ pkStatus + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}
	public Long getPkId() {
		return pkId;
	}
	public void setPkId(Long pkId) {
		this.pkId = pkId;
	}
	public Long getInstId() {
		return instId;
	}
	public void setInstId(Long instId) {
		this.instId = instId;
	}
	public String getPkType() {
		return pkType;
	}
	public void setPkType(String pkType) {
		this.pkType = pkType;
	}
	public String getPkName() {
		return pkName;
	}
	public void setPkName(String pkName) {
		this.pkName = pkName;
	}
	public String getPkFname() {
		return pkFname;
	}
	public void setPkFname(String pkFname) {
		this.pkFname = pkFname;
	}
	public Long getPkNusers() {
		return pkNusers;
	}
	public void setPkNusers(Long pkNusers) {
		this.pkNusers = pkNusers;
	}
	public String getPkValidityType() {
		return pkValidityType;
	}
	public void setPkValidityType(String pkValidityType) {
		this.pkValidityType = pkValidityType;
	}
	public int getPkValidityNum() {
		return pkValidityNum;
	}
	public void setPkValidityNum(int pkValidityNum) {
		this.pkValidityNum = pkValidityNum;
	}
	public Date getPkCdate() {
		return pkCdate;
	}
	public void setPkCdate(Date pkCdate) {
		this.pkCdate = pkCdate;
	}
	public String getPkComment() {
		return pkComment;
	}
	public void setPkComment(String pkComment) {
		this.pkComment = pkComment;
	}
	public Long getParrentId() {
		return parrentId;
	}
	public void setParrentId(Long parrentId) {
		this.parrentId = parrentId;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getPkStatus() {
		return pkStatus;
	}
	public void setPkStatus(String pkStatus) {
		this.pkStatus = pkStatus;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	
}
