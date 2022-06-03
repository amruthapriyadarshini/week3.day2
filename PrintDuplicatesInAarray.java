package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInAarray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> newSet = new HashSet<Integer>();
		for(int i = 0;i < arr.length;i++) {
			if(set.add(arr[i]) == false){
				newSet.add(arr[i]);
			}
		}
		System.out.println("Duplicate elements are "+newSet.toString());
	}
	

}

