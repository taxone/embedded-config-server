package eu.tasgroup.poc.embedded;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableConfigServer
@Slf4j
public class Embedded2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Embedded2ServerApplication.class, args);
	}

	@Autowired
	private Embedde2Properties properties;
	
	@PostConstruct
	public void init() {
		log.info(properties.getName());
	
		
	}
	
	@Bean
	public ProvaEnvironmentRepositoryFactory provaEnvironmentRepositoryFactory() {
		return new ProvaEnvironmentRepositoryFactory();
	}
}
