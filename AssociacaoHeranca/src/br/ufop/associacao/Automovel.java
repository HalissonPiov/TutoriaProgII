package br.ufop.associacao;

public class Automovel {

	private String tipo;
	private String marca;
	private int ano;

	public Automovel(String tipo, String marca, int ano) {
		this.tipo = tipo;
		this.marca = marca;
		this.ano = ano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Automovel [tipo=" + tipo + ", marca=" + marca + ", ano=" + ano + "]";
	}
	// é necessário para uma impressão correta do objeto

}
