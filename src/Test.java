import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arr = new int[] {3,1,9,7,0,99,19};
		
		int[] result = mySortArray(arr);
		System.out.println(Arrays.toString(result));
		
		
		int[] arr1 = new int[] {87,1,99,19};
		int[] result1 = mySortArray(arr1);
		System.out.println(Arrays.toString(result1));
	}
	
	public void test(){}
	public static int[] mySortArray(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}

		return array;
	}
}
