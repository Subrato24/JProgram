package Collections;
import java.util.*;
import java.io.*;

public class MyProperties {

	public static void main(String[] args){
		Properties p = new Properties();
		try {
		FileInputStream fis = new FileInputStream("C:\\plsql\\abc.properties");
		p.load(fis);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(p);
		String s = p.getProperty("user");
		System.out.println(s); 
		p.setProperty("phone", "7869494484");
		try {
		FileOutputStream fos = new FileOutputStream("C:\\plsql\\abc.properties");
		p.store(fos,"Welcome Subrato");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
