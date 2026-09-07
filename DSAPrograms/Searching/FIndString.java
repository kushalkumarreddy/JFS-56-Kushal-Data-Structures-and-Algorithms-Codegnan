package DSAPrograms.Searching;

public class FIndString {
	public static void main(String[] args) {
		
		String[] name = {"bahu","bali","deva","sena"};
		String target = "sena";
		boolean found = false;
		
		for(String str:name) {
			if(str.equals(target)) {
				found=true;
				break;
			}
		}
		System.out.println(found?"present":"not present");
	}

}
