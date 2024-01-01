package Collections;

public class Palendrom {

	public static void main(String[] args) {
		int org = 12321;
		int num = org;
		int rev =0;
		
		while(num!=0) {
		rev = (rev*10)+(num%10);
		num = num/10;
	    }
		
		if(rev==org) {
		  System.out.print("IS PALENDROM");
		}else {
			System.out.print("IS NOT PALENDROM");	
		}
    }
}	

