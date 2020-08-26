package strategy.solucionado;

import strategy.OrcamentoCambio;

public class TesteStrategy {

	public static void main(String[] args) {
		OrcamentoCambio orcamentoCambio = new OrcamentoCambio(2000.00);

		CalculadoraCambio calculadoraCambio = new CalculadoraCambio();

		CambioDolarAmericano us = new CambioDolarAmericano();
		CambioDolarCanadense cad = new CambioDolarCanadense();
		CambioEuro eur = new CambioEuro();

		System.out.printf("O valor total do câmbio é de %.2f %s \n",
				calculadoraCambio.calculoCambioTotal(orcamentoCambio, us), us.sigla());
		
		System.out.printf("O valor total do câmbio é de %.2f %s \n",
				calculadoraCambio.calculoCambioTotal(orcamentoCambio, cad), cad.sigla());
		
		System.out.printf("O valor total do câmbio é de %.2f %s \n",
				calculadoraCambio.calculoCambioTotal(orcamentoCambio, eur), eur.sigla());
		
	}
}
