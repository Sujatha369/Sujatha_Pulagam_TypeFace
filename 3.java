/*
An LCD (Liquid Crystal Display) can represent multiple digits between 0 to 9 
If you turn the LCD upside-down, some of the numbers still remain valid numbers. For example, 16 becomes 91, 10 becomes 01, which are valid numbers.
If you index all positive numbers (>0) that can produce valid numbers when you upside down the display (like 1st one is 1, 2nd one is 2, 3rd one 5... 7th one is 10), 
Write program to print the ’Nth’ number in the series

Input: 8
Output: 11
*/

import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=0,temp = 1;
		if(n<=0){
		    System.out.println();
		}
		else{
		    while(i<n){
		        String num = Integer.toString(temp);
		        if(!(num.contains("3")||num.contains("4")|| num.contains("7"))){
		            i++;
		        }
		        temp++;
		       }
		    System.out.println(--temp);
		}
		
	}
	
}
