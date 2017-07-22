package Hunter;

import java.util.Scanner;

public class hunter55 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int m=0;
		int[] array=new int[n];
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			array[i]=in.nextInt();
		}
		if(n>k){
			for(int j=0;j<n-k;j++){
				arr[j]=array[j+k];
			}
			for(int j=n-k;j<n;j++){
				arr[j]=array[m++];
			}
		
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
	else{
		System.out.println("invalid input");
	}
		in.close();
	}
}
