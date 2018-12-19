package com.springcloud.user.service.feign;

import org.springframework.stereotype.Component;

import com.springcloud.user.service.bean.UserInfo;

@Component
public class UserFeignClientFallBack implements UserFeignClient {

	@Override
	public UserInfo findById(Long id) {
		// TODO Auto-generated method stub
		UserInfo ui = new UserInfo();
		ui.setAccount("Feign_fallback_account");
		ui.setId(-1l);
		ui.setUserAge(-1);
		ui.setUserName("Feign_fallback_name");
		return ui;
	}
}
