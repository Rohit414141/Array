import java.util.*;
public class IPLec10{
	public static void main(String s[]) {
		Scanner sc  = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		//input
		for(int i=0;i<a.length;i++) {
			 a[i] = sc.nextInt();
		}
		//output
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
	}
}