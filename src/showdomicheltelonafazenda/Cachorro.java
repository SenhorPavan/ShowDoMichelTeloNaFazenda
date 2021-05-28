
package showdomicheltelonafazenda;


public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void EmitirSom() {
        System.out.println("EU SOU UM CACHORRO, EU FAÇO AU AU: "+ this.nome + this.idade);
        System.out.println("----------------------------------------------");
        
    }
    
    
    
}
