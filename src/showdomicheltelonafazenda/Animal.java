package showdomicheltelonafazenda;

public abstract class Animal {

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }
    public String nome;
    public int idade;

    public void EmitirSom() {

        System.out.println("ESTOU FAZENDO BARULHO");
    }

}
