package DSAPrograms;

public class ZeroNonZero {
	public static void main(String[] args) {

        int arr[] = {0, 5, 0, 3, 8, 0, 2};

        int index = 0;

        //non-zero elements first
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        //Fill remaining positions with zero
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
