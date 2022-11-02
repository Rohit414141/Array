
public class ArrayExample4 {

	public static void main(String[] args) {
		int a[] = {10,20,30,4,0,5,8,0,7,6,90,500,40,80,10,20,60};
		System.out.println();
		System.out.println("print riverse elemnsts");
		for(int x=a.length-1;x>=0;x--) {
			System.out.println(a[x]);
		}
		System.out.println("print skipp elemets");
		for(int x=0;x<a.length;x+=2) {
			System.out.println(a[x]);
		}
		
		int sum = 0;
		for(int x:a) {
			sum +=x;
			
		}
		System.out.println("sum = " + sum);
	}

}

	

	
	
	



