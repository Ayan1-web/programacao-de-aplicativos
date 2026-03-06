public class Carro {

    private String marca;
    private int velocidade_atual;
    private int velocidade_maxima;

    
    public Carro(String marca, int velocidade_maxima) {
        this.marca = marca;
        this.velocidade_maxima = velocidade_maxima;
        this.velocidade_atual = 0; 
    }

    public void acelerar(int valor) {

        if (valor <= 0) {
            System.out.println("Valor de aceleração inválido.");
            return;
        }

        if (velocidade_atual + valor > velocidade_maxima) {
            velocidade_atual = velocidade_maxima;
            System.out.println("Atingiu a velocidade máxima: " + velocidade_maxima + " km/h");
        } else {
            velocidade_atual += valor;
            System.out.println("Acelerando... Velocidade atual: " + velocidade_atual + " km/h");
        }
    }

    public void frear(int valor) {

        if (valor < 0) {
            System.out.println("Valor de frenagem inválido.");
            return;
        }

        if (valor > velocidade_atual) {
            System.out.println("Erro: Não é possível frear mais que a velocidade atual.");
            return;
        }

        velocidade_atual -= valor;
        System.out.println("Freando... Velocidade atual: " + velocidade_atual + " km/h");
    }

    public int getVelocidadeAtual() {
        return velocidade_atual;
    }

    public int getVelocidadeMaxima() {
        return velocidade_maxima;
    }
}