package week3.day2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		Set<Integer> S = new TreeSet<Integer>();
		for (Integer i : arr) {
			if (S.add(i))
				continue;
				else {
				System.out.println(i);
			}

		}
	}

}
