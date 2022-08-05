package Week3.Day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={1,7,11,4,6,2};
		int[] b={1,2,8,4,9,7};
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			list1.add(a[i]);
		}
		for(int j=0;j<b.length;j++) {
			list2.add(b[j]);
		}
		System.out.println("First Set :"+list1);
		System.out.println("Second Set :"+list2);
		System.out.println("The intersection between the arrays are");
		for(int k=0;k<list1.size();k++) {
			for(int l=0;l<list2.size();l++) {
				if(list1.get(k)==list2.get(l)) {
					System.out.println(list1.get(k));
				}
			}
		}
	}

}
