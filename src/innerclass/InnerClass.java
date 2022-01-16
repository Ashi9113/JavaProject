package innerclass;

class InnerOClass {
	   int num;
	   
	   // inner class
	   private class Inner_Demo {
	      public void print() {
	         System.out.println("This is an inner class");
	      }
	   }
	   
	   // Accessing he inner class from the method within
	   void display_Inner() {
	      Inner_Demo inner = new Inner_Demo();
	      inner.print();
	   }
	}
	   
	public class InnerClass {

	   public static void main(String args[]) {
	      // Instantiating the outer class 
	      InnerOClass outer = new InnerOClass();
	      
	      // Accessing the display_Inner() method.
	      outer.display_Inner();
	   }
	}