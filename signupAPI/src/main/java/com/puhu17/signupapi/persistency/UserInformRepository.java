package com.puhu17.signupapi.persistency;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.puhu17.signupapi.entity.UserInformEntity;

public interface UserInformRepository extends JpaRepository<UserInformEntity, String>{
	UserInformEntity getByUserId(String userId);
	UserInformEntity getById(String id);
	
}
