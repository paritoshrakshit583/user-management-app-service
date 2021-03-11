package com.microservices.usermanagementappservice.actuatorEndPoint;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserAppInfo {

	private Map<String, Object> healthDetails;

	public Map<String, Object> getHealthDetails() {
		return healthDetails;
	}

	public void setHealthDetails(Map<String, Object> healthDetails) {
		this.healthDetails = healthDetails;
	}	
}
