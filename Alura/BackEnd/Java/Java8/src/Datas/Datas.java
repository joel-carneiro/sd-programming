package Datas;
import java.time.*;

public class Datas {
	
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDate copa = LocalDate.of(2026, Month.JULY, 1);
		
		Period periodo = Period.between(hoje, copa);
		
		System.out.println("Faltam para o hexa: ");
		System.out.println("> " + periodo.getDays() + " Dias");
		System.out.println("> " + periodo.getMonths() + " Meses");
		System.out.println("> " + periodo.getYears() + " Anos");
		
		
	}
	
}
