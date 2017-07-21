package beginner;

import java.util.Scanner;

public class set39 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int[] array=new int[10];
	for(int i=0;i<10;i++){
		array [i]=in.nextInt();
	}
	int max=array[0];
	for(int i=0;i<10;i++){
		if(array[i]>max){
			max=array[i];
		}
	}

	System.out.println(max);
	in.close();
}
}
