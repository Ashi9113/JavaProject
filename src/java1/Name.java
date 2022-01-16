package java1;

public class Name {
	  public static void main(String[ ] args) {
	    int a=25;
	    int b=5;
	    int c=0;
	    try{
	      System.out.println(a/c); // throws an exception due to division by zero  
	      System.out.println(a/b); // will not be executed since exception is thrown
	    }
	    // this block will be executed if an exception is thrown
	    catch(Exception e){ 
	      System.out.println("Division by zero"); 
	    }
	    System.out.println(a+b); // this will execute irrespective of exception thrown or not
	  }
	}