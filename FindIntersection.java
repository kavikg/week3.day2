package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a1 = { 3, 2, 11, 4, 6, 7 };
		Integer[] a2 = { 1, 2, 8, 4, 9, 7 };
		Set<Integer> s1 = new LinkedHashSet<Integer>();
		Set<Integer> s2 = new LinkedHashSet<Integer>();
		s1.addAll(Arrays.asList(a1));
		s2.addAll(Arrays.asList(a2));
		s1.retainAll(s2);
		System.out.println("Intersection of 2 arrays are " + s1);
		
		
		
	}

}
