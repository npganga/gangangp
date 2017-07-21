package beginner;

import java.util.Scanner;

public class set34 {
public static void main(String[] args){
	Scanner in =new Scanner(System.in);
	String input=in.nextLine();
	int count=0;
	for(int i=0;i<input.length();i++){
		int t=input.charAt(i);
		if(t>=48&&t<=57){
			count++;
		}
	}
	System.out.println("Tha number of numeric characters in given string is "+count);
	in.close();
}
}
