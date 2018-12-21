package test;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {

	public ArrayList<String> commonKeyValues(ArrayList<Integer> lst, HashMap<Integer, String> hm) {
		ArrayList<String> st = new ArrayList<String>();
		for (Integer integers : hm.keySet()) {
			String adj = hm.get(integers);
			for (int i = 0; i < lst.size(); i++) {
				if (lst.get(i) == integers) {
					st.add(adj);
				}
			}
		}
		return st;
	}

}
