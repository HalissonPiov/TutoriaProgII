package br.ufop.heranca;

public class MainHeranca {

	public static void main(String[] args) {

		System.out.println("----- Subclasse Carro de Veículo -----");
		Carro carro1 = new Carro("Volkswagen", "Gol", 2020, 4);
		System.out.println(carro1.toString());
		carro1.deslocar(); // Exemplo prévio de polimorfismo (uma função de mesmo nome tendo
							// comportamento diferente em outro objeto)

		
		System.out.println("\n----- Subclasse Moto de Veículo -----");
		Moto moto1 = new Moto("Yamaha", "YZF-R3", 2021, true);
		System.out.println(moto1.toString());
		moto1.deslocar(); // Exemplo prévio de polimorfismo (uma função de mesmo nome tendo
							// comportamento diferente em outro objeto)

		
		
		System.out.println("\n\n----- Criando um Objeto da Subclasse do Tipo da Superclasse -----");
		Veiculo veiculo1 = new Carro("Fiat", "Uno", 2015, 4);
		Veiculo veiculo2 = new Moto("Honda", "Bros 160", 2023, true);
		
		veiculo1.deslocar(); // A sobrescrita de método é mantida: imprime a função deslocar da subclasse
		
//		veiculo1.getNumeroDePortas(); ERRO: pois essa função pertence apenas à subclasse e não à superclasse (Veiculo)
		
		veiculo2.deslocar(); // A sobrescrita de método é mantida: imprime a função deslocar da subclasse

	}

}
