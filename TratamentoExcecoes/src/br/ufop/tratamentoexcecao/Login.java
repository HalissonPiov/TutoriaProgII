package br.ufop.tratamentoexcecao;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		SistemaLogin sistema = new SistemaLogin();
		int aprovacao = 0;

		while (true) {

			try {

				System.out.println("--- Realizar Login ---\n");

				System.out.print("Usuário: ");
				String usuario = scanner.next();

				System.out.print("Senha: ");
				String senha = scanner.next();

				aprovacao = sistema.autenticar(usuario, senha);

				if (aprovacao == 1) {
					break;
				}

			} catch (IllegalArgumentException e) {
				System.out.println("Erro: " + e.getMessage()); // Captura essa exceção se errar o usuario ou senha

			} catch (ContaBloqueadaException e) { // Captura essa exceção, criada na classe SistemaLogin, se chegar a 3
													// tentativas
				System.out.println("Erro crítico: " + e.getMessage());
				break;

			} finally {
				System.out.println("Processo de login finalizado.\n");
			}
		}

		scanner.close();

		if (aprovacao == 1)
			System.out.println("\nBem-vindo ao sistema!");

	}
}