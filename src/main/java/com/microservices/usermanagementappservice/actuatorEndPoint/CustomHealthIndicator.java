package com.microservices.usermanagementappservice.actuatorEndPoint;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator{

	@Override
	public Health health() {
		int errorCode = check();
		
		if(errorCode != 0) {
			return Health.down().withDetail("Error Code", errorCode).build();
		}
		else
		return Health.up().build();
	}

	public int check() {
		return 1;
	}

}
