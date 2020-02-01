import java.util.*;
public class ol_4011_birthday {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String gender = null;
		String info = sc.next();
		String year = info.substring(0,2);
		String month = info.substring(2,4);
		String day = info.substring(4,6);
		if(info.substring(7,8).equals("2")||info.substring(7,8).equals("4")){
			gender = "W";
		}
		else if(info.substring(7,8).equals("1")||info.substring(7,8).equals("3")){
			gender = "M";
		}

		if(info.substring(7,8).equals("1")||info.substring(7,8).equals("2")){
			System.out.println("19"+year+"/"+month+"/"+day+" "+ gender);
		}
		else if(info.substring(7,8).equals("3")||info.substring(7,8).equals("4")){
			System.out.println("20"+year+"/"+month+"/"+day+" "+ gender);
		}
		
		
	}

}
