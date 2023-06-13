package StrategyMethod;

public class CalculadoraTempoViagem {

    private float valorVelocidade;
    private float valorDistancia;

    public CalculadoraTempoViagem(float valorVelocidade, float valorDistancia) {
        this.valorVelocidade = valorVelocidade;
        this.valorDistancia = valorDistancia;
    }

    public float calcular(Calculo calculo) {
        return calculo.calcular(valorVelocidade, valorDistancia);
    }
}
