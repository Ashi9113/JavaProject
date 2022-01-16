package modifire;
class Modifire{  
private int data=40;  // private class can not be called 
private void msg(){System.out.println("Hello java");}  
}  
  //public  class be call
public class Simple{  
 public static void main(String args[]){  
   A obj=new A();  
   System.out.println(obj.data);//Compile Time Error  
   obj.msg();//Compile Time Error  
   }  
}  