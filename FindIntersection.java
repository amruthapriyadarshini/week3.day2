package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		//Set collection to store first array
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(3);
		set1.add(2);
		set1.add(11);
		set1.add(4);
		set1.add(6);
		set1.add(7);
		//Set collection to store second array
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(1);
		set2.add(2);
		set2.add(8);
		set2.add(4);
		set2.add(9);
		set2.add(7);
		set1.retainAll(set2);
		//To print the intersection of both the set
		System.out.println(set1);
		
		
		
		

	}

}
