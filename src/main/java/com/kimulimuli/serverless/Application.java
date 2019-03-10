package com.kimulimuli.serverless;

import com.kimulimuli.serverless.controller.GreetingController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(GreetingController.class)
public class Application extends SpringBootServletInitializer {

	// silence console logging
	@Value("${logging.level.root:OFF}")
	String message = "";

	/*
	 * Create required HandlerMapping, to avoid several default HandlerMapping
	 * instances being created
	 */

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
