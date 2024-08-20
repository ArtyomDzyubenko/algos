import java.util.Arrays;

/*O(N) CPU, O(M) Memory*/
public class CountSort {
    public static void main(String[] args) {
        test();
    }
    
    public static void sort(int[] input) {
        int[] freq = new int[10];
        
        for (int i = 0; i < input.length; i++) {
            freq[input[i]]++;
        }
        
        int j = 0;

        for (int digit = 0; digit < 10; digit++) {
            for (int i = 0; i < freq[digit]; i++) {
                input[j] = digit;
                j++;
            }
        }
    }
    
    public static void test() {
        int[] testArr = new int[] {5, 4, 3, 2, 1};
        int[] expectedArr = new int[] {1, 2, 3, 4, 5};
        
        sort(testArr);
        
        System.out.println(Arrays.toString(testArr));
        
        System.out.println(Arrays.equals(expectedArr, testArr));
    }
}