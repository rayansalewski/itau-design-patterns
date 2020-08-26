package builder.problematico;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import builder.Item;
import builder.NotaFiscal;

public class TesteBuilderProblematico {
	
    public static void main(String[] args) {
        List<Item> itens = Arrays.asList(new Item("Lapis", 5.00),new Item("Caneta", 50.00));
        double valorTotal = 0;
        for(Item item : itens) {
          valorTotal += item.getValor();
        }
        double impostos = valorTotal * 0.05;

        NotaFiscal nf = new NotaFiscal("razao social qualquer", "um cnpj", Calendar.getInstance(), valorTotal, impostos, itens, "observacoes quaisquer aqui");
      }

}
