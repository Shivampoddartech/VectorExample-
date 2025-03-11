package Vector;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Demon {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector();
		vector.add(20);
		vector.add(30);
		vector.add(100);
		vector.add(200);
		vector.add(50);
		System.out.println(vector);
		for (Integer i : vector) {
			System.out.println(i);
		}
		// Iterator
		System.out.println("---------");
		Iterator<Integer> iterator = vector.iterator();
		while (iterator.hasNext()) {
			Integer num = iterator.next();
			System.out.println(" " + num);
		}
		Collections.sort(vector);

		Iterator<Integer> Sorting = vector.iterator();
		while (Sorting.hasNext()) {
			Integer num = Sorting.next();
			System.out.println(num);
		}
	}
}
