package com.puhu17.signupapi;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.puhu17.signupapi.entity.UserInformEntity;
import com.puhu17.signupapi.persistency.UserInformRepository;

@SpringBootTest
public class JPATest {
	@Autowired
	UserInformRepository userInformRepository;

	// JPATestMethod
	// @Test
	public void insertTest() {
		System.out.println("실행");
		// 입력할 데이터를 담은 Entity
		UserInformEntity userInformEntity = UserInformEntity.builder().userId("kihyun").email("puhu17@gmail.com")
				.phone("01046414276").agreed(true).build();
		userInformRepository.save(userInformEntity);
		System.out.println("실행종료");
	}

	// @Test
	public void testSelect() {
//		List<UserInformEntity> select = userInformRepository.getByUserId("kihyun");
//		System.out.println(select);
	}

	// @Test
	public void deleteTest() {
//		UserInformEntity userInformEntity = UserInformEntity.builder().id("2c932081844ffd9801844ffd9eb00000").build();
//		userInformRepository.delete(userInformEntity);
//		Optional<UserInformEntity> optional = userInformRepository.findById("2c932081844ffd9801844ffd9eb00000");
//		if (optional.isPresent()) {
//			System.out.println(optional.get());
//		} else {
//			System.out.println("데이터 없음");
//		}
	}

	// @Test
	public void updateTest() {
//		List<UserInformEntity> select = userInformRepository.getByUserId("kihyun");
//		System.out.println(select);
//		select.get(0).setPassword("12124234512");
//		userInformRepository.save(select.get(0));
//		Optional<UserInformEntity> optional = userInformRepository.findById("2c932081845026be01845026c4f90000");
//		if (optional.isPresent()) {
//			System.out.println(optional.get());
//		} else {
//			System.out.println("데이터 없음");
//		}

	}
}
