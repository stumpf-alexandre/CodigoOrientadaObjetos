public class TestaCarroReferencia {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.cor = "Branco";
        meuCarro.modelo = "Ka";
        meuCarro.velocidadeMaxima = 150;

        Carro amigoCarro = new Carro();
        amigoCarro.cor = "Vermelho";
        amigoCarro.modelo = "BMW";
        amigoCarro.velocidadeMaxima = 350;

        //Carro amigoCarro = meuCarro;

        System.out.println("Meu carro da cor " + meuCarro.cor + " é do modelo " + meuCarro.modelo);
        System.out.println("Amigo carro da cor " + amigoCarro.cor + " é do modelo " + amigoCarro.modelo);

        if (meuCarro == amigoCarro){
            System.out.println("Os dois carros são iguais");
        }
        else {
            System.out.println("Os dois carros são diferentes");
        }
    }
}
