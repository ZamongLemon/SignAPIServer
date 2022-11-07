package com.puhu17.signupapi.service;

import java.util.List;

import com.puhu17.signupapi.dto.UserInformDTO;
import com.puhu17.signupapi.entity.UserInformEntity;

public interface UserInformService {
	public UserInformDTO getByUserId(String userid);
	public UserInformDTO registUser(UserInformDTO userInformDTO);
}
