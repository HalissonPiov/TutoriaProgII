package br.ufop.associacao;

public class PessoaAgregacao {

	private String nome;
	private int idade;
	private Automovel automovel; // O atributo é do tipo classe Automovel

	public PessoaAgregacao(String nome, int idade, Automovel automovel) {
		this.nome = nome;
		this.idade = idade;
		this.automovel = automovel;
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
