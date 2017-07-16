package beginner;

import java.util.Scanner;

public class set102 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	for(int i=1;i<=n;i++){
		int count=0;if(a<b){
			for(int i=a;i<=b;){
				if(i>1){
					for(int j=1;j<=i;j++){
						if(i%j==0){
							count++;
						}
					}
				}
				if(count==2)
				System.out.println(i);
				count=0;
				i++;
			}
		
		}
		in.close();
	}
}
}
