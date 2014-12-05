/***************************/
/* Name:     Richard Godbee*/
/* Class:    CS3401        */
/* Term:     Summer 2013   */
/* Assgn #:  1             */
/***************************/
package cs3401Godbee;

import java.util.Arrays;
import java.util.Scanner;


public class RandomChars {
	public static void main(String [] args)
	{
		char [] chars = new char[30];
		
		for (int i = 0; i < 30; ++i){
			chars[i] = (char) (65 + (int) (Math.random()* 26));
			if (Math.random() < 0.5)
				chars[i] += 32;
			System.out.print(chars[i]);
		}
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		scan.close();
		char c = input.charAt(0);
		System.out.println(countTheChar(chars, c));
	}
	
	public static int countTheChar(char[] chars, char ch){
		return countTheChar(chars, ch, 0);
	}
	
	public static int countTheChar(char[] chars, char ch, int high){
		int index = -1;
		int result = high;
		
		for(int i = 0; (i < chars.length) && (index == -1); i++){
			if(chars[i] == ch){
				index = i;
				break;
			}
		}
		if(index != -1){
			char[] newchar = Arrays.copyOfRange(chars, index + 1, chars.length);
			if(newchar.length != 0){
				high += 1;
				result = countTheChar(newchar, ch, high);
			}
			
		}
		
		return result;
	}
	
}

