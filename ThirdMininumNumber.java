import java.util.Scanner;

public class ThirdMininumNumber {

	public static void main(String[] args) {
		int n,min;
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Array Size:");
	    n =sc.nextInt();
	    int a[] =new int[n];
	    System.out.println("Enter the Array elements:");
	    for(int i=0;i<a.length;i++)
	    	a[i] =sc.nextInt();
	    for(int i=0;i<a.length;i++) {
	    	for(int j=i+1;j<a.length;j++) {
	    		if(a[i]<a[j]) {
	    			min=a[i];
	    			a[i]=a[j];
	    		   a[j]=min;
	    		}
	    	}
	    }
	    System.out.println("Third Smalest Number:"+a[n-3]);
	    
	    
	    
		

	}

}
