package week3.day2;

import java.util.LinkedHashSet;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			lhs.add(arr[i]);
			
		}for(int i=1;i<lhs.size();i++) {
			if(!(lhs.contains(i))) {
				System.out.println("Element missing is " + i);
			}
		}

	}

}
