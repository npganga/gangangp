package Hunter;

import java.util.Scanner;

public class hunter129 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String word=in.next();
	int m=word.length();
	int[] arr=new int[m];
	for(int i=0;i<m;i++){
		arr[i]=(int)word.charAt(i);	
	}
	int sum=0;
	for(int i=0;i<m-1;i++){
		sum=sum+(arr[i+1]-arr[i]);
	}
	int n1=sum-arr[0];
	int n2=Math.abs(n1);
	char c=(char)n2;
	System.out.println(c);
in.close();
}
}
