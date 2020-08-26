package strategy.solucionado;

import strategy.OrcamentoCambio;

public class CalculadoraCambio {

	public double calculoCambioTotal(OrcamentoCambio orcamentoCambio, Cambio cambio) {
		return cambio.calculaCambio(orcamentoCambio);
	}
}
