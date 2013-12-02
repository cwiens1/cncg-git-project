package com.mycompany.app;

import java.util.logging.Logger;

/**
 * My Subversion Test App
 *
 */
public class App  {
	
	private static final Logger LOGGER = Logger.getLogger(App.class.getName());
	
	private String name;
	
	public App (String name) {
		this.name = name;
	}
	
	public String sayMyName() {
		return "My name is: " + getName();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
    public static void main( String[] args ) {
		App app = new App("My Subversion Test App");
		
		LOGGER.info( app.sayMyName() );
    }
}
