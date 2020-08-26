package strategy.problematico.encapsulado;

import strategy.OrcamentoCambio;

public class CambioDolarAmericano {

	public double calculoCambioDolarAmericano(OrcamentoCambio orcamentoCambio) {
		if (orcamentoCambio.getValor() > 1000.00) {
			return (orcamentoCambio.getValor() * 5.49)  * 1.013; //(Valor * DolarAmericano Hoje) * taxa de cambio
		}
		return (orcamentoCambio.getValor() * 5.51)  * 1.013; //(Valor * DolarAmericano Hoje) * taxa de cambio
	}
}
