import java.util.Scanner;
public class ol_4031_Max_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int even =0;
		int odd =0;
		int temp=0;
		int num[] = new int[7];
		
		for(int i =0; i<7; i++) {
			num[i]=sc.nextInt();
		}//for
		
		for(int i =0; i< 7; i++) {
			for(int j = i ; j<7; j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i] = num[j];
					num[j]= temp;
				}//if
			}
		}//for
		
		for(int i =0; i<7; i++) {
			if(num[i]%2!=0) {
				even = num[i];
			}//if
			else odd= num[i];
		}//for
		if(odd ==0)System.out.println(even);
		else if(even ==0 )System.out.println(odd);
		else System.out.println(even+odd);
	}//main

}
