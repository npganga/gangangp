package beginner;

import java.util.Scanner;

public class set101 {
public static void main(String[] args){
	Scanner in=new Scanner (System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int sum=0;
	for(int i=a;i<=b;i++){
		sum+=i;
	}
	System.out.println(sum);
	in.close();
}
}
