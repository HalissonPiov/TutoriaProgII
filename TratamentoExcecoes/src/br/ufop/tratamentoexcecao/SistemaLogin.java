package br.ufop.tratamentoexcecao;
import java.util.Scanner;


//Exceção personalizada para login incorreto
class ContaBloqueadaException extends Exception {
	
	public ContaBloqueadaException(String mensagem) {
		super(mensagem);
	}
	
}

class SistemaLogin {
	
	private final String usuarioCorreto = "aluno";
	private final String senhaCorreta = "ufop2025";
	private int tentativas = 0;

	public int autenticar(String usuario, String senha) throws ContaBloqueadaException {
		
		if (tentativas >= 3) {
			throw new ContaBloqueadaException("Conta bloqueada após 3 tentativas falhas.");
		}

		if (!usuario.equals(usuarioCorreto) || !senha.equals(senhaCorreta)) {
			tentativas++;
			throw new IllegalArgumentException("Usuário ou senha incorretos. Tentativa " + tentativas + " de 3.");
		}

		System.out.println("Login realizado com sucesso!");
		return 1;
	}
}