package StrategyMethod;

public class CalculoOnibus implements Calculo {

    public float calcular(float valorVelocidade, float valorDistancia) {
        return (valorDistancia / valorVelocidade) * 1.3f;
    }
}