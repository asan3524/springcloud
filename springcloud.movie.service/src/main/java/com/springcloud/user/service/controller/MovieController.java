package com.springcloud.user.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.user.service.bean.UserInfo;
import com.springcloud.user.service.feign.UserFeignClient;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/movie")
@Api(value = "/")
public class MovieController {

	// @Autowired
	// private RestTemplate restTemplate;
	//
	// @GetMapping("/{id}")
	// @ApiOperation(value = "获取用户", notes = "根据用户ID，获取用户详情")
	// public UserInfo findById(@PathVariable Long id) {
	// UserInfo user =
	// restTemplate.getForObject("http://springcloud.user.service/user/" + id,
	// UserInfo.class);
	// return user;
	// }

	@Autowired
	private UserFeignClient userFeignClient;

	// @HystrixCommand(fallbackMethod = "findByIdFallBack")
	@GetMapping("/{id}")
	@ApiOperation(value = "获取用户", notes = "根据用户ID，获取用户详情")
	public UserInfo findById(@PathVariable Long id) {
		System.out.println("---------------------");
		UserInfo user = userFeignClient.findById(id);
		return user;
	}

	// public UserInfo findByIdFallBack(Long id) {
	// UserInfo ui = new UserInfo();
	// ui.setAccount("fallback_account");
	// ui.setId(-1l);
	// ui.setUserAge(-1);
	// ui.setUserName("fallback_name");
	// return ui;
	// }
}
