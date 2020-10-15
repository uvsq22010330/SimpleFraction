package com.raouf;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello");
        Fraction frac = new Fraction(1, 2);
        String s= frac.toString(10, 5);
        System.out.println(s);
    }
}
