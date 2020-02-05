import java.util.*;
public class ol_4566_prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int m =0; 
		int n = 0;
		int sum = 0;
		int cnt =0;
		
		m =sc.nextInt();
		n = sc.nextInt();
		
		for(int i = m ; i <=n; i++) {
			for(int j = 2; j<=n; j++) {
				if(i%j ==0)cnt++;
			}
			if(cnt ==1) {
				sum += i;
			}
			cnt = 0;
		}//for 가장 작은 소수
		
		System.out.println(sum);
		for(int i = m ; i <=n; i++) {
			for(int j = 2; j<=n; j++) {
				if(i%j ==0)cnt++;
			}
			if(cnt ==1) {
				System.out.println(i);
				System.exit(0);
			}
			cnt = 0;
		}//for 가장 작은 소수
	}

}
