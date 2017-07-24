
package Hunter;

import java.util.Scanner;

public class hunter130 {
public static void main(String[] args){
	String day=new String();
	Scanner in=new Scanner(System.in);
	day=in.next();
	String da=day.toUpperCase();
if(da.equals("MONDAY")||da.equals("MON")||da.equals("TUESDAY")||da.equals("TUE")||da.equals("WEDNESDAY")||da.equals("WED")||da.equals("THURSDAY")||da.equals("THURS")||da.equals("FRIDAY")||da.equals("FRI")){
	System.out.println("Working day");
}
	else if(da.equals("SATURDAY")||da.equals("SAT")||da.equals("SUNDAY")||da.equals("SUN")){
		System.out.println("Holiday");
	}
	else{
		System.out.println("Invalid data");
	}
in.close();
}
}
