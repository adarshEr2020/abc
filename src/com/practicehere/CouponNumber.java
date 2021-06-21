package com.practicehere;

public class CouponNumber {

	public static void main(String[] args) {
		char chars[] = "1234".toCharArray();
		int max = 10;
		int random = (int) (Math.random()*max);
		StringBuffer sb = new StringBuffer();
		
		while(random > 0) {
			sb.append(chars[random % chars.length]);
			random /= chars.length;
		}
		String couponCode=sb.toString();
		System.out.println("Coupon Code: "+couponCode);	

	}

}
