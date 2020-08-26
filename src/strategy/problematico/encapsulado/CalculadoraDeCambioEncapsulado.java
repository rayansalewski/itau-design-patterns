package strategy.problematico.encapsulado;

import strategy.OrcamentoCambio;
import strategy.problematico.Moedas;

public class CalculadoraDeCambioEncapsulado {

	public double realizaCalculo(OrcamentoCambio orcamentoCambio, Moedas moeda) throws Exception {
		if (moeda == Moedas.DolarAmericano) {

			return new CambioDolarAmericano().calculoCambioDolarAmericano(orcamentoCambio);
			
		} else if (moeda == Moedas.DolarCanadense) {

			return new CambioDolarCanadense().calculoCambioDolarCanadense(orcamentoCambio);
					
		} else if (moeda == Moedas.Euro) {

			return new CambioEuro().calculoCambioEuro(orcamentoCambio);
			
		} else {
			
			throw new Exception("Moeda não encontrada");
		}
	}
}
