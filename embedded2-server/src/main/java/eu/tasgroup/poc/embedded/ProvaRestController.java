package eu.tasgroup.poc.embedded;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProvaRestController {

	@Autowired
	private Embedde2Properties properties;
	
	@GetMapping("/hello")
	public String hello() {
		return properties.getName();
	}
}
