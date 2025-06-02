/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class Exception3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("STAT1");// created exception object
		try {
			System.out.println("STAT2");  // created exception object
		}catch (Exception e) { // exception 
			e.printStackTrace(); // name, description and at exception raised
			e.toString(); // name and description
			e.getMessage();// description
			System.out.println("STAT4");
		}
		System.out.println("STAT3");
		System.out.println("STAT5");
	}
	// case studies
	 // case 1 no exceptions  o/p : stat1, stat2, stat3, stat5
	// case 2 if exception raised @ stat 2 
   //  and corresponding catch block matched   stat1, stat4, stat5
   //  case 3 : if exception raised at line 5
   //	           1,2,3 
  // case 4:  
//	     sub case 1: if exception raised at stat1     o/p default exception handling (printStackTrace)
//	     sub case 2: if exception raised at stat2     o/p  stat1 and stat4 
//	     sub case 3: if exception created at stat3    o/p  stat1 and  STAT2, default exception handling (printStackTrace)
	

}
