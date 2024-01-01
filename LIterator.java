package Collections;
import java.util.*;

public class LIterator {
	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i =0;i<=10;i++) {
			System.out.println(v.add(i));                //return type of add method id boolean but not for addElements
		}
		System.out.println(v);
		ListIterator itr = v.listIterator();
		System.out.println(itr.getClass().getName());
		while(itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if(i%2==0) {
				System.out.print(i+" ");
			}
			else {
				itr.remove();                             //elements which are not divisible by 2 are removed from list
			}
			if(i.equals(2)) {
				itr.remove();
			}
		}
		System.out.println();
		System.out.println(v);
		try {
		while(itr.hasPrevious()) {
			Integer i = (Integer) itr.previous();
			System.out.print(i+" ");
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
