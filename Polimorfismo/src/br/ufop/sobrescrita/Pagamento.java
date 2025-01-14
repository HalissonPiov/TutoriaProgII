package br.ufop.sobrescrita;

public class Pagamento {
	
	public void processarPagamento(double valor) {  // Método que será sobrescrito
		System.out.println("Processando pagamento genérico de R$ " + valor);
	}
	
}
