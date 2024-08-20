public class FastPow {
    public static void main(String[] args) {
        test();
    }
    
    public static int pow(int a, int pow) {
        if (pow == 0) {
            return 1;
        } else if (pow % 2 == 0) {
            return pow(a * a, pow / 2);
        } else {
            return pow(a, pow - 1) * a;
        }
    }
    
    public static void test() {
        /*
        input 3 5
        3 4 *3
        9 2
        81 1
        81 0 *81
        return 1
        */
        System.out.println(pow(3, 5) == 243);
    }
}
