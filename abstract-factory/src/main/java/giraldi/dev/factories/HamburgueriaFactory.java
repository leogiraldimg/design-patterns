package giraldi.dev.factories;

import giraldi.dev.bebidas.Bebida;
import giraldi.dev.bebidas.MilkShake;
import giraldi.dev.comidas.Comida;
import giraldi.dev.comidas.Hamburguer;

public class HamburgueriaFactory implements DeliveryFactory {

    @Override
    public Comida criaComida() {
        return new Hamburguer();
    }

    @Override
    public Bebida criaBebida() {
        return new MilkShake();
    }
}
