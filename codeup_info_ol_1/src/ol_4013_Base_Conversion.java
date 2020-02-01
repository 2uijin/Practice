import java.util.*;
public class ol_4013_Base_Conversion {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int in= sc.nextInt();
		
		String binary = Integer.toBinaryString(in);
		String octor = Integer.toOctalString(in);
		String Hexs = Integer.toHexString(in);
		
		System.out.println("2  "+binary);
		System.out.println("8  "+octor);
		System.out.println("16  "+Hexs.toUpperCase());
		
		
	}//main
}
