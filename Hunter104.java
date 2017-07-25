package Hunter;

import java.util.Scanner;

public class Hunter104 {
public static void main(String[] args){
Scanner in=new Scanner(System.in);
System.out.println("Enter the frist string ");
String in1=in.nextLine();
System.out.println("Enter the second string ");
String in2=in.nextLine();
int a=0;
if(in1.length()>=in2.length()){
	a=in1.length();
}
else{
	a=in2.length();
}if(a<=100){
char[] arr1=new char[a];
char[] arr2=new char[a];

for(int i=0;i<in1.length();i++){
	if(in1.charAt(i)>=32&&in1.charAt(i)<=126){
	arr1[i]=(char)in1.charAt(i);
	}
	else{
		System.exit(0);
	}
}
for(int i=0;i<in2.length();i++){
	if(in1.charAt(i)>=32&&in1.charAt(i)<=126){
	arr2[i]=(char)in2.charAt(i);
	}
	else{
		
		System.exit(0);
	}
}

System.out.println();
for(int i=0;i<=a;i++){
	System.out.println(arr2[i]+" "+arr1[i]);
}
}
else{
	System.out.println("invalid data");
}
}
}
