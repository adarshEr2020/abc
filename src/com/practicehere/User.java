package com.practicehere;

// interface 

interface print{
	void show();
}

public class User implements print {

	public void show() {
		System.out.println("show");
	}

	String massage;

	User() {
		
	}

	User(String massage){
		this.massage = massage;
	}
	public static void main(String[] args) {
		User userObject = new User();
		userObject.show();
	}

}
