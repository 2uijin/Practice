import java.util.*;
public class ol_4536_Representative_value_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num [] = new int[10];
		int cnt [] = new int [10];
		int sum =0;
		int max = Integer.MIN_VALUE;
		int mode =0;
		
		for(int i =0 ; i <num.length ; i++) {
			num[i]= sc.nextInt();
			sum = sum +num[i];	
			cnt[num[i]/10]++; //codeup¿¡¼­ java.lang.ArrayIndexOutOfBoundsException: 95 
		}
		
		for(int i =0; i<cnt.length;i++) {
			if(max < cnt[i]) {
				max = cnt[i];
				mode = i;
			}
		}
		
		System.out.println(sum/10);
		System.out.println(mode*10);
	}

}
