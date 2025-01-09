package br.ufop.associacao;

public class MainAssociacao {

	public static void main(String[] args) {

		System.out.println("---------- Agregação ----------");
		Automovel automovel = new Automovel("Carro", "Fiat", 2017); // Instância (objeto) sendo criada na main e passada
																	// para a classe que vai agregar logo abaixo, sendo
																	// independente pela destruição da classe
																	// PessoaAgregacao não destruir a instância de
																	// automóvel (que está na main)
		PessoaAgregacao pessoaAgreg = new PessoaAgregacao("Pedro", 23, automovel);
		System.out.println(pessoaAgreg + "\n");

		System.out.println("---------- Composição ----------");
		PessoaComposicao pessoaComp = new PessoaComposicao("Pedro", 23, "Moto", "Honda", 2015); // passado no parâmetro
																								// o valor dos atributos
																								// que a instância
																								// Automovel vai receber
		System.out.println(pessoaComp);

	}

}
