package com.java.concepts.implimantation;

public class Student {

	private final String name; 
    private final int regNo; 
  
    public Student(String name, int regNo) 
    { 
        this.name = name; 
        this.regNo = regNo; 
    } 
    // only can create setters. not setters.
    public String getName() 
    { 
        return name; 
    } 
    public int getRegNo() 
    { 
        return regNo; 
    }
    
    
}
