/*
Given two strings as input, find number of occurrences of last character in second string, in the first string. Don't use string library functions for this program

Input: “going to go to goa”, “go”
Output: 5 (last char of str2 is o and it appeared 5 times in str1)
*/

import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mainStr = sc.nextLine();
		String subStr = sc.nextLine();
		int count = 0;
		int m = lengthOfStr(mainStr);
		int s = lengthOfStr(subStr);
		if(m==0 || s == 0){
		    System.out.println(count);
		    System.exit(0);
		}
		char ch = subStr.charAt(s-1);
		for(int i=0;i<m;i++){
		    if(mainStr.charAt(i)==ch)
		    count++;
		}
		System.out.println(count);
	}
	
	public static int lengthOfStr(String str){
	    str += "\0";
	    int length = 0, i=0;
	    while(str.charAt(i)!='\0'){
	        i++;
	        length++;
	    }
	    return length;
	}
}
