package tread;

class Tread implements Runnable {
String name;
Tread t;
    Tread (String tread){
  //  name = treadname; 
  //  t = new Tread(this, name);
System.out.println("New tread: " + t);
t.start();
}
 
 
private void start() {
		// TODO Auto-generated method stub
		
	}


public void run() {
 try {
     for(int i = 5; i > 0; i--) {
     System.out.println(name + ": " + i);
      Thread.sleep(1000);
}
}catch (InterruptedException e) {
     System.out.println(name + "Interrupted");
}
     System.out.println(name + " exiting.");
}
}
 
class MultiThread {
public static void main(String args[]) {
     new Tread("One");
     new Tread("Two");
     new Tread("Three");
try {
     Thread.sleep(10000);
} catch (InterruptedException e) {
      System.out.println("Main thread Interrupted");
}
      System.out.println("Main thread exiting.");
      }
}
