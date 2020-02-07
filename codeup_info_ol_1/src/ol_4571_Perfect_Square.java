import java.util.*;
public class ol_4571_Perfect_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int sum =-1;
		
		int min = (int)(Math.ceil(Math.sqrt(m)));
		int max = (int)(Math.floor(Math.sqrt(n)));
		
		for(int i = min; i<= max; i++) {
			sum += Math.pow(i, 2);
		}
		
		System.out.println(sum+1);
		System.out.println((int)(Math.pow(min, 2)));
	}//main

}
