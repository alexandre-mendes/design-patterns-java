# Exemplo onde o strategy pode ser aplicado

No exemplo temos uma classe que realiza o calculo de frete de acordo com o tipo de frete escolhido e a distância a ser percorrida, o algoritmo que realiza o calculo possui condicionais para verificar qual regra de calculo aplicar para obter o valor. Estas condicionais podem crescer e tornar-se problematicas para realizar manutenção caso novas regras de calculo ou tipo de frete surjam.

```
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
```

Utilizando o pattern strategy podemos separar estas regras em classes distintas, fazendo com que a classe Frete torne-se uma interface e receba implementações para os tipos de frete Sedex e Normal. O Context representado pela classe Exemplo terá um atributo do tipo Frete que por sua vez receberá a implementação correspondetente a regra em tempo de execução de acordo com o que o usuário informar ao solicitar o calculo do frete. 

```
public class Exemplo {
    private Frete frete;
```