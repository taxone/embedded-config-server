package eu.tasgroup.poc.embedded;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.environment.PropertySource;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;


public class ProvaEnvironmentRepository implements EnvironmentRepository {

	@Override
	public Environment findOne(String application, String profile, String label) {
		String[] profiles = StringUtils.commaDelimitedListToStringArray(profile);
		Environment environment = new Environment(application, profiles, null, null, null);
		
		Map<String, Object> map = new HashMap<>();
		map.put("pippo.name", "ciao");
		PropertySource ps = new PropertySource("test", map );
		environment.add(ps );
		
		return environment;
	}

}
