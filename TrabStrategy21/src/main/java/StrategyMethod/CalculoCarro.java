package StrategyMethod;

public class CalculoCarro implements Calculo {

    public float calcular(float valorVelocidade, float valorDistancia) {
        return (valorDistancia / valorVelocidade);
    }
}
