package strategy.solucionado;

import strategy.OrcamentoCambio;

public class CambioEuro implements Cambio{

	@Override
	public double calculaCambio(OrcamentoCambio orcamentoCambio) {
		if (orcamentoCambio.getValor() > 2000.00) {
			return (orcamentoCambio.getValor() * 6.47)  * 1.013; //(Valor * Euro Hoje) * taxa de cambio
		}
		return (orcamentoCambio.getValor() * 6.51)  * 1.013; //(Valor * Euro Hoje) * taxa de cambio
	}

	@Override
	public String sigla() {
		return "EUR";
	}

}
