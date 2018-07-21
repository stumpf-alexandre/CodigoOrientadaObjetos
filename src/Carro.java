public class Carro {
    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;

    public void acelera(double velocidade){
        double novaVelocidade = this.velocidadeAtual + velocidade;
        this.velocidadeAtual = novaVelocidade;
    }

    public void ligar(){
        System.out.println("Carro ligado");
    }
}
