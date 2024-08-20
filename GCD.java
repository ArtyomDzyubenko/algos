public class GCD {
    public static void main(String[] args) {
        test();
    }
    
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    public static void test() {
        System.out.println(gcd(6, 4) == 2);
        System.out.println(gcd(4, 6) == 2);
    }
}