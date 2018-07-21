public class TestaCarroMetodos {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.cor = "Azul";
        meuCarro.modelo = "HB20";
        meuCarro.velocidadeMaxima = 120;

        System.out.println("Meu Carro\n");
        System.out.println("Cor: " + meuCarro.cor);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Velocidade Maxima: " + meuCarro.velocidadeMaxima + "\n\n");

        meuCarro.ligar();
        meuCarro.acelera(110);

        System.out.println("Meu Carro Acelerando");
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Velocidade Atual: " + meuCarro.velocidadeAtual);
    }
}
