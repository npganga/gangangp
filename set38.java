package beginner;

import java.util.Scanner;

public class set38 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int c=in.nextInt();
	if(a>b&&a>c){
		System.out.println(a+" is the greatest element");
	}
	else if(b>c){
		System.out.println(b+" is the greatest element");
	}
	else{
		System.out.println(c+" is the greatest element");
	}
	in.close();
}
}
