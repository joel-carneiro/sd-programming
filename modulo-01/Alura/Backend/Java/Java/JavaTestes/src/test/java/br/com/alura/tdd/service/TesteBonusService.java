package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class TesteBonusService {

	@Test
	public void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		BigDecimal bonus =
				service.calcularBonus(new Funcionario("Raul", LocalDate.now(), new BigDecimal("25000.00")));
		
		assertEquals(new BigDecimal("0.00"), bonus);
	}
	
	@Test
	public void bonusDeveriaSer10PorcentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus =
				service.calcularBonus(new Funcionario("Raul", LocalDate.now(), new BigDecimal("2500")));
		
		assertEquals(new BigDecimal("250.00"), bonus);
	}
	
	@Test
	public void bonusDeveriaSerIgualA0QuandoBonusIgualA10Mil() {
		BonusService service = new BonusService();
		BigDecimal bonus =
				service.calcularBonus(new Funcionario("Raul", LocalDate.now(), new BigDecimal("10000.00")));
		
		assertEquals(new BigDecimal("1000.00"), bonus);
	}
	
	

}
