package beginner;

import java.util.Scanner;

public class set32 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String input=in.nextLine();
	int count=0;
	int len=input.length();
	for(int i=0;i<len;i++){
		int g=Integer.valueOf(input.charAt(i));
		if(g==32||g==33||g==34||g==39||g==44||g==45||g==46||g==58||g==59||g==63||g==96){
				count++;
		}
	}
	System.out.println(count);
	in.close();
}
}
