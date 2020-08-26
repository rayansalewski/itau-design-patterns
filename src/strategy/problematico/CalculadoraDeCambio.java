package strategy.problematico;

import strategy.OrcamentoCambio;

public class CalculadoraDeCambio {

	public double realizaCalculo(OrcamentoCambio orcamentoCambio, Moedas moeda) throws Exception {
		if (moeda == Moedas.DolarAmericano) {
			if (orcamentoCambio.getValor() > 1000.00) {
				return (orcamentoCambio.getValor() * 5.49)  * 1.013; //(Valor * DolarAmericano Hoje) * taxa de cambio
			}
			return (orcamentoCambio.getValor() * 5.51) * 1.013; //(Valor * DolarAmericano Hoje) * taxa de cambio
			
		} else if (moeda == Moedas.DolarCanadense) {
			if (orcamentoCambio.getValor() > 1500.00) {
				return (orcamentoCambio.getValor() * 4.15)  * 1.013; //(Valor * DolarCanadense Hoje) * taxa de cambio
			}
			return (orcamentoCambio.getValor() * 4.18)  * 1.013; //(Valor * DolarCanadense Hoje) * taxa de cambio
					
		} else if (moeda == Moedas.Euro) {
			if (orcamentoCambio.getValor() > 2000.00) {
				return (orcamentoCambio.getValor() * 6.47)  * 1.013; //(Valor * Euro Hoje) * taxa de cambio
			}
			return (orcamentoCambio.getValor() * 6.51)  * 1.013; //(Valor * Euro Hoje) * taxa de cambio
			
		} else {
			
			throw new Exception("Moeda não encontrada");
		}
	}
}
