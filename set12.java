package beginner;

import java.util.Scanner;

public class set12 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=0;
	int count=0;
	for(int i=a;i>0;i=i/10){
		count++;
	}
	int d=0;
	for(int i=a;i>0;){
		 b=i%10;
		d=d+(int)((Math.pow(10, count-1)*b));
		count--;
		i=i/10;
	}
	if(a==d){
		System.out.println("PALINDROME");
	}
	else{
		System.out.println("NOT A PALINDROME");
	}
	in.close();
}
}
