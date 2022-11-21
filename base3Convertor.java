//Given an integer as input. Write a function to convert that to base 3 number
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(base3Converter(num));
	}
	public static int base3Converter(int num){
	    String str = "";
		String sign = "";
		if(num<0){
		    sign +="-";
		    num = Math.abs(num);
		}
		while(num>0){
		    str = (num%3)+str;
		    num/=3;
		}
		str = sign + str;
		return Integer.parseInt(str);
	}
}
