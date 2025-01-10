package br.ufop.heranca;

public class Moto extends Veiculo {

	private boolean possuiCarenagem;

	public Moto(String marca, String modelo, int ano, boolean possuiCarenagem) {
		super(marca, modelo, ano); // O "super()" recebe o parâmetro do construtor da superclasse e permite acessar
									// esses atributos nesta subclasse
		this.possuiCarenagem = possuiCarenagem;
	}

	public boolean ispossuiCarenagem() {
		return possuiCarenagem;
	}

	public void setpossuiCarenagem(boolean possuiCarenagem) {
		this.possuiCarenagem = possuiCarenagem;
	}

	protected void deslocar() {
		System.out.println("A moto está sendo pilotada..."); // Sobrescrita de método
	}

	@Override                 // Esse método sobrescreveu o de mesmo nome da superclasse
	public String toString() {
		return "Moto [possuiCarenagem=" + possuiCarenagem + ", marca=" + super.getMarca() + ", modelo="
				+ super.getModelo() + ", ano=" + super.getAno() + "]"; // os métodos da classe mãe são acessados para
																		// uso dentro dessa subclasse por meio do
																		// "super"
	}

}
