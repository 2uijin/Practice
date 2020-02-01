import java.util.*;
public class ol_4506_Gcf_Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max =0;
		int min =0;
		int g =0;
		int l =0;
		if(a>b) {  max = a;  min =b;}
		else { max = b; min = a;}
		
		for(int i = 1; i<=min ; i++) {
			if(a%i==0 && b%i ==0) {
				g =i;
			}//if
		}//for
		System.out.println(g);

		for (int i =1 ; i<min; i++ ) {
			for(int j =1 ; j<=max; j++) {
				if(i*a < j*b) continue;
				if(i*a == j*b) {
					l = i*a;
					System.out.println(l);
					System.exit(0);
					break;
				}
			}
		}
		
	}//main

}
