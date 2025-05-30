package Day04;
public class SetOrNot {

    static class CheckBit {
        static boolean checkKthBit(int n, int k) {
            return ((n >> k) & 1) == 1;
        }
    }

    public static void main(String[] args) {
        int n = 5;   // Binary: 0101
        int k = 2;

        if (CheckBit.checkKthBit(n, k)) {
            System.out.println("The " + k + "-th bit is set.");
        } else {
            System.out.println("The " + k + "-th bit is not set.");
        }
    }
}
