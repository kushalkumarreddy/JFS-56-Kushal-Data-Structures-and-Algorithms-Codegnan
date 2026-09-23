package BubbleSort;

public class SelectionDemo {

	public static void SelectionSort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {

			int min = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			// Swapping
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	public static void main(String[] args) {

		int arr[] = {5, 3, 8, 1, 2};

		SelectionSort(arr);

		System.out.println("Sorted Array:");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}