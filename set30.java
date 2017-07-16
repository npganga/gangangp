package beginner;

public class set30 {
	public static void main(String[] args){
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=15;i++){
			sum1+=i;
		}
		System.out.println("sum of numbers from 1 to 15 "+sum1);
		for(int i=15;i<=45;i+=2){
			sum2+=i;
		}
		System.out.println("sum of odd numbers from 15 to 45 "+sum2);
	}
}
