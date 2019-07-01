package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableOAuth2Client
public class SpringSecurityOauth2ResourceServerSamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityOauth2ResourceServerSamplesApplication.class, args);
	}

}
