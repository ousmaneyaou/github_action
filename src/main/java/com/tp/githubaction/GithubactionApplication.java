package com.tp.githubaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubactionApplication {
	@RequestMapping("/test")
	public String home(){
		return "github_action";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubactionApplication.class, args);
	}

}
