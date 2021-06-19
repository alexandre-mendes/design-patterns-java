package br.com.pattern.strategy.sem_strategy;

import static  br.com.pattern.strategy.sem_strategy.TipoFrete.SEDEX;
import static  br.com.pattern.strategy.sem_strategy.TipoFrete.NORMAL;

public class Frete {

    public Double calcularFrete(Double distancia, TipoFrete tipoFrete) {
        var valorFrete = 0.0;
        if (tipoFrete.equals(SEDEX)) {
            valorFrete = distancia * 1.32 + 12;
        } else if (tipoFrete.equals(NORMAL)) {
            valorFrete = distancia * 1.28 + 10;
        }
        return valorFrete;
    }
}
