import java.util.*;
public class ol_4051_Overtime_Pay {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		float s =0;
		float e =0;
		float sum =0;
		int money =0;
		float num =0;
		for(int i=0 ; i<5;i++) {
			s =sc.nextFloat();
			e=sc.nextFloat();
			num= e-s;
			if(num>=1.0) {
				if(num>=5) sum = sum+4;
				else sum = sum+(num-1);
			}//if
		}//ют╥б
		money = (int)((sum/0.5)*5000);
		if(sum>=15) money=(int)(money-(money*0.05));
		else if(sum<=5)  money=((int)(money*0.05))+money;
		System.out.println(money);
	}
}
