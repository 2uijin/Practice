import java.util.*;
public class ol_4561_odd_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int sum =-1;
		int max =0;
		int cnt = 0;
		int odd [] = new int[7];
		int num [] = new int[7];
		for(int i =0 ; i<7 ; i++) {
			num[i] = sc.nextInt();
			if(num[i]%2 != 0) {
				sum = num[i] + sum;
				odd[cnt]= num[i];
				cnt++;
			}
		}//for
		
		System.out.println(sum+1);
		int temp =0;
		for(int i =0 ; i<7 ; i++) {
			for(int j =i; i<7; i++) {
				if(odd[i]<odd[j]&&odd[i]!=0) {
					temp=odd[i];
					odd[i] = odd[j];
					odd[j] = temp;
				}
			}
		}//for
		System.out.println(odd[0]);
	}//main
}
