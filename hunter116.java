package Hunter;

import java.util.Scanner;

public class hunter116 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int number=in.nextInt();
	int n=0;
	for(int i=number;i>0;i=i/10)
		n++;
	int sum=0;
	for(int i=number;i>0;i=i/10){
		int r=i%10;
		int d=(int)Math.pow(r,n-1);
		sum+=(d);
		n--;
	}
	System.out.println(sum);
	in.close();
}
}