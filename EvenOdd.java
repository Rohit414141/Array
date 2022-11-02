public class EvenOdd{
	public static void main(String[] args) {
		int a[] = {10,11,12,3,14,16,15,17,18};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+", ");
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+", ");
			}
		}
		System.out.println();
		
		int n = 10;
		int sum = 0;
		for(int j=2;j<=n;j+=2) {
				sum  = sum+j;
			
		}
		System.out.println("sum=" +sum);
		
	}
}




