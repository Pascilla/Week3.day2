package Week3.Day2;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {2,3,5,6,3,2,1,4,2,1,6,-1};

		Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
		for(int i=0;i<num.length;i++) {
			if(map.containsKey(num[i])) {
				map.put(num[i], map.get(num[i])+1);
			}
			else {
				map.put(num[i], 1);
			}
		}
		System.out.println("Count for each item in list : "+map);
	}

}
