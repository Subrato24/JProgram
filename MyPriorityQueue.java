package Collections;
import java.util.*;

public class MyPriorityQueue implements Comparator {
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i1.compareTo(i2);
	}
	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue(11,new MyComparator());
		q.peek();
		//q.element();
		System.out.println(q);
		q.offer(24);
		q.add(12);
		q.offer(19);
		q.add(98);
		Iterator itr = q.iterator();
		while(itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);
		}
		System.out.println(q.poll());
		System.out.println(q);
	}

}
