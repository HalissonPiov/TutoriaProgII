package br.ufop.abstratofinal;

public class MainClass {
	public static void main(String[] args) {

		// Criando instâncias de formas
//		Forma forma1 = new Forma("Vermelho");  --> ERRO: a classe abstrata não pode ser instanciada, ela será apenas uma progenitora
		Forma circulo = new Circulo("Vermelho", 5.0);
		Forma retangulo = new Retangulo("Azul", 4.0, 6.0);

		// Chamando métodos
		circulo.exibirCor();
		retangulo.exibirCor();

		// Exibindo áreas usando a classe final
		Utilidades.exibirArea(circulo);
		Utilidades.exibirArea(retangulo);
//		--> Extra: método exibirArea() de classe Utilidades é utilizado sem instanciar essa classe na main por ser um método estático

	}
}
