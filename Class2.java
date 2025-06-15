package finally_concept;

public class Class2 {

//finally :- 1. finally is a block in java, which is used to exception handling, means to execute the important code  
//		        weather exception occurs or not.
//           2. In finally block we write codes which we have to execute after exception occurs(catch block).

//   syntax-	
	 
	  public static void syntax() {
		
		try { // try block is use to write a code to be executed
			
			System.out.println("try block");
		}
	   
	    catch(Exception e) { // catch block is use to catch or handle exception
	    	
	    	System.out.println("catch block"); // catch block will not be executed if there is no exception in   
//	                                              try block.
	    }
	    
		finally { // finally block is use to execute final code after exception occur
			
			System.out.println("finally block "); // finally block will always executed whether exception occur or
//		                                             not.
		}                        
	    }	

//      Example 1. -
	
	    public static void division() {
	    	
//	    division of 10/0 is not possible, JVM will shows ArithmeticException 	
	    	
	    	int a = 10;
	        
	    try {
	    	
	    	int k = a/0; 
	    
	        System.out.println(k); //  it will throw exception
	    }
	    catch (Exception e) {
	    
	    }
	    finally {
	    	
	    	System.out.println("Execute this code even after any exception for division");
	    }
	    }

// 	    Example 2. -
	    
	    public static void FindnullLength() {
	    	
//		    to find null length is not possible, JVM will shows NullPointerException 	
		       
		    try {
		    	
		    	String b = null; 
		    
		        System.out.println(b.length()); //  it will throw exception
		    }
		    catch (Exception e) {
		    	
		    	System.out.println("Execute this code even after any exception for FindnullLength");
		    }
		    finally {
		    	
		    	System.out.println("Execute this code even after any exception for FindnullLength");
		    }
		    }
	  
            public static void main(String[] args) {
		
	         Class2.syntax();
	 
	         Class2.division();
	
             Class2.FindnullLength();
            }
	        }
