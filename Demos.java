package Vector;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Demos {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.add(10);
		vector.add(20);
		vector.add(130);
		vector.add(100);
		vector.add(5);
		System.out.println(vector);
//
//		for (Integer i : vector)
//			System.out.println(vector);
//
//		for (Integer integer : vector)
//			System.out.println(vector);

		Iterator<Integer> iterator = vector.iterator();
		while (iterator.hasNext()) {
			Integer num = iterator.next();
			System.out.println(" " + num);
		}
		Collections.sort(vector);
		Iterator<Integer> sorting = vector.iterator();
		while (sorting.hasNext()) {
			Integer num = sorting.next();
			System.out.println(" " + num);
		}
	}
}
