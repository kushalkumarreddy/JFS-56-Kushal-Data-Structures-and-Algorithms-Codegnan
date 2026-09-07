package DSAPrograms.Searching;

public class FindeleSorted {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,6,7,8};
		int target = 6;
		boolean found = false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				found = true;
			}
			if(arr[i]>target) {
				break;
			}
		}
		System.out.println(found?"found ele":"not found");
	}

}
