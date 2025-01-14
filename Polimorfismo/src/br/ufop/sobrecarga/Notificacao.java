package br.ufop.sobrecarga;

public class Notificacao {

	// Método para enviar mensagem simples
	public void enviar(String mensagem) {
		System.out.println("Enviando mensagem: " + mensagem);
	}

	// Sobrecarga para enviar mensagem com destinatário (parâmetro diferente)
	public void enviar(String mensagem, String destinatario) {
		System.out.println("Enviando mensagem para " + destinatario + ": " + mensagem);
	}

	// Sobrecarga para enviar mensagem com prioridade (parâmetro diferente)
	public void enviar(String mensagem, String destinatario, int prioridade) {
		System.out
				.println("Enviando mensagem para " + destinatario + " com prioridade " + prioridade + ": " + mensagem);
	}
}
