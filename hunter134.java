package Hunter;

import java.util.Scanner;

public class hunter134 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
    while(b!=0){
    	int r=a%b;
    	a=b;
    	b=r;
    }
    if (a==1)
    	System.out.println("Co-Prime");
    else{
    	System.out.println("Not a C0-Prime");
    }
    in.close();
}
}
