public class ArrayExample6{
	public static void main(String s[]) {
		System.out.println("Ram");
		int a[] = new int[10];
		for(int i=0;i<=5;i++) {
			a[i] = i;
		}
		for(int x:a) {
			System.out.print(x + " ");
		}
	}
}