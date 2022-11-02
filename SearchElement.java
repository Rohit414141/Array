import java.util.*;
public class SearchElement{
	public static void main(String s[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size:");
	int size = sc.nextInt();
	int a[] = new int[size];
	System.out.println("eneter the numbers:");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("search element:");
	int x=sc.nextInt();
	for(int i=0;i<a.length;i++) {
		if(a[i]==x) {
			System.out.println(x+"is position " + i);
		}
	}
		

		
	}
}