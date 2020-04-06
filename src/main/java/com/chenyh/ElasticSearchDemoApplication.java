package com.chenyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.stereotype.Controller;


@SpringBootApplication
@Controller
@EnableElasticsearchRepositories(basePackages = "com.chenyh.repository.es")
public class ElasticSearchDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticSearchDemoApplication.class, args);
	}



}




