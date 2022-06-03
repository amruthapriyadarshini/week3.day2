package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text ="We learn java basics as part of "
				+ "java sessions in java week1";
		
		String[] strSplit = text.split(" ");
		int index = 0;
		StringBuffer sb = new StringBuffer();
		 LinkedHashSet<String> lhSetWords 
         = new LinkedHashSet<String>( Arrays.asList(strSplit) );
		 for(String s:lhSetWords) {
			 if(index > 0) {
				 sb.append(" ");
				 
			 }
				 sb.append(s);
				 index++;
			 
				 
		 }System.out.println("After removing duplicate"+ sb.toString());
		
	}

}
