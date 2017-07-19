package beginner;

import java.util.Scanner;

public class set24 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int number=in.nextInt();
	int n=(int)Math.log10(number);
	
	int reverse=0;
	if(n>=0){
	for(int i=number;i>0;i=i/10){
		int r=i%10;
		reverse+=((int)Math.pow(10,n)*r);
	    n--;
	  }	
	}
	System.out.println(reverse);
}
}
