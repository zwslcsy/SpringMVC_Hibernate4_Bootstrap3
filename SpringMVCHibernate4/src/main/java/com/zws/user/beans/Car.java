package com.zws.user.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="CAR")
@IdClass(CarId.class)
public class Car implements Serializable {

	private static final long serialVersionUID = -9070555750730788976L;

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Id
	private String code;
	
	@Column
	private String name;
	
	@Column
	private Integer type;
	
	@Column
	private String color;
	
	@Column(name="USER_ID")
	private Long userId;

	public Car() {}

	public Car(String name, Integer type, String color) {
		this.name = name;
		this.type = type;
		this.color = color;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", type=" + type + ", color=" + color + ", userId=" + userId + "]";
	}
	
}
