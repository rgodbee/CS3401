/**
 * Course: CS 3401
 * Section: 1
 * Name: Richard Godbee
 * Professor: Prof. Shaw
 * Assignment #: Homework 3
 */
package bigInteger;

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
  BigInteger numerator = new BigInteger("0");
  BigInteger denominator = new BigInteger("1");
  
  /** Construct a rational with default properties */
  public Rational() {
    this(BigInteger.valueOf(0), BigInteger.valueOf(1));
  }

  /** Construct a rational with specified numerator and denominator */
  public Rational(BigInteger numerator, BigInteger denominator) {
    BigInteger gcd = gcd(numerator, denominator);
    BigInteger base = new BigInteger("0");
     
	if(denominator.compareTo(base) > 0)
		this.numerator = numerator.divide(gcd);
	else{
		BigInteger neg = new BigInteger("-1");
		this.numerator = numerator.multiply(neg).divide(gcd);
	}
    		
    this.denominator = denominator.abs().divide(gcd);
  }

  /** Find GCD of two numbers */  
  private static BigInteger gcd(BigInteger n, BigInteger d) {
    BigInteger n1 = (n).abs();
    BigInteger n2 = (d).abs();
    BigInteger gcd = BigInteger.valueOf(1);
    
    for (int k = 1; k <= n1.intValue() && k <= n2.intValue(); k++) {
      if (n1.intValue() % k == 0 && n2.intValue() % k == 0) 
        gcd = BigInteger.valueOf(k);
    }

    return gcd;
  }
  
  /** Return numerator */
  public BigInteger getNumerator() {
    return numerator;
  }

  /** Return denominator */
  public BigInteger getDenominator() {
    return denominator;
  }

  /** Add a rational number to this rational */
  public Rational add(Rational secondRational) {
    BigInteger n = numerator.multiply(secondRational.getDenominator()).add(denominator.multiply(secondRational.numerator));
    BigInteger d = denominator.multiply(secondRational.getDenominator());
    return new Rational(n, d);
  }

  /** Subtract a rational number from this rational */
  public Rational subtract(Rational secondRational) {
    BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));
    BigInteger d = denominator.multiply(secondRational.getDenominator());
    return new Rational(n, d);
  }

  /** Multiply a rational number to this rational */
  public Rational multiply(Rational secondRational) {
    BigInteger n = numerator.multiply(secondRational.getNumerator());
    BigInteger d = denominator.multiply(secondRational.getDenominator());
    return new Rational(n, d);
  }

  /** Divide a rational number from this rational */
  public Rational divide(Rational secondRational) {
    BigInteger n = numerator.multiply(secondRational.getDenominator());
    BigInteger d = denominator.multiply(secondRational.numerator);
    return new Rational(n, d);
  }

  @Override  
  public String toString() {
    if (denominator.compareTo(BigInteger.ONE) == 0)
      return numerator + "";
    else
      return numerator + "/" + denominator;
  }

  @Override // Override the equals method in the Object class 
  public boolean equals(Object other) {
    if ((this.subtract((Rational)(other))).getNumerator().compareTo(BigInteger.ZERO) == 0)
      return true;
    else
      return false;
  }

  @Override // Implement the abstract intValue method in Number 
  public int intValue() {
    return (int)doubleValue();
  }

  @Override // Implement the abstract floatValue method in Number 
  public float floatValue() {
    return (float)doubleValue();
  }

  @Override // Implement the doubleValue method in Number 
  public double doubleValue() {
    return numerator.divide(denominator).doubleValue();
  }

  @Override // Implement the abstract longValue method in Number
  public long longValue() {
    return (long)doubleValue();
  }

  @Override // Implement the compareTo method in Comparable
  public int compareTo(Rational o) {
    if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0)
      return 1;
    else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) < 0)
      return -1;
    else
      return 0;
  }
}