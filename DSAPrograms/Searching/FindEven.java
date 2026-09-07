package DSAPrograms.Searching;

public class FindEven {
	public static void main(String[] args) {
		
		int arr[] = {13,8,5,78,33,90,23};
		
		for(int num:arr) {
			if (num%2==0) {
				System.out.println("Found even num: "+num);
				return;
			}
		}
		System.out.println("no ele found");
	}

}
