// Java Method Overriding 
package com.practicehere;
//where three classes are overriding the method of a parent class.  
// creating parent class
class Bank {
	int OfInterest() {
		return 0;
	}
}

// creating child class
class SBI extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

// creating child class
class ICICI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

// creating child class
class AXIS extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}

//Test class to create objects and call the methods  
public class Test2 {

	public static void main(String[] args) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		
		System.out.println("SBI Rate of Interest : " +s.getRateOfInterest());
		System.out.println("ICICI Rate of Interest : " +i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest : " +a.getRateOfInterest());
	}
}
