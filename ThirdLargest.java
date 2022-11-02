import java.util.Scanner;

public class ThirdLargest {

	public static void main(String[] args) {
		int n,max;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the Array Elements:");
		for(int i=0;i<a.length;i++)
			a[i] =sc.nextInt();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					max=a[i];
					a[i]=a[j];
					a[j]=max;
					
				}
				
			}
		}
		System.out.println("Third Largest Number:" + a[n-3]);
		
		

	}

}
