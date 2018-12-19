package com.springcloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/config")
@Api(value = "/")
@RefreshScope
public class ConfigController {

	@Value("${eureka.client.service-url.defaultZone}")
	private String name;

	@GetMapping("/name")
	public String name() {
		return name;
	}
}
