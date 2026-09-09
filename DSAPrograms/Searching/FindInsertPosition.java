package DSAPrograms.Searching;

public class FindInsertPosition {
	public static void main(String[] args) {
		
		int arr[] = {1,3,4,5};
		int target = 2;
		
		int left = 0;
		int right = arr.length-1;
		
		int mid = (left+right)/2;
		if(arr[mid]<target) {
			left=mid+1;
		} else {
			right = mid-1;
		}
		System.out.println("position is: "+left);
	}

}
