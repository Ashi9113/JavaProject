package assesment;
import java.io.File;
import java.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {
 public static void main(String[] args) throws java.io.IOException {
	 String path="E:\\some file location";
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter tghe file name to create");
	 String filename=path+sc.next();
	 File f=new File(filename);
	 boolean result=f.createNewFile();
	 if(result==false) {
		 System.out.println("file is not created");
	 }
	 else {
		 System.out.println("file is created");
	 }
 }
}
