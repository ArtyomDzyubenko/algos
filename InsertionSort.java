import java.util.Arrays;

/*O(N^2)*/
public class InsertionSort {
    public static void main(String[] args) {
        test();
    }
    
    public static void sort(int[] input) {
        for (int top = 0; top < input.length; top++) {
            int k = top;
            
            while((k > 0) && (input[k-1] > input[k])) {
                int tmp = input[k];
                input[k] = input[k-1];
                input[k-1] = tmp;
                
                k--;
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