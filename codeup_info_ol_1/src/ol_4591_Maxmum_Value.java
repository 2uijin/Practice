import java.util.*;
public class ol_4591_Maxmum_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int num=0;
		int max =0;
		int idx =0;
		
		for(int i = 0; i<9; i++) {
			num = sc.nextInt();
			if(num>max) {
				max=num;
				idx = i;
			}//if
		}	
		System.out.println(max);
		System.out.println(idx+1);
	}

}
