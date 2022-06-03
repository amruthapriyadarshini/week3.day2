package week3.day2;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		List<Integer> lstSecond = new LinkedList<Integer>();
		lstSecond.add(3);//2,11,4,6,7
		lstSecond.add(2);
		lstSecond.add(11);
		lstSecond.add(4);
		lstSecond.add(6);
		lstSecond.add(7);
		Collections.sort(lstSecond);
		int size = lstSecond.size();
		//How do i get the second largest  from set
		System.out.println("The second largest number is "+ lstSecond.get(size-2));
	
	}

}
