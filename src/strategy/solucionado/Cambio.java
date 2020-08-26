package strategy.solucionado;

import strategy.OrcamentoCambio;

public interface Cambio {

	double calculaCambio(OrcamentoCambio orcamentoCambio);
	String sigla();
}
