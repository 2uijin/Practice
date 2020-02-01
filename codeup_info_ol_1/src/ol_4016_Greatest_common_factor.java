import java.util.*;
public class ol_4016_Greatest_common_factor {
	public static void main(String []args) {
		Scanner sc= new Scanner (System.in);
		int scr=1;
		int max =0;
		int temp=0;
		int[] num=new int[3];
		for(int i=0; i<3; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i<3; i++) {
			for(int j =i; j<3; j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]= num[j];
					num[j] = temp;
				}
			}
		}
		
		for(int i =1; i<=num[0];i++) {
			if(num[0]%i==0 &&num[1]%i==0 &&num[2]%i==0) {max = i;}
		}

		System.out.println(max);
	
	}//main
}
