package com.microservices.usermanagementappservice.actuatorEndPoint;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="userAppInfo")
public class UserAppInfoEndPoint {

	@ReadOperation
	public UserAppInfo userAppInfo() {
		Map<String, Object> details = new LinkedHashMap<>();
		details.put("App location", "Local");
		details.put("Status", "All good");
		
		UserAppInfo health = new UserAppInfo();
		health.setHealthDetails(details);
		return health;
	}
	
	@ReadOperation
	public String userAppEndPointByName(@Selector String name) {
		return "This is User Management application with arguements. Application is up and health is good."+name;
	}
	
	@WriteOperation
	public void writeOperation(@Selector String namer) {}
	
	@DeleteOperation
	public void deleteOperation(@Selector String namer) {}
	
}