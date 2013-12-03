package com.mycompany.app;

import java.util.logging.Logger;

/**
 * My Subversion Test App
 *
 */
public class App  {
	
	private static final Logger LOGGER = Logger.getLogger(App.class.getName());
	
	private String name;
	private String version;
	
	public App (String name) {
		this.name = name;
	}
	
	public String sayMyName() {
		return "My name is '" + getName() + "'";
	}
	
	public String sayMyVersion() {
		return "My version number is '" + getVersion() + "'";
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
    public static void main( String[] args ) {
		App app = new App("My Subversion Test App");
		app.setVersion("0.1 Beta");
		
		LOGGER.info( app.sayMyName() );
		LOGGER.info( app.sayMyVersion() );
    }
}
