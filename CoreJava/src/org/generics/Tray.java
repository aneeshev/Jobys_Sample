package org.generics;

public class Tray {
	public static void add(Glass<Tea> liquidGlass) { // use wildcard (?) for accepting all types of parameters, Ex: Glass<?>
		System.out.println("Executed !");
	}

	public static void main(String[] args) {
		Glass<Tea> glassTea = new Glass<>();
		add(glassTea);

		//Glass<Coffee> glassCoffee = new Glass<>();
		//add(glassCoffee); // this will not work since Glass is declared to accept only Tea (line 9). use wildcard (?) to accept any parameter.
	}
}

class Glass<T> {

}

class Tea {

}

class Coffee {

}
