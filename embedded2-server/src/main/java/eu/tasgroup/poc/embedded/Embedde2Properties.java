package eu.tasgroup.poc.embedded;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix = "pippo")
public class Embedde2Properties {

	@Getter
	@Setter
	private String name;
}
