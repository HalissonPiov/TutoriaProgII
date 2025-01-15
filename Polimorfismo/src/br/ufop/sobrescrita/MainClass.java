package br.ufop.sobrescrita;

public class MainClass {

	public static void main(String[] args) {

		Pagamento pagamento1 = new PagamentoCartao();
		Pagamento pagamento2 = new PagamentoPIX();

		pagamento1.processarPagamento(250.00);
		pagamento2.processarPagamento(500.00);

//        pagamento1.exibirHistoricoPIX();  ERRO - conceito de Upcasting: não é acessível pela instância da subclasse ser do tipo da superclasse, 
// 		  assim seus métodos não são acessíveis nesse objeeto criado

	}

}
