import java.util.Arrays;

public class MergeArraysSort {

	public static void main(String[] args) {
		int arrayOne[] = {10,2,52,14,15,28,100};
		int arrayTwo[] = {17,16,28,19,35};
		int thirdArray[] = new int[arrayOne.length+arrayTwo.length];
		int index  = arrayOne.length;
		
		for(int i=0;i<arrayOne.length;i++) {
			thirdArray[i] = arrayOne[i];
		}
		for(int j=0;j<arrayTwo.length;j++) {
			thirdArray[index] =arrayTwo[j];
			index++;
		}
		
		Arrays.sort(thirdArray);
		for(int k=0;k<thirdArray.length;k++) {
			System.out.println(thirdArray[k]);
		}

	}

}
