package com.mycompany.app;

/**
 * My Subversion Test App
 *
 */
public class App 
{
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
	
	
    public static void main( String[] args )
    {
		App app = new App("My Subversion Test App");
		
        System.out.println( app.sayMyName() );
    }
}
