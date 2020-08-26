package strategy.problematico;

import strategy.OrcamentoCambio;
import strategy.problematico.encapsulado.CalculadoraDeCambioEncapsulado;
import strategy.problematico.encapsulado.CalculadoraDeCambioSemIf;

public class TesteSemStrategy {

	public static void main(String[] args) {
		OrcamentoCambio orcamentoCambio = new OrcamentoCambio(2000.00);
		
		CalculadoraDeCambio calculadoraDeCambio = new CalculadoraDeCambio();
		
		try {
			System.out.println("O valor total do câmbio é de " + calculadoraDeCambio.realizaCalculo(orcamentoCambio, Moedas.DolarAmericano));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Encapsulado
		
		CalculadoraDeCambioEncapsulado calculadoraDeCambioEncapsulado = new CalculadoraDeCambioEncapsulado();
		
		try {
			System.out.println("O valor total do câmbio é de " + calculadoraDeCambioEncapsulado.realizaCalculo(orcamentoCambio, Moedas.DolarAmericano));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Sem IF
		
		CalculadoraDeCambioSemIf calculadoraDeCambioSemIf = new CalculadoraDeCambioSemIf();
		System.out.println("O valor total do câmbio é de " + calculadoraDeCambioSemIf.realizaCalculoDolarAmericano(orcamentoCambio));
		
	}
}
