import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		test();
	}
	
	public static void sort(int[] arr) {
		if (arr.length <= 1) {
			return;
		}			
		
		int mid = arr.length / 2;
		int[] left = Arrays.copyOfRange(arr, 0, mid);
		int[] right = Arrays.copyOfRange(arr, mid, arr.length);
		sort(left);
		sort(right);
		int[] res = merge(left, right);
		System.arraycopy(res, 0, arr, 0, res.length);
	}
	
	public static int[] merge(int[] a, int[] b) {
		int[] res = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				res[k] = a[i];
				i++;
			} else {
				res[k] = b[j];
				j++;
			}
			
			k++;
		}
		
		while (i < a.length) {
			res[k] = a[i];
			i++;
			k++;
		}
		
		while (j < b.length) {
			res[k] = b[j];
			j++;
			k++;
		}
		
		return res;
	}
	
	public static void test() {
		int[] arr = new int[]{5,4,3,2,1};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}