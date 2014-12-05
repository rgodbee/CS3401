/***************************/
/* Name:     Richard Godbee*/
/* Class:    CS3401        */
/* Term:     Summer 2013   */
/* Assgn #:  1             */
/***************************/
package cs3401Godbee;

import java.util.Scanner;

public class decToBinary {

	public static void main(String[] args) {
	
	    int number;
	    @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	    System.out.print("Give me a positive number to convert to binary: ");
	    number = scan.nextInt();
	    convert(number);
	
	}
	public static void convert(int num) {
	    if (num>0) {
	    	convert(num/2);
	    	System.out.print(num%2 + " ");
	    }
	}
}