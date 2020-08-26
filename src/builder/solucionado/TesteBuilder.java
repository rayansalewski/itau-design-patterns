package builder.solucionado;

import builder.Item;
import builder.NotaFiscal;

public class TesteBuilder {

	public static void main(String[] args) {
		NotaFiscal nf = new NotaFiscalBuilder().comRazaoSocial("Rayan Ltda").comCnpj("123.456.789/0001-10")
				.com(new Item("item 1", 100.0)).com(new Item("item 2", 200.0))
				.com(new Item("item 3", 300.0)).comObservacoes("entregar nf pessoalmente").build();
	}
}
