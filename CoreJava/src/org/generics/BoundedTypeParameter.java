package org.generics;

public class BoundedTypeParameter {
	
	public <U extends Number> void inspect(U u) {
		System.out.println("U: " + u.getClass().getName());
	}

	public static void main(String[] args) {
		BoundedTypeParameter boundType = new BoundedTypeParameter();
		boundType.inspect(new Long(10));
	}
	
}
