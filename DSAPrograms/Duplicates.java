package DSAPrograms;

public class Duplicates {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 10};

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    System.out.println("Duplicate: " + arr[i]);
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No duplicate found");
        }
    }
}