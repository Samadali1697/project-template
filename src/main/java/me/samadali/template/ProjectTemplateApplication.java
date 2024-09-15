package me.samadali.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("me.samadali.template.*")
public class ProjectTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectTemplateApplication.class, args);
	}

}
