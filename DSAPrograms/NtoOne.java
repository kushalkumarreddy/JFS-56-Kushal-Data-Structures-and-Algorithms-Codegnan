package DSAPrograms;

public class NtoOne {
	public static void print(int n) {
		
		//base condition
		if(n==0) {
			return;
		}
		System.out.println(n);
		print(n-1);
	}
	
	public static void main(String[] args) {
		print(6);
		System.out.println("------------");
		int n=5;
		for(int i=n;i>=1;i--) {
			
		}
	}

}
