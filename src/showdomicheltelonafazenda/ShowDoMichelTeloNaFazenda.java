package showdomicheltelonafazenda;

public class ShowDoMichelTeloNaFazenda {

    public static void main(String[] args) {

        Animal listaAnimal[] = new Animal[10];
        listaAnimal[0] = new Cachorro("PAULO ", 6);
        listaAnimal[1] = new Gato("Carlos ", 4);
        listaAnimal[2] = new Cachorro("CÉSAR ", 10);
        listaAnimal[3] = new Cachorro("CIRILO ", 17);
        listaAnimal[4] = new Gato("BOLA DE PELO ", 4);
        listaAnimal[5] = new Cavalo("TROVÃO ", 10);
        listaAnimal[6] = new Cachorro("CACHORRO CARAMELO ", 7);
        listaAnimal[7] = new Gato("GUGU ", 5);
        listaAnimal[8] = new Cavalo("AGNALDO ", 12);
        listaAnimal[9] = new Cavalo("GUGU 2.0 ", 12);

        for (int i = 0; i <= 9; i++) {
            listaAnimal[i].EmitirSom();

        }

    }

}
