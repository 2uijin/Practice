import java.util.*;
public class ol_4041_Use_Num {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int sum =0;
		int rev =0;
		int input = sc.nextInt();
	    int result = (int)Math.pow(10, (int)(Math.log10(input)));
	    //pow : ����
	    
	    //for(int i = 1; i<=result; i = i*10) {
	   /* for(int i = result; i>=1 ; i= i/10) {
	    	if(i==result) {
	    		rev = rev+input/result;
	    		sum = sum+input/result;
	    	}
	    	else {
	    		rev = rev+(input%result)*result;
	    		sum = sum+(input%result);
	    	}
	    }*/
	    
	    while(input!=0){
            //num�� 10���� ���� �������� sum�� ���Ѵ�.
            sum += input%10;
            rev += (input%10)*result;
            //num�� 10���� ���� ���� �ٽ� num�� �����Ѵ�.
            input /= 10;
            result /=10;
        }
	    
	    System.out.println(rev);
	    System.out.println(sum);
	}
}
