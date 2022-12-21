package Enconding;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TestEncoding {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String name = "Aríel";
		byte[] bytes = name.getBytes(StandardCharsets.US_ASCII);
		
		String testName = new String(bytes);
		
		System.out.println(testName);
		
		
	}
}
