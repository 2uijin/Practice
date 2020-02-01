import java.util.*;
public class ol_4026_Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int temp =0;
		int median =0 ;
		int num[] = new int[5];
		for(int i =0; i< 5; i++) {
			num[i]= sc.nextInt();
		}//for
		for(int i =0; i< 5; i++) {
			for(int j = i ; j<5; j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i] = num[j];
					num[j]= temp;
				}//if
			}
		}//for
		
		System.out.println(num[2]);
	}//main
}
