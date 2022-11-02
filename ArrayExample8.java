public class ArrayExample8{
	public static void main(String s[]) {
		System.out.println("ram ji");
		int a[][] = {{10,20,30,40},{40,50,60,70},{80,90,10,20}};
		System.out.println(a[0][1]);
		System.out.println();
		for(int x:a[0]) {
			System.out.print(x);
			System.out.println();
		}
		for(int x[]:a) {
			System.out.println();
			for(int y:x) {
				System.out.print(y);
			}
		}
		System.out.println();
		for(int x=0;x<a.length;x++) {
			System.out.println();
			for(int y=0;y<a[x].length;y++) {
				System.out.print(a[x][y]);
			}
		}
		
	}
}