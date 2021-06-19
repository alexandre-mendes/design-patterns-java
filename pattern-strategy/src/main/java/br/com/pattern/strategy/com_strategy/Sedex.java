package br.com.pattern.strategy.com_strategy;

/**
 * Classe representante do concrete strategy
 * */
public class Sedex implements Frete {

    public Double calcularFrete(Double distancia) {
        return distancia * 1.32 + 12;
    }
}
