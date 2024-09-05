package giraldi.dev.factories;

import giraldi.dev.bebidas.Bebida;
import giraldi.dev.comidas.Comida;

public interface DeliveryFactory {

    Comida criaComida();

    Bebida criaBebida();
}
