package Week3.Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="We learn java basics as part of java sessions in java week1";
		int count=0;
		String duplicate="";
		String[] s=text.split(" ");
		Set<String> set=new LinkedHashSet<String>();
		for(int i=0;i<s.length;i++) {
			boolean flag=set.add(s[i]);
			if(flag==false) {
				count++;	
				duplicate=s[i];
			}
		}
		StringBuilder sb=new StringBuilder();
		for (String string : set) {
			sb.append(string);
			sb.append(" ");
		}
		System.out.println(sb);
		System.out.println("The duplicate word is "+ duplicate +" which of count "+count);
	}

}
