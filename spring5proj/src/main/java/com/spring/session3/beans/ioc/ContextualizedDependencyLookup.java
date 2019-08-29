package com.spring.session3.beans.ioc;

public class ContextualizedDependencyLookup implements ManagedComponent{

	private Dependency dependency; 
	
	@Override
	public void performLookup(Container container) {
		this.dependency = (Dependency)container.getDependency("dependency");
	}
	
	@Override
	public String toString() {
		return dependency.toString();
	}

}
