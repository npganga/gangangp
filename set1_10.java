package beginner;

import java.util.Scanner;

public class set1_10 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int d=0;
	for(int i=a;i>0;i=i/10){
		d++;
	}
	System.out.println(d);
	in.close();
}
}
