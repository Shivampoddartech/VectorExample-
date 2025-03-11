package Vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Demo {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();

		v.add(10);
		v.add(5);
		v.add(2);
		v.add(450);

		System.out.println(v);
		System.out.println("-----------");
		System.out.println("Vector");

		for (Integer i : v) {
			System.out.println(i);

		}
		System.out.println("-----------");

		Iterator<Integer> iterator = v.iterator();

		while (iterator.hasNext()) {
			Integer num = iterator.next();
			System.out.println(num + " ");
		}
		System.out.println("-----------");
		
		Collections.sort(v);
		Iterator<Integer> sorted = v.iterator();
		while (sorted.hasNext()) {
			
		Integer num = sorted.next();
		System.out.println(num);
	}}
}
