package com.springcloud.user.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springcloud.user.service.bean.UserInfo;

//@FeignClient(name = "springcloud.user.service", fallback = UserFeignClientFallBack.class)
@FeignClient(name = "springcloud.user.service",  fallbackFactory = UserFeignClientFallBackFactory.class)
public interface UserFeignClient {

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public UserInfo findById(@PathVariable("id") Long id);
}
