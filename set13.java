package beginner;

import java.util.Scanner;

public class set13 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int count=0;
	if(a==1||a==0){
		System.out.println("NEITHER PRIME NOR COMPOSITE");
	}
	else{
	for(int i=1;i<=a;i++){
		if(a%i==0){
			count++;
		}
	}
	if(count==2){
		System.out.println("PRIME");
	}
	else{
		System.out.println("NOT A PRIME");
	}
	}
}
}
