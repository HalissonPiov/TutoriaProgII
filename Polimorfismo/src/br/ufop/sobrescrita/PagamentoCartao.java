package br.ufop.sobrescrita;

public class PagamentoCartao extends Pagamento {

	@Override
	public void processarPagamento(double valor) {  // Sobrescrita do método processarPagamento na subclasse
		System.out.println("Processando pagamento por cartão de crédito no valor de R$ " + valor);
	}

}
