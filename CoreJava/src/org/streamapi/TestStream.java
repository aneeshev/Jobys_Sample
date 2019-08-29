package org.streamapi;

public class TestStream {

	public static void main(String[] args) {
		Message msg = (name) -> System.out.println("Good morning !");
		msg.showMessage("");
	}

}

@FunctionalInterface
interface Message {
	void showMessage(String name);
}
