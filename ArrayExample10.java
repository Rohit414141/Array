public class ArrayExample10 {
	public static void main(String[] args) {
		print(new int[]{23,4,56,8,9,8,24,5,45,4,6,56});
	}
	static void print(int k[]) {
		for (int x : k) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}