package strategy.problematico.encapsulado;

import strategy.OrcamentoCambio;

public class CalculadoraDeCambioSemIf {

	public double realizaCalculoDolarAmericano(OrcamentoCambio orcamentoCambio) {

		return new CambioDolarAmericano().calculoCambioDolarAmericano(orcamentoCambio);

	}
	
	public double realizaCalculoDolarCanadense(OrcamentoCambio orcamentoCambio) {

		return new CambioDolarCanadense().calculoCambioDolarCanadense(orcamentoCambio);

	}

	
	public double realizaCalculoEuro(OrcamentoCambio orcamentoCambio) {

		return new CambioEuro().calculoCambioEuro(orcamentoCambio);

	}

}
