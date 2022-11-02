class Animal{
	String name;
	int age;
	void show() {
		System.out.println(name + " " + age);
	}
}
public class ArrayExample7{
	public static void main(String s[]) {
		System.out.println("god");
		Animal a[] = new Animal[3];
		//a[0] = new Animal();
		//a[1] = new Animal();
		//a[2] = new Animal();
		for(int i=0;i<a.length;i++) {
			a[i]= new Animal();
		}
		a[0].show();
		a[1].show();
		a[2].show();
		a[0].name  = "rohit";
		a[0].age= 10;
		a[1].name="mishra";
		a[1].age=21;
		a[0].show();
		a[1].show();
	}
	
	
}