import java.util.List;
import java.util.ArrayList;

public class GenerateNumbers {
	public static void main(String[] args) {
		test();
	}
	
	public static void generate(int radix, int numberLength, List<Integer> prefix) {
		if (numberLength == 0) {
			System.out.println(prefix.toString());
		} else {
			for (int digit = 0; digit < radix; digit++) {
				prefix.add(digit);
				generate(radix, numberLength - 1, prefix);
				prefix.remove(prefix.size() - 1);
			}
		}
	}
	
	/*n чисел в m позициях*/	
	public static void generatePermutations(int n, int m, List<Integer> prefix) {
		if (m == 0) {
			System.out.println(prefix.toString());
		} else {
			for (int number = 1; number <= n; number++) {
				if (!prefix.contains(number)) {
					prefix.add(number);
					generatePermutations(n, m - 1, prefix);
					prefix.remove(prefix.size() - 1);
				}
			}
		} 
	}
	
	
	
	public static void test() {
		//generate(3, 3, new ArrayList<>());
		generatePermutations(3, 3, new ArrayList<>());
	}
}