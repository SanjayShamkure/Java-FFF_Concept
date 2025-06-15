package finally_concept;

public class Class3 {

	 public static void division() {
	    	
//		    division of 10/2 is possible 	
		    	
		    	int a = 10;
		        
		    try {
		    	
		    	int k = a/2; // there is no exception 
		    
		        System.out.println(k); // there is no exception
		    }
		    catch (Exception e) { // catch block will not print because there is no exception in try block
		    
		    	System.out.println("Execute this code even after any exception for division (catch block");
		    }
		    finally {
		    	
		    	System.out.println("Execute this code even after any exception for division(finally block)");
		    }
		    }
	
	      public static void main(String[] args) {
		
		          division();
	}
	}
