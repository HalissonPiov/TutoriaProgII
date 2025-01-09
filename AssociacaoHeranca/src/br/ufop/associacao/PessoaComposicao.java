package br.ufop.associacao;

public class PessoaComposicao {

	private String nome;
	private int idade;
	private Automovel automovel; // O atributo é do tipo classe Automovel

	public PessoaComposicao(String nome, int idade, String tipo, String marca, int ano) {
		this.nome = nome;
		this.idade = idade;
		this.automovel = new Automovel(tipo, marca, ano); // Dependente: se a classe PessoaComposicao for destruída,
															// essa instância (objeto) Automovel também vai ser, por
															// estar no construtor dela
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", automovel=" + automovel + "]";
	}
	// é necessário para uma impressão correta do objeto

}
