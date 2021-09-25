package week3.day2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MissingElementInanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Set<Integer> L = new TreeSet<Integer>();
		L.addAll(Arrays.asList(arr));
		int i = 1;
		for (Integer in : L) {
			if (in == i) {
				i = i + 1;
				
			} else {
				System.out.println(i);
				i=i+2;
			}
		}
	}
}
