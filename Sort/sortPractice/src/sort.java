import java.util.*;
public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int num[] = new int[3];
		int temp=0;
		
		for(int i =0; i<num.length; i++)
			num[i] = sc.nextInt();
		
		for(int i = 0; i<num.length; i++) {
			for(int j = i; j<num.length; j++) {
				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}//if
			}//for
		}
		
		for(int i =0; i<num.length; i++)
			System.out.println(num[i]);
	}

}
