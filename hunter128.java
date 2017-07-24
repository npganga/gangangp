package Hunter;

import java.util.Arrays;
import java.util.Scanner;

public class hunter128 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		int[] ans=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		int m=n;
		int k=0;
		for(int i=0;i<n;i++){
		 if(i%2==0){
			 ans[i]=arr[m-1];
			 m--;
		 }
		 else{
			 ans[i]=arr[k];
			 k++;
		 }
		}
		for(int i=0;i<n;i++){
			System.out.println(ans[i]);
		}
	}
}
