import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,max;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the Array Element:");
		for(int i=0;i<a.length;i++) 
			a[i] = sc.nextInt();
			
			for(int i=0;i<a.length;i++) {
				
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					max=a[i];
					a[i]=a[j];
					a[j]=max;
				}
			}
		}
			System.out.println("second largest number:" + a[n-2]);
		
		
		
		
		

	}

}
