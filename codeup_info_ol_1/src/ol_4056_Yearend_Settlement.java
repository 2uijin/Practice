import java.util.*;
public class ol_4056_Yearend_Settlement {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int end =0;
		if(num<=500) {
			end = num*70/100;
		}
		else if(num>500&&num<=1500) {
			end = 350+(num-500)*40/100;
		}
		else if(num>1500&&num<=4500) {
			end = 750+(num-1500)*15/100;
		}
		else if(num>4500&&num<=10000) {
			end = 1200+(num-4500)*5/100;
		}
		else if(num>10000) {
			end = 1475+(num-10000)*2/100;
		}
		System.out.println(end);
	}//main
}
