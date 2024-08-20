import java.util.Arrays;

/*O(N^2)*/
public class BubbleSort {
    public static void main(String[] args) {
        test();
    }
    
    public static void sort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input.length - i; j++) {
                if (input[j] > input[j+1]) {
                    int tmp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = tmp;
                }
            }
        }
    }
    
    public static void test() {
        int[] testArr = new int[] {5, 4, 3, 2, 1};
        int[] expectedArr = new int[] {1, 2, 3, 4, 5};
        
        sort(testArr);
        
        System.out.println(Arrays.equals(expectedArr, testArr));
    }
}