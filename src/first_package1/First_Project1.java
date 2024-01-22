package first_package1;

public class First_Project1 {

	public static void main (String[] args) {
		
		
		
		int a = 100 ;                     // a = 104
		int b = a++ ;                     // b = 102 // but in this statement line value of b = 100  
		int c = ++a + a++ + b++ ;         // 
		int d = c++ + a++ + ++b ;
		
		    System.out.println(a);
		    System.out.println(b);
		    System.out.println(c);
		    System.out.println(d);
	}
}