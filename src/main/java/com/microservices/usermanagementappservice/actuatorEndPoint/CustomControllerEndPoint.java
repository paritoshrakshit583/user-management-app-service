package com.microservices.usermanagementappservice.actuatorEndPoint;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "controllerEndpoint")
public class CustomControllerEndPoint {

	@GetMapping("/myEndPoint")
	public ResponseEntity readEndPoint() {
		return new ResponseEntity<> ("This is custom controller endpoint", HttpStatus.OK);
	}
}