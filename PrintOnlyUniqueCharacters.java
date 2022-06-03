package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class PrintOnlyUniqueCharacters {

	public static void main(String[] args) {
		String strName = "babu";

		// converted to character array 
		char[] allChars = strName.toCharArray();

		// Create Set of Character
		Set<Character> unique = new HashSet<Character>();


		// travel to each character
		for (int i = 0; i < allChars.length; i++) {
			
			if(!unique.add(allChars[i])) {
				unique.remove(allChars[i]);
			}
		}
		
		System.out.println(unique);
		
	}

}

