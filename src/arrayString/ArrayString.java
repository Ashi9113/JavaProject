package arrayString;

import java.util.*;

public class ArrayString {

    public static void main(String[] args) {

       try (Scanner input = new Scanner(System.in)) {
		System.out.println("Enter number of elements to be sorted: ");

		   int num_of_elements = input.nextInt();

		   int[] num = new int[num_of_elements];

		   for (int i = 0; i < num_of_elements; i++)
		   {
		       System.out.print("Element" + (i + 1) + ": ");

		       num[i] = input.nextInt();
		    }
	}
       System.out.println();
    }
}