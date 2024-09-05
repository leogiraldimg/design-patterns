package giraldi.dev.cliente;

import giraldi.dev.bebidas.Bebida;
import giraldi.dev.comidas.Comida;
import giraldi.dev.factories.DeliveryFactory;

public class Cliente {
    private DeliveryFactory factory;

    public Cliente(DeliveryFactory factory) {
        this.factory = factory;
    }

    public void criaPedido(String ingrediente) {
        Comida comida = factory.criaComida();
        Bebida bebida = factory.criaBebida();

        comida.removeIngrediente(ingrediente);
        bebida.escolheSemAcucar();
    }
}
