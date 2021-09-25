package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] data = {3,2,11,4,6,7};
		List<Integer> L1 = new ArrayList<Integer>();
		L1.addAll(Arrays.asList(data));
		Collections.sort(L1);
		System.out.println(L1);
		System.out.println(L1.get(L1.size()-2));
		
	}

}
