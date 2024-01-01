package Collections;
import java.util.*;
public class EmpComparable {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Zudio");
		Employee e2 = new Employee(10,"Ajay");
		Employee e3 = new Employee(24,"Sunil");
		Employee e4 = new Employee(8,"Bablu");
		
		TreeSet t = new TreeSet();  //TreeSet t = new TreeSet(new MyComp())
		t.add(e1); 
		t.add(e2);
		t.add(e3);
		t.add(e4);
		
		System.out.println(t.toString());
	}

}
class MyComp implements Comparator{         //Ascending order Sorting on Alphabetical order   (name)

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		
		String s1 = e1.name;
		String s2 = e2.name;
		
		return s1.compareTo(s2);
	}
	
}
class Employee implements Comparable{
	int id;
	String name;
	public Employee() {
		this.id = id;
		this.name = name;
	}
	public Employee(int id,String n) {
		this.id = id;
		this.name = n;
	}
	public String toString() {
		return id+" "+name;
	}
	public int compareTo(Object obj) {              //Ascending order sorting on ID 
		Employee emp1 = (Employee) obj;
		int id2 = this.id;
		int id1 = emp1.id;
		
		if(id1>id2) {
			return -1;
		}
		else if(id1<id2)
			return +1;
		else
			return 0;
	}
}