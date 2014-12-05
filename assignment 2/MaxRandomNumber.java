/***************************/
/* Name:     Richard Godbee*/
/* Class:    CS3401        */
/* Term:     Summer 2013   */
/* Assgn #:  1             */
/***************************/

package cs3401_godbee;

import java.util.Random;

public class MaxRandomNumber {
	public static void 
	// an array of type int
	private int[] theArray;
	// an int to keep track of the size of classy
	private int counter;
	// a random to create the numbers
	private Random randomGenerator;

	public MaxRandomNumber(int n)
	{
	theArray = new int[n];
	counter = n;
	randomGenerator = new Random();
	}

	public void fillRandomly()
	{
	for(int tracker = 0; tracker < theArray.length; tracker++)
	{
	int index = randomGenerator.nextInt(1001);
	theArray[tracker] = index;
	}
	}
}

