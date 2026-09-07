package DSAPrograms;

public class Insertion {
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40};
		int position = 2;
		int value = 25;
		
		//creating new array which extra length
		int newArr[] = new int[arr.length+1];
		
		//inserting values upto position
		for(int i=0;i<position;i++) {
			newArr[i] = arr[i];
		}
		
		//inserting at specific position
		newArr[position] = value;
		
		//remaining values insert into new arr
		for(int i=position; i<arr.length;i++) {
			newArr[i+1]=arr[i];
		}
		
		//traversing values
		for(int i=0;i<arr.length;i++) {
			System.out.println(newArr[i]+" ");
		}
	}

}
