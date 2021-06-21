package com.practicehere;
class Animal {

	public void eat() {
		System.out.println("Animal is eating");
	}

}
 
class Cat extends Animal {
	public void eat() {
		System.out.println("cat is also eating");
	}

	public static void main(String[] args) {

		Cat cat = new Cat();
		Animal animal = new Animal();
		cat.eat();
		animal.eat();
	}

}
