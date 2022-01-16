import java.io.File;

class Files {
  public static void main(String[] args) {

    // creates a file object
    File file = new File("C:\\Users\\");

    // returns an array of all files
    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
  }
}