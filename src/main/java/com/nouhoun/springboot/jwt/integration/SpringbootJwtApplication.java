package com.nouhoun.springboot.jwt.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Import({SecurityConfig.class,
	ResourceServerConfig.class,
	DatasourceConfig.class,
	AuthorizationServerConfig.class,
	AdditionalWebConfig.class
})
public class SpringbootJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJwtApplication.class, args);
	}
}
