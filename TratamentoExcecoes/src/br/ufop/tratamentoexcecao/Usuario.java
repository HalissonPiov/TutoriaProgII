package br.ufop.tratamentoexcecao;

//Exceção personalizada para idade inválida
class IdadeInvalidaException extends RuntimeException {
	
	public IdadeInvalidaException(String mensagem) {
		super(mensagem);
		
	}
}

class Usuario {
	
	private String nome;
	private int idade;

	public Usuario(String nome, int idade) {
		
		if (nome == null || nome.trim().isEmpty()) {
			throw new IllegalArgumentException("O nome não pode ser vazio.");
		}
		
		if (idade < 18) {
			throw new IdadeInvalidaException("Idade mínima para cadastro é 18 anos.");
		}
		
		// Atribuições que serão realizadas se não cair em nenhum condicional
		this.nome = nome;
		this.idade = idade;
	
	}

	public void exibirUsuario() {
		System.out.println("Usuário: " + nome + ", Idade: " + idade);
	}
}
