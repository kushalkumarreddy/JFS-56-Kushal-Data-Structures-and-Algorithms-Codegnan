package DSAPrograms;

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		int a[] = {1,2,2,4,6};
		int b[] = {2,2,3,4};
		
		for(int i=0;i<a.length;i++) {
			boolean alreadyPrint = false;
			
			for(int k=0;k<i;k++) {
				if(a[k]==a[i]) {
					alreadyPrint = true;
					break;
				}
			}
			if(alreadyPrint) {
				continue;
			}
			
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+" ");
					break;
				}
			}
		}
	}

}
