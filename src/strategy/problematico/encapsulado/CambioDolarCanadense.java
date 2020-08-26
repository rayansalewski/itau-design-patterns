package strategy.problematico.encapsulado;

import strategy.OrcamentoCambio;

public class CambioDolarCanadense {

	public double calculoCambioDolarCanadense(OrcamentoCambio orcamentoCambio) {
		if (orcamentoCambio.getValor() > 1500.00) {
			return (orcamentoCambio.getValor() * 4.15) * 1.013; // (Valor * DolarCanadense Hoje) * taxa de cambio
		}
		return (orcamentoCambio.getValor() * 4.18) * 1.013; // (Valor * DolarCanadense Hoje) * taxa de cambio
	}
}
