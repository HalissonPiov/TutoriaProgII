package br.ufop.sobrescrita;

public class MainClass {

	public static void main(String[] args) {

		Pagamento pagamento1 = new PagamentoCartao();
        Pagamento pagamento2 = new PagamentoPIX();

        pagamento1.processarPagamento(250.00); 
        pagamento2.processarPagamento(500.00); 
		
	}

}
