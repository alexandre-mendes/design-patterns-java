package br.com.pattern.strategy.com_strategy;

/**
 * Enum responsável por providenciar a instância de concrete strategy em tempo de execução
 * */
public enum TipoFrete {
    NORMAL{
        @Override
        public Frete obterFrete() {
            return new Normal();
        }
    },
    SEDEX{
        @Override
        public Frete obterFrete() {
            return new Sedex();
        }
    };

    public abstract Frete obterFrete();
}
