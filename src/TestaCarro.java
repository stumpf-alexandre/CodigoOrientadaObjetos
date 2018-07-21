public class TestaCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.cor = "Verde";
        meuCarro.modelo = "X1";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 120;
        System.out.println("Cor do meu carro: " + meuCarro.cor);
        System.out.println("Modelo do meu carro: " + meuCarro.modelo);
        System.out.println("Velocidade atual do meu carro: " + meuCarro.velocidadeAtual);
        System.out.println("Velocidade maxima do meu carro: " + meuCarro.velocidadeMaxima);

        Carro amigoCarro = new Carro();
        amigoCarro.cor = "Preto";
        amigoCarro.modelo = "Z5";
        amigoCarro.velocidadeAtual = 0;
        amigoCarro.velocidadeMaxima = 240;
        System.out.println("Cor do carro do amigo: " + amigoCarro.cor);
        System.out.println("Modelo do carro do amigo: " + amigoCarro.modelo);
        System.out.println("Velocidade atual do carro do amigo: " + amigoCarro.velocidadeAtual);
        System.out.println("Velocidade maxima do carro do amigo: " + amigoCarro.velocidadeMaxima);
    }
}
