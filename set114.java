package beginner;

import java.util.Scanner;

public class set114 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	in.close();
	for(int i=0;i<n;i++){
		for(int j=0;j<=i;j++){
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
