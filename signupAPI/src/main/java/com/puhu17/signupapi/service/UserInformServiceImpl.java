package com.puhu17.signupapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puhu17.signupapi.dto.UserInformDTO;
import com.puhu17.signupapi.entity.UserInformEntity;
import com.puhu17.signupapi.persistency.UserInformRepository;

@Service
public class UserInformServiceImpl implements UserInformService{
	@Autowired
	UserInformRepository userInformRepository;
	
	@Override
	public UserInformDTO getByUserId(String userid) {
		return userInformEntityToDTO(userInformRepository.getByUserId(userid));
	}

	@Override
	public UserInformDTO registUser(UserInformDTO userInformDTO) {		 
		return userInformEntityToDTO(userInformRepository.save(userInformDTOtoEntity(userInformDTO)));		
	}

	UserInformDTO userInformEntityToDTO(UserInformEntity userInformEntity){
		return UserInformDTO.builder().id(userInformEntity.getId()).
				userid(userInformEntity.getUserId()).email(userInformEntity.getEmail())
				.phone(userInformEntity.getPhone()).address(userInformEntity.getAddress()).
				agreed(userInformEntity.isAgreed()).build();
	}
	
	UserInformEntity userInformDTOtoEntity(UserInformDTO userInformDTO) {
		return UserInformEntity.builder().id(userInformDTO.getId()).userId(userInformDTO.getUserid())
				.email(userInformDTO.getEmail()).phone(userInformDTO.getPhone()).address(userInformDTO.getAddress())
				.agreed(userInformDTO.isAgreed()).build();
	}
}
