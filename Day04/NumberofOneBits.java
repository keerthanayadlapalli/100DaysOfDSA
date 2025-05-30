package Day04;
public class NumberofOneBits {
    static int setBits(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n = n & (n - 1);
        }
        return c;
    }

    public static void main(String[] args) {
        int num = 29; // Example number
        System.out.println("Number of set bits in " + num + " is: " + setBits(num));
    }
}
