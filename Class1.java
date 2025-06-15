package finally_concept;

public class Class1 {

	public static void m1() {
		
		int a = 10;
		
		int k = a/0;
		
		System.out.println(k);
	    
		System.out.println("Execute this code even after any exception"); 
	}
	
	public static void m2() {
	    
	    String b = null;
	    
	    System.out.println(b.length());
	    
	    System.out.println("Execute this code even after any exception");
	}

    public static void main(String[] args) {
		
		m1();

// JVM throws Exception "Exception in thread "main" java.lang.ArithmeticException: / by zero"    
// due to this it does not print "Execute this code even after any exception" 
		
		m2();
		
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "b" is null	
    }
    }
