package com.puhu17.signupapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.puhu17.signupapi.dto.UserInformDTO;
import com.puhu17.signupapi.entity.UserInformEntity;
import com.puhu17.signupapi.service.UserInformService;

@RestController
public class RequestController {
	@Autowired
	UserInformService userInformService;

	@GetMapping("/userinform/{userid}")
	public String userFindbyId(@PathVariable(value="userid") String userid) {
		Gson gson = new Gson();
		UserInformDTO userInformDTO = userInformService.getByUserId(userid);
		if(userInformDTO !=null) {
			return gson.toJson(userInformDTO);
		}else {
			return "없음";
		}		
	}
	@PostMapping("/userinform")
	public String registerUser(@RequestBody UserInformDTO userInformDTO) {
		Gson gson = new Gson();
		UserInformDTO receivedDTO = userInformService.registUser(userInformDTO);
		if(receivedDTO != null) {
			return gson.toJson(receivedDTO);			
		}else {
			return "입력실패";
		}
	}

}
