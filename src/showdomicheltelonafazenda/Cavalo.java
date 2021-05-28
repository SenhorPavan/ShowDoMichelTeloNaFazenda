package showdomicheltelonafazenda;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void EmitirSom() {
        System.out.println("EU SOU UM CAVALO EU FAÇO POCOTÓ POCOTÓ: " + this.nome + this.idade);
        System.out.println("----------------------------------------------");

    }

}
