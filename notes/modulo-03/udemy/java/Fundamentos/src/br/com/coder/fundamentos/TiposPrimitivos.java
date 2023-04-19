package br.com.coder.fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {

		// O menor dos números inteiros
		byte isByte = 125;
		System.out.println(isByte);
		
		// Um pouco maior que o byte
		short isShort = 32764;
		System.out.println(isShort);
		
		// Bem maior que o short
		int isInt = 71654;
		System.out.println(isInt);
		
		// Um número gigantesco
		long isLong = 123456L;
		System.out.println(isLong);
		
		// Número quebrado sem muita precisão
		float isFloat = 3.14F;
		System.out.println(isFloat);
		
		// Um número quebrado com um pouco mais de precisão
		double isDouble = 2.71;
		System.out.println(isDouble);
		
		// Representa um caracter
		char isChar = '#';
		System.out.println(isChar);
		
		// Representa um valor lógico
		boolean isBoolean = true;
		System.out.println(isBoolean);
	}

}
