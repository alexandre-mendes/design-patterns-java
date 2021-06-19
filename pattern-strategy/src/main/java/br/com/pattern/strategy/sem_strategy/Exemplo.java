package br.com.pattern.strategy.sem_strategy;

import java.util.Scanner;

public class Exemplo {

    private static Double distancia;
    private static TipoFrete tipoFrete;
    private static Frete frete = new Frete();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Informe a distância: ");
            distancia = scanner.nextDouble();

            System.out.println("Informe o tipo de frete (1) Normal, (2) Sedex: ");
            var opcaoSelecionada = scanner.nextInt();
            tipoFrete = TipoFrete.values()[opcaoSelecionada - 1];

            var valorFrete = frete.calcularFrete(distancia, tipoFrete);
            System.out.println("Valor total R$" + valorFrete);
        }
    }
}
