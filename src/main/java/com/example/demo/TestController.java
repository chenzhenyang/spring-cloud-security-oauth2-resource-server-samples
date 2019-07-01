package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private OAuth2RestTemplate oauth2RestTemplate;

	@PreAuthorize("#oauth2.hasScope('cloud_controller.read')")
	@RequestMapping("test")
	public String test() {
		System.out.println(oauth2RestTemplate);
		System.out.println(oauth2RestTemplate.getAccessToken());
		return "success";
	}

}
