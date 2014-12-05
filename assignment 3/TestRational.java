/**
 * Course: CS 3401
 * Section: 1
 * Name: Richard Godbee
 * Professor: Prof. Shaw
 * Assignment #: Homework 3
 */
package bigInteger;

import java.math.BigInteger;

public class TestRational {

	public static void main(String[] args) {
		Rational r1 = new Rational(BigInteger.valueOf(100), BigInteger.valueOf(1));
		Rational r2 = new Rational(BigInteger.valueOf(1), BigInteger.valueOf(402));
		System.out.println("r1: "+r1.toString());
		System.out.println("r2: "+r2.toString());
		
		r1 = r1.add(r2);
		System.out.println("r1 + r2 should be (40201/402): "+r1.toString());
		
		Rational r3 = new Rational(BigInteger.valueOf(10004), BigInteger.valueOf(20));
		Rational r4 = new Rational(BigInteger.valueOf(203), BigInteger.valueOf(402));
		System.out.println("r3: "+r3.toString());
		System.out.println("r4: "+r4.toString());
		r3 = r3.subtract(r4);
		System.out.println("r3 - r4 should be (1004387/2010): "+r3.toString());
		
		Rational r5 = new Rational(BigInteger.valueOf(10), BigInteger.valueOf(20));
		Rational r6 = new Rational(BigInteger.valueOf(3), BigInteger.valueOf(4));
		System.out.println("r5: "+r5.toString());
		System.out.println("r6: "+r6.toString());
		r5 = r5.multiply(r6);
		System.out.println("r5 * r6 = (3/8): " + r5.toString());
		
		System.out.println("r5: "+r5.toString());
		System.out.println("r6: "+r6.toString());
		r5 = r5.divide(r6);
		System.out.println("r5 * r6 = (1/2): " + r5.toString());
		
		
	}

}
