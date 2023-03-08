package Testes;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TesteCalculadora {
	
	@Test
	public void deveriaSomarDoisNúmerosPositivos() {
		int soma = Calculadora.soma(7, 3);
		
		Assert.assertEquals(10, soma);
	}
	
}
