package com.practicehere;
//
//class A { // parent A HAS-A relation with Test
//	int i;
//	
//	A(int i){
//
//	}	void show1() {	System.out.println("show1 called with i value -" +i); // 10+10
//	}
//}
public class Test {

	int i;

	// default constructor
	//Test(){	}

	// Parameterized constructor
	Test(int i) {
		//super(i+10); //super
		this.i = i;
	}

	void show(Test param) {
		System.out.println("-----");
		System.out.println(this.i);
		System.out.println(param.i);

	}

	public static void main(String[] args) {
		Test t1 = new Test(10);
		Test t2 = new Test(20);
		
		//t1.show1();
		t1.show(t1);
		t2.show(t2);

		t1.show(t2); 
		t2.show(t1);
	}
}

