package arrays;

import java.util.ArrayList;

import java.util.Iterator;

public class Test2 {
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Java");
		names.add("C#");
		names.add("Python");
		names.add("Ruby");
		
		Iterator<String> iterador = names.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
	}
}
