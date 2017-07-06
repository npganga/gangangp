package beginner;

import java.util.Scanner;

public class set15 {
	public static void main(String[] args){
		 Scanner in=new Scanner(System.in);
		 int a=in.nextInt();
		 int b=in.nextInt();
		 for(int i=a;i<=b;i++){
			 if(i%2==0){
				 System.out.println(i+" ");
			 }
		 }
		 in.close();
		}
}
