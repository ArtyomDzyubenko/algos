import java.util.Arrays;

/*O(N^2)*/
public class SelectionSort {
    public static void main(String[] args) {
        test();
    }
    
    public static void sort(int[] input) {
        for (int pos = 0; pos < input.length - 1; pos++) {
            for (int k = pos + 1; k < input.length; k++) {
                if (input[k] < input[pos]) {
                    int tmp = input[pos];
                    input[pos] = input[k];
                    input[k] = tmp;
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