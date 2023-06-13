package StrategyMethod;

public class CalculoMoto implements Calculo {

    public float calcular(float valorVelocidade, float valorDistancia) {
        return (valorDistancia / valorVelocidade) * 0.7f;
    }
}