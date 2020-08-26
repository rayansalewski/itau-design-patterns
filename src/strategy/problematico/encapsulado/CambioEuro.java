package strategy.problematico.encapsulado;

import strategy.OrcamentoCambio;

public class CambioEuro {

	public double calculoCambioEuro(OrcamentoCambio orcamentoCambio) {
		if (orcamentoCambio.getValor() > 2000.00) {
			return (orcamentoCambio.getValor() * 6.47)  * 1.013; //(Valor * Euro Hoje) * taxa de cambio
		}
		return (orcamentoCambio.getValor() * 6.51)  * 1.013; //(Valor * Euro Hoje) * taxa de cambio
	}
}
