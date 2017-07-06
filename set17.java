package beginner;

import java.util.Scanner;

public class set17 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int number=in.nextInt();
	int sum=0;
	for(int i=number;i>0;i=i/10){
		int t=i%10;
		sum+=(t*t*t);
	}
	if(sum==number){
		System.out.println("Armstrong number");
	}
	else{
		System.out.println("NOT Armstrong number");
	}
	in.close();
}
}
