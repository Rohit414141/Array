
public class NextGreaterElement {
	public static void main(String[] args) {
		/*int array[] = {11,21,22,13,14,3};
	   
		int next,i,j;
		for(i=0;i<array.length;i++) {
			
			next = -1;
			for(j=i+1;j<array.length;j++) {
				if(array[i]<array[j]) {
					next  = array[j];
					break;
				}
			}
			System.out.println(array[i]+","+next);
		
		}
		*/
		
		int num[] = {10,12,15,18,6,11,8,4};
		for(int i=0;i<num.length;i++) {
			int next  = -1;
			for(int j=i+1;j<num.length;j++) {
				if(num[i]<num[j]) {
					next  = num[j];
					break;
				}
			}
			System.out.println(num[i]+","+next);
		}
		
	}

	}

