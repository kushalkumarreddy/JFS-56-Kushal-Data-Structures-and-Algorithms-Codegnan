package DSAPrograms;

public class RightRotate {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int k = 2;

        for (int r = 1; r <= k; r++) {
            int last = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = last;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}