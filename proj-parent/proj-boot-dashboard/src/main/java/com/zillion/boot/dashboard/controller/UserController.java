package com.zillion.boot.dashboard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zillion.boot.dashboard.message.RespMessage;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags= {"01 user"})
@RequestMapping("/user")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	//TODO secret 工具待封装
	
	@ApiOperation("登录（用户名、密码）")
	@GetMapping("/login")
	public RespMessage<RespLogin> getLoginInfo(String username, String password) {
		logger.debug("getLoginInfo", username, password);
		RespLogin resp = new RespLogin();
		resp.setToken("tesk token");
		return new RespMessage<RespLogin>(resp);
	}
	
	@ApiOperation("登录（token）")
	@GetMapping("/check")
	public RespMessage<RespLogin> getLoginInfo(String token) {
		logger.debug("getLoginInfo", token);
		RespLogin resp = new RespLogin();
		resp.setToken("tesk token");
		return new RespMessage<RespLogin>(resp);
	}
}

class RespLogin {
	
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}