import java.util.List;
import java.util.ArrayList;

public class Fibonacci {
	public static void main(String[] args) {
		test();
	}
	
	public static int fib(int n) {
		List<Integer> fibList = new ArrayList<>();
		fibList.add(0);
		fibList.add(1);
		
		for (int i = 2; i <= n; i++) {
			fibList.add(fibList.get(i - 1) + fibList.get(i - 2));
		}
		
		return fibList.get(n);
	}
	
	public static int fibSum(int n) {
		if (n == 0) {
			return 0;
		}
		
		if (n == 1) {
			return 1;
		}
		
		int nMinus1 = 0;
		int nMinus2 = 1;
		int sum = 0;
		
		for (int i = 2; i <= n; i++) {
			sum = nMinus1 + nMinus2;
			nMinus1 = nMinus2;
			nMinus2 = sum;
		}
		
		return sum;
	}
	
	public static void test() {
		System.out.println(fib(6));
		System.out.println(fibSum(6));
	}
}