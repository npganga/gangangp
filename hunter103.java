package Hunter;

import java.util.Scanner;

public class hunter103 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
   System.out.println("Enter the number");
   int input=in.nextInt();
   if(input>9){
   int t=input%10;
   int sum=0;
   for(int i=input;i>0;i=i/10){
	   int r=i%10;
	int d=1;
	   for(int i1=1;i1<=t;i1++){
		   d=d*r;
	   }
	   sum=sum+d;
   }
   System.out.println("Output is "+sum);
}

else{
	System.out.println("invalid data");
}
}
}
