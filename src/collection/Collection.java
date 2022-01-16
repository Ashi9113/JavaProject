package collection;

import java.util.*;  
class Collection1{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("AShish");//Adding object in arraylist  
list.add("Kumar");  
list.add("Rahul");  
list.add("jay");  
//Traversing list through Iterator  
Iterator<String> itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  