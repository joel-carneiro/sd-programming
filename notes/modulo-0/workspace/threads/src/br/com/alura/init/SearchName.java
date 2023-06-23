package br.com.alura.init;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchName implements Runnable {

	private String name;
	private String pathName;

	public SearchName(String name, String pathName) {
		this.name = name;
		this.pathName = pathName;
	}

	public void searchNameNow() throws FileNotFoundException, InterruptedException {
		Scanner scanner = new Scanner(new File(this.pathName));

		while (scanner.hasNext()) {
			String line = scanner.nextLine();

			if (line.contains(this.name)) {
				System.out.printf("[%s : %s]\n", line, this.pathName);
			}
		}

		scanner.close();
	}

	@Override
	public void run() {
		try {
			try {
				this.searchNameNow();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
