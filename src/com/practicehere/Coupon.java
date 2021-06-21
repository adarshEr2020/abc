package com.practicehere;

import java.util.*;

public class Coupon {
	int num;
	int arr[] = new int[100];

	void func() {
		int count = 0;
		for (int i = 1; i <= num; i++) {

			arr[i] = (int) Math.floor(Math.random() * 10);
			int temp = arr[i];
			for (int j = 0; j < i; j++) {
				if (arr[j] == temp) {
					i--;

				}
			}
			count++;

		}
		for (int k = 1; k < num; k++) {
			System.out.println(arr[k]);
		}
		System.out.println("Total number of counts \n" + count);
	}

	// main here
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many different 1 to 3 digit coupons you want");
		Coupon ob = new Coupon();
		ob.num = scan.nextInt();
		ob.func();
		scan.close();
		System.out.println();
	}
}