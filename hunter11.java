package Hunter;

import java.util.Scanner;

public class hunter11 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] words=str.split(" ");
		for(String r:words){
			StringBuffer sb=new StringBuffer(r);
			System.out.print(sb.reverse()+" ");
			}
        s.close();
	}
}
