package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count;
		text = text.toLowerCase();
		String[] text1 = new String(text).split(" ");
		Set<String> Str = new LinkedHashSet<String>();
		Str.addAll(Arrays.asList(text1));
		for (String string : Str) {
				System.out.println(string);
		}
		

	}

}
