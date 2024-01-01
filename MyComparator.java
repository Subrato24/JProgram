package Collections;
import java.util.*;

public class MyComparator implements Comparator{
	//comparator interface contain two methods one of them is compare which can be use for user-define sorting//
	@Override
	public int compare(Object o1, Object o2) {  //Here compare method is override for descending order//
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		
//		return i1.compareTo(i2);      //default CompareTo() method call
		
//		return -i1.compareTo(i2);    //Reverse default CompareTo() method call
		
//		return i2.compareTo(i1);     //Descending order
		
//		return +1;                  //Insertion order
		
//		return -1;                  //Reverse of insertion order
		
//		return 0;                   //Only first element 
		
		if(i1>i2) {
			return -1;
		}
		else if(i1<i2){
			return +1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		//If we don't use overridden comparator(),then JVM will by default call CompareTo() method which will sort the elements in ascending order//
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(100);
		t.add(50);
		t.add(33);
		t.add(20);
		t.add(24);
		System.out.println(t);
	}	
}
