
public class ArrayExample9 {

	public static void main(String[] args) {
		int a[] = new int[] {10,20,30,40,2,41,80,90,100};
		print(a);
		for(int x:a) {
			System.out.print(x + " ");
		}
		
		
		System.out.println();
		
	}
	
	
	static void print(int k[]) {
		for(int y:k) {
			k[2] = 300;
			System.out.print(y + " ");
		}
		System.out.println();
	}

}
