package giraldi.dev.factories;

import giraldi.dev.bebidas.Bebida;
import giraldi.dev.bebidas.Refrigerante;
import giraldi.dev.comidas.Comida;
import giraldi.dev.comidas.Pizza;

public class PizzariaFactory implements DeliveryFactory {

    @Override
    public Comida criaComida() {
        return new Pizza();
    }

    @Override
    public Bebida criaBebida() {
        return new Refrigerante();
    }
}
