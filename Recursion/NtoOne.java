package Recursion;

public class NtoOne {

    public static void print(int n) {

        // Base condition
        if (n == 0) {
            return;
        }

        System.out.println(n);

        print(n - 1);
    }

    public static void main(String[] args) {

        // Using recursion
        print(6);

        System.out.println("------------");

        // Using loop
        int n = 5;

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}