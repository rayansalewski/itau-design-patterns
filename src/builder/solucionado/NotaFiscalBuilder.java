package builder.solucionado;

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

	public NotaFiscalBuilder comRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder com(Item item) {
		todosOsItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder comDataAtual(Calendar data) {
		this.data = data;

		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscal build() {
		return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosOsItens, observacoes);
	}
}
