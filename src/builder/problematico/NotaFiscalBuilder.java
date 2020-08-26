package builder.problematico;

import java.util.ArrayList;
import java.util.Calendar;

import builder.Item;
import builder.NotaFiscal;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private double impostos;
	private double valorBruto;
	private ArrayList<Item> todosOsItens = new ArrayList<Item>();
	private String observacoes;
	private Calendar data;
	
	

	public NotaFiscalBuilder() {
		this.data = Calendar.getInstance();
	}

	public void comRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void comCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void com(Item item) {
		todosOsItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
	}

	public void comDataAtual(Calendar data) {
		this.data = data;
	}

	public void comObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public NotaFiscal build() {
		return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosOsItens, observacoes);
	}
}
