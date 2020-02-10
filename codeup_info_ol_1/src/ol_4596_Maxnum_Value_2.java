import java.util.*;
public class ol_4596_Maxnum_Value_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num[][] = new int[9][9];
		int max =0;
		int n=0,m=0;
		for(int i = 0; i<num.length; i++) {
			for(int j =0; j<num.length; j++) {
				num[i][j]=sc.nextInt();
				if(num[i][j]>max) {
					max = num[i][j];
					n=i+1;
					m=j+1;
				}
			}
		}//for
		
		System.out.println(max);
		System.out.println(n+" "+m);
	}

}
