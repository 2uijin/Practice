import java.util.*;
public class ol_4021_Sum_of_odd_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int sum =-1;
		int num[] = new int[7];
		for(int i =0; i<7; i++) {
			num[i]=sc.nextInt();
			if(num[i]%2!=0) {
				sum = sum+num[i];
			}//if
		}//for
		if(sum==-1)System.out.println(sum);
		else System.out.println(sum+1);
	}//main

}
