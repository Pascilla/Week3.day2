package Week3.Day2;

import java.util.Set;
import java.util.TreeSet;

public class printDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> s=new TreeSet<Integer>();
		Set<Integer> duplicate=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			boolean flag=s.add(arr[i]);

			if(flag==false) { 
				duplicate.add(arr[i]);
			}

		}
		System.out.println("All Items in array without duplicate : "+s);
		System.out.println("Duplicate items in array is : "+duplicate);
	}

}