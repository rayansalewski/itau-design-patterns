package strategy.solucionado;

import strategy.OrcamentoCambio;

public class CambioDolarCanadense implements Cambio {

	@Override
	public double calculaCambio(OrcamentoCambio orcamentoCambio) {
		if (orcamentoCambio.getValor() > 1500.00) {
			return (orcamentoCambio.getValor() * 4.15) * 1.013; // (Valor * DolarCanadense Hoje) * taxa de cambio
		}
		return (orcamentoCambio.getValor() * 4.18) * 1.013; // (Valor * DolarCanadense Hoje) * taxa de cambio
	}

	@Override
	public String sigla() {
		return "CAD";
	}

}
