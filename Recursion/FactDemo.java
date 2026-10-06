package Recursion;

public class FactDemo {

    public static int factLoop(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static int factRec(int n) {

        if (n == 0) {
            return 1;
        }

        return n * factRec(n - 1);
    }

    public static void main(String[] args) {

        System.out.println("Loop: " + factLoop(5));
        System.out.println("Recursion: " + factRec(5));
    }
}