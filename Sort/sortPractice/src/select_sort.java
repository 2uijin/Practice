import java.util.Scanner;

public class select_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a  = new int[100];
		int n,i,j,temp,min;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		for(i= 1;i<=n;i++)
			a[i]=sc.nextInt();
		
		for(i=1;i<n;i++) {
			min=i;
			for(j=1+i; j<=n; j++) {
				if(a[i]>a[j]) {
					min=j;
				}//if
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}//for
		
		for(i=1;i<=n; i++)
			System.out.println(a[i]);
	}

}
