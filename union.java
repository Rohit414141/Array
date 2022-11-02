import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class union {
	
	public static void main(String[] args) {
		/*Integer arr1[] = {1,2,3,4,5};
		Integer arr2[] = {2,6,7,3,8};
		
		HashSet<Integer> set  = new HashSet<Integer>();
		set.addAll(Arrays.asList(arr1));
		set.addAll(Arrays.asList(arr2));
		
		System.out.println(set);
		
		Integer union[] = {};
		union = set.toArray(union);
		
		System.out.println(Arrays.toString(union));
		
		*/
		
		Integer a1[] = {1,2,3,4,5,6};
		Integer a2[] = {3,4,5,6,7,8,9};
		HashSet<Integer> set  = new HashSet<Integer>();
		set.addAll(Arrays.asList(a1));
		set.addAll(Arrays.asList(a2));
		Integer union[] = {};
		union = set.toArray(union);
		System.out.println(Arrays.toString(union));
		
		
		
	}

}
