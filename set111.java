package beginner;

import java.util.Scanner;

public class set111 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String input=in.next();
	char output;
	int sum=0;
	int average=0;
	int n=input.length();
	for(int i=0;i<n;i++){
		int h=input.charAt(i);
		sum+=h;
	}
	average=sum/n;
 output=(char)average;
 System.out.println(output);
 in.close();
}
}
