package com.spring.session4.beans;

import java.io.File;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DestructiveBeanWithJSR250  {

	private File file;
	private String filePath;
	
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Destroying Bean");
		
		if(!file.delete()) {
		System.err.println("ERROR: failed to delete file.");
		}
		
		System.out.println("File exists: " + file.exists());
	}

	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Bean");
		
		if (filePath == null) {
			throw new IllegalArgumentException(
			"You must specify the filePath property of " +
			DestructiveBeanWithInterface.class);
			}
			
			this.file = new File(filePath);
			this.file.createNewFile();
			System.out.println("File exists: " + file.exists());
	}
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
