package DSAPrograms;

public class FindMissingElement {
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 5, 6};
        int n = 6;
        int sum = 0;

        // Sum of array elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        // Sum of numbers from 1 to n
        int total = n * (n + 1) / 2;

        // Find missing value.
        int missing = total - sum;
        System.out.println(missing);
	}

}
