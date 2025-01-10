package br.ufop.heranca;

public class Carro extends Veiculo {

	private int numeroDePortas;

	public Carro(String marca, String modelo, int ano, int numeroDePortas) {
		super(marca, modelo, ano); // O "super()" recebe o parâmetro do construtor da superclasse e permite acessar
									// esses atributos nesta subclasse
		this.numeroDePortas = numeroDePortas;
	}

	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	protected void deslocar() {
		System.out.println("O carro está sendo dirigido..."); // Sobrescrita de método
	}

	@Override                // Esse método sobrescreveu o de mesmo nome da superclasse
	public String toString() {
		return "Carro [numeroDePortas=" + numeroDePortas + ", marca=" + super.getMarca() + ", modelo=" + super.getModelo()
				+ ", ano=" + super.getAno() + "]"; // os métodos da classe mãe são acessados para uso dentro dessa
													// subclasse por meio do "super"
	}

}
