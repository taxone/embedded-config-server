package eu.tasgroup.poc.embedded;

import org.springframework.cloud.config.server.environment.EnvironmentRepositoryFactory;
import org.springframework.stereotype.Component;


public class ProvaEnvironmentRepositoryFactory implements EnvironmentRepositoryFactory<ProvaEnvironmentRepository, ProvaEnvironmentRepositoryProperties> {

	@Override
	public ProvaEnvironmentRepository build(ProvaEnvironmentRepositoryProperties environmentProperties)
			throws Exception {
		return new ProvaEnvironmentRepository();
	}

}
