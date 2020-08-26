package strategy.solucionado;

import strategy.OrcamentoCambio;

public class CambioDolarAmericano implements Cambio{

	@Override
	public double calculaCambio(OrcamentoCambio orcamentoCambio) {
		if (orcamentoCambio.getValor() > 1000.00) {
			return (orcamentoCambio.getValor() * 5.49)  * 1.013; //(Valor * DolarAmericano Hoje) * taxa de cambio
		}
		return (orcamentoCambio.getValor() * 5.51)  * 1.013; //(Valor * DolarAmericano Hoje) * taxa de cambio
	}

	@Override
	public String sigla() {
		return "US";
	}

}
