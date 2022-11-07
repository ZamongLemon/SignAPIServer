package com.puhu17.signupapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInformDTO {
	String id;
	String userid;
	String email;
	String phone;
	String address;
	boolean agreed;
	
}
