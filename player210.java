package player;

import java.util.Arrays;
import java.util.Scanner;

public class player210 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int num=in.nextInt();
	int[]digits = Integer.toString(num).chars().map(c -> c-='0').toArray(); 
	 Arrays.sort(digits);
    for(int d : digits)
        System.out.print(d);   
}
}
