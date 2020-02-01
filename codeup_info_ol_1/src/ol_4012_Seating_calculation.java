import java.util.*;
public class ol_4012_Seating_calculation {
	public static void main(String[]args) {
		Scanner sc= new Scanner (System.in);
		
		String score = sc.next();
		//String score = "80 90 50 40 80";
		String[] scr = score.split(" ");
		
		int [][] cal = new int[scr.length][2];
		
		for(int i =0 ; i< scr.length ; i++) {
			cal[i][0] = Integer.parseInt(scr[i]);
		}
		
		for(int i =0 ; i< scr.length ; i++) {
			cal[i][1]=1;
			for(int j =0 ; j< scr.length ; j++) {
				if(i!=j) {
					if(cal[i][0]<cal[j][0]) {
						cal[i][1]++;
					}
				}//if
			}//for
		}//for
		
		for(int i =0 ; i< scr.length ; i++) {
			System.out.println(cal[i][0]+"  "+cal[i][1]);
		}//for
		
		
	}//main
}
