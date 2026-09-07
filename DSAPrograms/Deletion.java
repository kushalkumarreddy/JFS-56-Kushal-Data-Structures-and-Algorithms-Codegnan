package DSAPrograms;

public class Deletion {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40};

        int position = 3;

        // creating new array with one less length
        int newArr[] = new int[arr.length - 1];

        // copying values before the position
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        // copying remaining values
        for (int i = position; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }

        // traversing values
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        
        System.out.println("after deletion specific position element");
        for(int x:newArr) {
        	
        }
    }
}