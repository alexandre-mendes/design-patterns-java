package br.com.pattern.strategy.com_strategy;

import java.util.Scanner;


/**
* Classe representante do context
* */
public class Exemplo {

    private static Double distancia;
    /**
     * Obter instância de concrete strategy
     * */
    private static TipoFrete tipoFrete;
    /**
     * Strategy
     * */
    private static Frete frete;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Informe a distância: ");
            distancia = scanner.nextDouble();

            System.out.println("Informe o tipo de frete (1) Normal, (2) Sedex: ");
            var opcaoSelecionada = scanner.nextInt();
            tipoFrete = TipoFrete.values()[opcaoSelecionada - 1];

            frete = tipoFrete.obterFrete();
            var valorFrete = frete.calcularFrete(distancia);
            System.out.println("Valor total R$" + valorFrete);
        }
    }
}
