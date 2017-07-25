package Hunter;

import java.util.Scanner;

public class hunter102 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=in.nextInt();
	int c=0;
	int sum=0;
	for(int i=n;i>0;i=i/10){
		c++;
	}
	int r=1;
	if(c>=2){
	for(int i=n;i>0;i=i/10){
		int t=i%10;
		sum+=t*r;
		r++;
	}
	System.out.println(sum);
	}
	else{
		System.out.println("invalid data");
	}
	in.close();
}
}
