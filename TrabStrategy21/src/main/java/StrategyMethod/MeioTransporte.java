package StrategyMethod;

public class MeioTransporte {

    private float tempoGasto;

    public float getTempoGasto() {
        return tempoGasto;
    }

    public void calcularTempoCarro(float velocidade, float distancia) {
        CalculadoraTempoViagem calculadoraTempoViagem = new CalculadoraTempoViagem(velocidade, distancia);
        this.tempoGasto = calculadoraTempoViagem.calcular(new CalculoCarro());
    }

    public void calcularTempoOnibus(float velocidade, float distancia) {
        CalculadoraTempoViagem calculadoraTempoViagem = new CalculadoraTempoViagem(velocidade, distancia);
        this.tempoGasto = calculadoraTempoViagem.calcular(new CalculoOnibus());
    }

    public void calcularTempoMoto(float velocidade, float distancia) {
        CalculadoraTempoViagem calculadoraTempoViagem = new CalculadoraTempoViagem(velocidade, distancia);
        this.tempoGasto = calculadoraTempoViagem.calcular(new CalculoMoto());
    }

}
