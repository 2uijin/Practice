import java.util.*;
public class ol_4531_Representative_value {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int num [] = new int[5];
		int temp =0;
		int sum =0;
		for(int i =0 ; i <5 ; i++) {
			num[i]= sc.nextInt();
			sum = sum +num[i];	
		}
		
		for(int i =0 ; i <5 ; i++) {
			for(int j =i; j<5; j++) {
			if(num[i]<num[j]) {
				temp = num[i];
				num[i]=num[j];
				num[j] = temp; 
				}
			}		
		}
	
		
		System.out.println(sum/5);
		System.out.println(num[2]);
	}//main
}
