package beginner;

import java.util.Scanner;

public class set20 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int n=in.nextInt();
	for(int i=1;i<=n;i++){
		System.out.println(""+i+" * "+a+" = "+(i*a));
	}
	in.close();
}
}
