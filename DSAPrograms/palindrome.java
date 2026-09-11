package DSAPrograms;

public class palindrome {
	 public static void main(String[] args) {

	        int arr[] = {1, 2, 3, 2, 1};

	        int left = 0;
	        int right = arr.length - 1;

	        boolean palindrome = true;

	        while (left < right) {

	            if (arr[left] != arr[right]) {
	                palindrome = false;
	                break;
	            }

	            left++;
	            right--;
	        }

	        if (palindrome) {
	            System.out.println("Array is Palindrome");
	        } else {
	            System.out.println("Array is Not Palindrome");
	        }
	    }
	
}
