package com.example.eurekaclient;

import com.example.eurekaclient.Model.Client;
import com.example.eurekaclient.Repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;


@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {

	public static void main(String[] args) {

		SpringApplication.run(EurekaClientApplication.class, args);


	}
	@Bean
	CommandLineRunner initialiserBaseH2(ClientRepository cr){
		return args ->{
			cr.save(new Client(Long.parseLong("1"),"IMANE BOUTATA",Float.parseFloat("23")));
			cr.save(new Client(Long.parseLong("2"),"OUMA BENNANI",Float.parseFloat("22")));
			cr.save(new Client(Long.parseLong("3"),"KAOUTAR ALAOUI",Float.parseFloat("21")));
		};
	}

}
