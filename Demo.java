package Collections;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Demo {
	public static void main(String[] args){
		try {
		FileInputStream fin = new FileInputStream("C://plsql//myData.txt");
		System.out.println(fin.toString());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
