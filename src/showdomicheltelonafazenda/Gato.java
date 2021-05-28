package showdomicheltelonafazenda;

public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void EmitirSom() {
        System.out.println("EU SOI UM GATO, EU FAÇO MIAU MIAU: " + this.nome + this.idade);
        System.out.println("----------------------------------------------");

    }

}
