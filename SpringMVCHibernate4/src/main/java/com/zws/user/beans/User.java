package com.zws.user.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="PASSWD")
	private String passwd;
	
	@Column(name="STATE")
	private Integer state;
	
	@Column(name="CREATE_TIME")
	private Date createTime;
	
	@Column(name="UPDATE_TIME")
	private Date updateTime;
	
	@Column(name="DECRIPTION")
	private String description;
	
//	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
//	@JoinColumn(name="USER_ID")
//	private List<Address> addrs;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	public List<Address> getAddrs() {
//		return addrs;
//	}
//
//	public void setAddrs(List<Address> addrs) {
//		this.addrs = addrs;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getDescribe() {
		return description;
	}

	public void setDescribe(String describe) {
		this.description = describe;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passwd="
				+ passwd + ", state=" + state + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", describe=" + description + "]";
	}
}
