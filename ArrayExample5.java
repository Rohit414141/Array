import java.util.Scanner;
public class ArrayExample5{
	public static void main(String s[]) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		
		System.out.println("enterd numbers");
		for(int x= 0 ; x<a.length;x++) {
			a[x] = sc.nextInt();
			
			
			
		}
		
		System.out.println("enter total numbers");
		
		for(int z:a) {
			System.out.println(z);
		}
	}
}