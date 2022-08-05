package Week3.Day2;

import java.util.Set;
import java.util.TreeSet;

public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {10,9,7,6,5,4,3,2,1};
		boolean flag;
		Set<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<num.length;i++) {
			set.add(num[i]);	
		}
		System.out.println(set);

		for(int j=1;j<=set.size();j++) {
			if(set.contains(j)) {
				flag=true;
			}
			else {
				System.out.println("The missing number is "+j);
			}
		}
	}

}