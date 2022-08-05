package eu.tasgroup.poc.embedded;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ryan Baxter
 */
@Configuration
public class ProvaBootstrapConfiguration {
	@Bean
	public ProvaEnvironmentRepositoryFactory prova() {
		return new ProvaEnvironmentRepositoryFactory();
	}
}
