package Hunter;
import java.util.Scanner;

public class hunter133 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String input=in.nextLine();

	String[] inn=input.split(" ");
	int c=inn.length;
   for(int i=c-1;i>=0;i--){
    	System.out.print(inn[i]+" ");
    }
    in.close();
}
}

