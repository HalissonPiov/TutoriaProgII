package br.ufop.tratamentoexcecao;

public class CadastroUsuario {

	public static void main(String[] args) {

		try {
			Usuario u1 = new Usuario("Carlos", 20);
			u1.exibirUsuario();
			
			Usuario u2 = new Usuario("", 25); // Vai lançar a exceção "IllegalArgumentException" criada
			u2.exibirUsuario();
			
		} catch (IllegalArgumentException e) {
			System.out.println("Erro no cadastro: " + e.getMessage());

		} catch (IdadeInvalidaException e) {
			System.out.println("Erro de idade: " + e.getMessage());
		}
	}
}
