package br.ufop.heranca;

public class Veiculo {

	private String marca;
	private String modelo;
	private int ano;

	public Veiculo(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getMarca() { // Exemplo de método que se manteve inalterado para as subclasses - não foi
								// sobescrito e está acessível para elas
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	protected void deslocar() {
		System.out.println("O veículo está se deslocando..."); // Método que foi sobrescrito nas subclasses
	}

	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + "]"; // Método que foi sobrescrito
																						// nas subclasses
	}

}
