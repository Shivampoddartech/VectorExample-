package Vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
 
public class VectorExample {
	 public static void main(String[] args) {
	        // Step 1: Create a Vector of Integers
	        Vector<Integer> vector = new Vector<>();

	        // Step 2: Add elements to Vector
	        vector.add(50);
	        vector.add(20);
	        vector.add(40);
	        vector.add(10);
	        vector.add(30);

	        // Step 3: Display original Vector using Iterator and while loop
	        System.out.println("Original Vector Elements:");
	        Iterator<Integer> iterator = vector.iterator();

	        while (iterator.hasNext()) {
	            Integer num = iterator.next();
	            System.out.print(num + " ");
	        }
	        System.out.println(); // for next line

	        // Step 4: Sort the Vector
	        Collections.sort(vector);

	        // Step 5: Display sorted Vector using Iterator and while loop
	        System.out.println("\nSorted Vector Elements:");
	        Iterator<Integer> sortedIterator = vector.iterator();

	        while (sortedIterator.hasNext()) {
	            Integer num = sortedIterator.next();
	            System.out.print(num + " ");
	        }
	        System.out.println(); // for next line
	    }
	}

