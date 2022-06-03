package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MissingNumbers {

	public static void main(String[] args) {
		int[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};
		List lst = new ArrayList<Integer>();
		List lstUpdated = new ArrayList<Integer>();
		Integer secondValue = new Integer(20);
		Integer firstValue = new Integer(20);
		for(int i =0;i<numbers.length;i++) {
			lst.add(numbers[i]);
		}
		Collections.sort(lst);
		Iterator<Integer> iter = lst.iterator();
		System.out.println("size" +lst.size());
		
		for(int i=0;i<lst.size();i++) {
			 firstValue = (Integer)lst.get(i);
			if(i == lst.size()-1) {
			   break;
			}else {
				secondValue = (Integer)lst.get(i+1);
			}
			int resultValue = secondValue.intValue() - firstValue.intValue();
			if(resultValue !=1) {
				lstUpdated.add(secondValue);
			}
		}
		System.out.println(lstUpdated);
	}
	

}
