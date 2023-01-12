package InputAndOutput;

import java.io.File;

public class Ex001 {
	
	public static void main(String[] args) {
		
		File arquive =
				new File("/home/joel/Documentos/Courses/Alura/BackEnd/Java/Java8/src/Main");
		
		String[] list = arquive.list();
		
		for (String name: list) {
			System.out.println(name);
		}
		
		
	}

}
