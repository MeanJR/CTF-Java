package com.ctf.Lecture14;

public class AI implements IWebsiteCreator {
	
	public String name;
	public String language;
	public AI(String name, String language) {
		
		this.name = name;
		this.language = language;
	}
	
	@Override
	public void createWebsite(String template, String titleName) {
		
		
		System.out.println("Language : " + language + " Name : " + name );
		System.out.println("automated Setup template: "+ template);
		System.out.println("automated Set Title name: "+ titleName );
		 
		
	}

}
