package br.ufop.sobrescrita;

public class PagamentoPIX extends Pagamento {

	@Override
	public void processarPagamento(double valor) {  // Sobrescrita do método processarPagamento na subclasse
		System.out.println("Processando pagamento via PIX no valor de R$ " + valor);
	}
	
	public void exibirHistoricoPIX() {
		System.out.println("Exibindo histórico PIX...");
	}

}
