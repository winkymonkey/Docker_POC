package org.example.docker;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;


@Component
public class JerseyResourceConfig extends ResourceConfig {
	
	public JerseyResourceConfig() {
        register(MyJerseyResource.class);
    }
	
}
