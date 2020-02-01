import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class ol_4501_SnowWhite_and_Dwarf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int max =0; 
		int scmax =0;
		int in =0;
		Scanner sc = new Scanner (System.in);
		for(int i =0; i<7; i++) {
			in= sc.nextInt();
			if(in>max) { 
				scmax = max;
				max=in;
			}
			else if(in>scmax) {
				scmax =in;
			}
		}//ют╥б
		System.out.println(scmax);
		System.out.println(max);*/
		
		LocalDateTime dt = LocalDateTime.of(2014, 7,31,1,1);
		dt.plusDays(30);
		dt.plusMonths(1);
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
	}//maim
}