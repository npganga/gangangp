package guviworkspace;
import java.util.Scanner;
public class factorial {
public static void main(String[] args){
	int factorial=1,i,number;
	Scanner input=new Scanner(System.in);
	number=input.nextInt();
	for(i=1;i<=number;i++)
		factorial*=i;
System.out.println("The factorial of the given number "+number+" is "+factorial);
input.close();
}
}