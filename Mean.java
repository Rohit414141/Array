
public class Mean {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,345,312,756,0,-234321132,234};
		int sum = 0;
		for(int n:a) {
			sum  =sum+n;
		}
		System.out.println("sum = "+sum);
		
		
		int b = a.length;
		System.out.println("lenth="+b);
		
		int c = sum/b;
		System.out.println("mean = "+ (double)c);
	}

}
