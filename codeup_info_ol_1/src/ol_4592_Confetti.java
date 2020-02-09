import java.util.*;
public class ol_4592_Confetti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num[][] = new int[100][100];
		int cnt = sc.nextInt();
		int h=0,l=0;
		int p =0;
		
		for(int i =0; i<100; i++) {
			for(int j =0 ; j<100; j++) {
				num[i][j]=0;
			}
		}
		
		for(int i =0; i<cnt; i++) {
			h=sc.nextInt();
			l=sc.nextInt();
			for(int n = h; n<10+h; n++) {
				for(int m = l ; m <10+l;m++ ) {
					num[n][m]= num[n][m]+1;
				}
			}
		}//for
		
		for(int i =0; i<100; i++) {
			for(int j =0 ; j<100; j++) {
				if(num[i][j]>0) p++;
			}
		}
		System.out.println(p);
	}

}
