public class BinarySearch {
	public static void main(String[] args) {
		test();
	}
	
	public static int find(int[] arr, int key) {
		int left = leftBound(arr, key);
		int right = rightBound(arr, key);
		
		if ((right - left) > 1) {
			return left;
		}
		
		return -1;
	}
	
	private static int leftBound(int[] arr, int key) {
		int mid = (left + right) / 2;
		int left = 0;
		int right = arr.length - 1;
		
		while ((right - left) > 1) {
			if (key > arr[mid]) {
				left = mid;
			} else {
				right = mid;
			}
		}
		
		return left;
	}
	
	private static int rightBound(int[] arr, int key) {
		int mid = (left + right) / 2;
		int left = 0;
		int right = arr.length - 1;
		
		while ((right - left) > 1) {
			if (key >= arr[mid]) {
				left = mid;
			} else {
				right = mid;
			}
		}
		
		return right;
	}
	
	public static void test() {
		int[] arr = new int[]{5,1,2,2,3,4,4,8};
		
		int index = find(arr, 2);
		System.out.println(2 == index);
		
		index = find(arr, 4);
		System.out.println(5 == index);
		
		index = find(arr, 10);
		System.out.println(-1 == index);
	}
}