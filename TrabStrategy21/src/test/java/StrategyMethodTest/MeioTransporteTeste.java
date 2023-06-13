package StrategyMethodTest;

import StrategyMethod.MeioTransporte;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MeioTransporteTeste {

    @Test
    void deveCalcularTempoCarro() {
        MeioTransporte meioTransporte = new MeioTransporte();
        meioTransporte.calcularTempoCarro(100.0f, 200.0f);
            assertEquals(2.0f, meioTransporte.getTempoGasto());
    }

    @Test
    void deveCalcularTempoOnibus() {
        MeioTransporte meioTransporte = new MeioTransporte();
        meioTransporte.calcularTempoOnibus(80.0f, 200.0f);
        assertEquals(3.25f, meioTransporte.getTempoGasto());
    }
    @Test
    void deveCalcularTempoMoto() {
        MeioTransporte meioTransporte = new MeioTransporte();
       meioTransporte.calcularTempoMoto(125.0f, 200.0f);
        assertEquals(1.12f, meioTransporte.getTempoGasto());
    }
    }
