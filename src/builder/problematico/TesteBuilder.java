package builder.problematico;

import builder.Item;
import builder.NotaFiscal;

public class TesteBuilder {

	public static void main(String[] args) {
		NotaFiscalBuilder builder =  new NotaFiscalBuilder();
		builder.comRazaoSocial("Rayan Ltda");
		builder.comCnpj("123.456.789/0001-10");
		builder.com(new Item("item 1", 100.0));
		builder.com(new Item("item 2", 200.0));
		builder.com(new Item("item 3", 300.0));
		builder.comObservacoes("entregar nf pessoalmente");
		
		NotaFiscal notaFiscal = builder.build();
	}
}
