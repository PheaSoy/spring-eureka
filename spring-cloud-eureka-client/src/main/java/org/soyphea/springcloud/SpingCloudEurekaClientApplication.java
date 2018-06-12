package org.soyphea.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpingCloudEurekaClientApplication {
	@Value("${server.port}")
	private int PORT;
	
	public static void main(String[] args) {
		SpringApplication.run(SpingCloudEurekaClientApplication.class, args);
	}

	@RequestMapping("/greeting")
	public String greeting() {
		System.out.println("Requested.");
		return "Hello from EurekaClient PORT:";
	}

}
