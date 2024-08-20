import java.util.List;
import java.util.ArrayList;

public class QuickSort {
	public static void main(String[] args) {
		test();
	}
	
	public static void sort(List<Integer> arr) {
		if (arr.size() <= 1) {
			return;
		}			
		
		int barrier = arr.get(0);
		List<Integer> left = new ArrayList<>();
		List<Integer> mid = new ArrayList<>();
		List<Integer> right = new ArrayList<>();
		
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) < barrier) {
				left.add(arr.get(i));
			} else if (arr.get(i) == barrier) {
				mid.add(arr.get(i));
			} else {
				right.add(arr.get(i));
			}
		}
		
		System.out.println("left = " + left.toString() + 
							" mid = " + mid.toString() +
							" right = " + right.toString());
		
		sort(left);
		sort(right);
		
		int iRes = 0;
		
		for (int i = 0; i < left.size(); i++) {
			arr.set(iRes, left.get(i)); 
			iRes++;
		}
		
		for (int i = 0; i < mid.size(); i++) {
			arr.set(iRes, mid.get(i)); 
			iRes++;
		}
		
		for (int i = 0; i < right.size(); i++) {
			arr.set(iRes, right.get(i)); 
			iRes++;
		}
		
		System.out.println("arr = " + arr.toString());
	}
	
	public static void test() {
		List<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(2);
		arr.add(4);
		arr.add(5);
		arr.add(1);
		
		sort(arr);
		System.out.println(arr.toString());
	}
}