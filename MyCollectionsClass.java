package Collections;
import java.util.*;
public class MyCollectionsClass {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(30);
		al.add(24);
		al.add(12);
		al.add(98);
		//al.add(null);
		System.out.println(al);
		Collections.sort(al);
		System.out.println("Default Natural Sorting:"+al);
		Collections.sort(al,new MyComparator());
		System.out.println("Coustomized Sorting:"+al);
	}
	static class MyComparator implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			Integer i1 = (Integer) o1;
			Integer i2 = (Integer) o2;
			return i2.compareTo(i1);
		}
		
	}	
}
