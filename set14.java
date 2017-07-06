package beginner;

import java.util.Scanner;

public class set14 {
public static void main(String[] args){
 Scanner in=new Scanner(System.in);
 int a=in.nextInt();
 int b=in.nextInt();
	if(a<b){
 for(int i=a;i<=b;i++){
	 if(i%2==1){
		 System.out.println(i+" ");
	 }
 }}
	else{
		System.out.println("INVALID");
 in.close();
}
}
