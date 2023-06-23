package arraysbasic;

import java.util.HashSet;

public class TrySet {
	public static void main(String[] args) {
		HashSet<String> classroom = new HashSet<String>();
		
		classroom.add("William Dabruzzo");
		classroom.add("Luan Carosi");
		classroom.add("Henrique Gutemberg");
		
		System.out.println(classroom);
	}
}