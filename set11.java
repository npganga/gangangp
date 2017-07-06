package beginner;

import java.util.Scanner;

public class set11 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int power=1;
	for(int i=0;i<b;i++){
		power*=a;
	}
	System.out.println("The power a "+a+" of b "+b+" is "+power);
	in.close();
}
}
