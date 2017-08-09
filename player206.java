package player;

import java.util.Scanner;

public class player206 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String input=in.nextLine();
	char[] arr=input.toCharArray();
	String output="";
	for(int i=0;i<input.length();i++){
		int t=(int)arr[i];
		if(t>=65&&t<=90)
			output+=(char)(t+32);
		else if(t>=97&&t<=122)
			output+=(char)(t-32);
		else
			output+=(char)t;
	}
	System.out.print(output);
}
}
