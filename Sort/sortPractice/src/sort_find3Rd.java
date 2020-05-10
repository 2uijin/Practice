import java.util.*;


public class sort_find3Rd {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int num = sc.nextInt();
		sort_find3Rd_stu temp ;
		
		sort_find3Rd_stu[] stu = new sort_find3Rd_stu[num];
		
		for(int i = 0; i<stu.length; i++) {
			stu[i] = new sort_find3Rd_stu();
			stu[i].name= sc.next();
			stu[i].scr=sc.nextInt();
		}

		
		for(int i = 0; i<num; i++) {
			for(int j = i; j<num; j++) {
				if(stu[i].scr>stu[j].scr) {
					temp = stu[i];
					stu[i]= stu[j];
					stu[j]= temp;
				}//if
			}
		}
				
		for(int i = 0; i<stu.length; i++) {
			System.out.println(stu[i].name + " " + stu[i].scr);
		}
		System.out.println(stu[num-3].name);

		
	}

}
