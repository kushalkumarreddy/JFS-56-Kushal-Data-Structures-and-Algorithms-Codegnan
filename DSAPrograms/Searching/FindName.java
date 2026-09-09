package DSAPrograms.Searching;

public class FindName {
    public static void main(String[] args) {

        String[] names = {"Anil", "Kiran", "Ravi", "Suresh", "Varun"};
        String target = "Ravi";

        int left = 0;
        int right = names.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int cmp = names[mid].compareTo(target);

            if (cmp == 0) {
                System.out.println("Found at: " + mid);
                return;
            } 
            else if (cmp > 0) {
                right = mid - 1;
            } 
            else {
                left = mid + 1;
            }
        }

        System.out.println("Name not found");
    }
}