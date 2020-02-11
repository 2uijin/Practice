import java.util.*;
public class ol_4621_Measure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int cnt = sc.nextInt();
		int c =0;
		int ans =0;
		for(int i =1; i<=num; i++) {
			if(num%i==0) {
				c++;
				if(cnt==c)ans =i;
			}//if
		}//for
		System.out.println(ans);
	}

}
