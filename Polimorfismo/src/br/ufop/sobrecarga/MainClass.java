package br.ufop.sobrecarga;

public class MainClass {

	public static void main(String[] args) {

		Notificacao notificacao = new Notificacao();

		// Chamadas para métodos sobrecarregados da classe Notificacao
		notificacao.enviar("Bem-vindo ao sistema!");
		notificacao.enviar("Você tem um novo aviso", "João");
		notificacao.enviar("Reunião urgente às 15h", "Maria", 1);

	}

}
