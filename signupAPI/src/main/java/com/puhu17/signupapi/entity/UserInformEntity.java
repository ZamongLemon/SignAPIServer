package com.puhu17.signupapi.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.type.UUIDCharType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="userinform")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInformEntity extends BaseEntity{
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid")
	private String id;
	@Column(name="userid",nullable=false,unique=true)
	private String userId;
	@Column(name="PASSWORD", nullable = true)
	private String password;
	@Column(name="email",nullable=false)
	private String email;
	@Column(name="address", nullable=true)
	private String address;
	@Column(name="phone", nullable=false)
	private String phone;
	@Column(name="agreed", nullable=false)
	private boolean agreed;
}
