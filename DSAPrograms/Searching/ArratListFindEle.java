package DSAPrograms.Searching;

import java.util.Arrays;
import java.util.List;

public class ArratListFindEle {
	public static void main(String[] args) {
//		ArrayList<String> li = new ArrayList<>();
//		
//		li.add("pen");
//		li.add("paper");
//		li.add("book");
//		li.add("pencil");
//		
//		String target = "book";
//		
//		if(li.contains(target)) {
//			System.out.println("present");
//		} else {
//			System.out.println("not present");
//		}
		
		List<String> list = Arrays.asList("pen","paper","book","pencil");
		String target = "book";
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals(target)) {
				System.out.println("found string: "+i);
				return;
			}
		}
		System.out.println("no element found");
	}

}
