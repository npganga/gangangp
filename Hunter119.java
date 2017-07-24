package Hunter;

import java.util.Arrays;
import java.util.Scanner;

public class Hunter119 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] rs=new int[4];
		for(int i=0;i<4;i++){
			rs[i]=in.nextInt();
		}
		int a=in.nextInt();
		Arrays.sort(rs);
        int minamount=rs[0]+rs[1]+rs[2];
        int maxamount=0;
        if(minamount>a){
        	System.out.println("invalid data");
        }else{
        System.out.println(minamount);
        }
        int[] sum=new int[4];
        	 sum[0]=(rs[3]+rs[2]+rs[1]);
        	 sum[1]=rs[3]+rs[2]+rs[0];
             sum[2]=rs[3]+rs[0]+rs[1];
             sum[3]=rs[0]+rs[2]+rs[1];
             Arrays.sort(sum);
             for(int i=3;i>=0;){
            	 if(sum[i]<a){
            		 maxamount=sum[i];
            		 break;
            	 }
            	 else{
            		 i--;
            	 }
             } 
             if(maxamount<a)
             System.out.println(maxamount);
             else{
            	 System.out.println("Invalid data");
             }
	}
}
