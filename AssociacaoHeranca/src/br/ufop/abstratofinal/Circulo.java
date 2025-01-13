package br.ufop.abstratofinal;

class Circulo extends Forma {
	private double raio;

	public Circulo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	@Override
	public double calcularArea() { // Método que era abstrato na superclasse e agora foi implemetando na sub-classe
		return Math.PI * raio * raio;
	}
	
//	public void exibirCor() {}  --> ERRO: tentativa de sobrescrever um método final da superclasse 

}
