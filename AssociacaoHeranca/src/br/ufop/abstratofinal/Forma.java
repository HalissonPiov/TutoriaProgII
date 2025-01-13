package br.ufop.abstratofinal;

abstract class Forma {
    protected String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    // Método abstrato (deve ser implementado pelas subclasses)
    public abstract double calcularArea();

    // Método final (não pode ser sobrescrito pelas subclasses)
    public final void exibirCor() {
        System.out.println("A cor da forma é: " + cor);
    }
}
