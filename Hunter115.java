package Hunter;

import java.util.Scanner;

public class Hunter115 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String input1=in.next();
	String input2=in.next();
	int m=input1.length();
	int n=input2.length();
	int a;
	if(m>n)
		a=m;
	else
		a=n;
	char[] input11=new char[a];
	char[] input12=new char[a];
	char c='1';
	for(int i=0;i<a;i++){
		if(a==m){
			input11[i]=input1.charAt(i);
		}
		else{
			if(i<m){
				input11[i]=input1.charAt(i);
			}
			else{
				input11[i]=c++;
			}
		}
			
	}
	c='1';
	for(int i=0;i<a;i++){
		if(a==n){
			input12[i]=input2.charAt(i);
		}
		else{
			if(i<n){
				input12[i]=input2.charAt(i);
			}
			else{
				input12[i]=c++;
			}
		}
			
	}
	for(int i1=0;i1<(a);i1++){
		System.out.print(input11[i1]+""+input12[i1]);
	}
}
}
