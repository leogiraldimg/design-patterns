package giraldi.dev;

import giraldi.dev.cliente.Cliente;
import giraldi.dev.factories.DeliveryFactory;
import giraldi.dev.factories.HamburgueriaFactory;
import giraldi.dev.factories.PizzariaFactory;

import java.util.Objects;

public class Main {

    public static void main(String[] args) throws Exception {
        DeliveryFactory factory;

        if (Objects.equals(args[0], "pizzaria")) {
            factory = new PizzariaFactory();
        } else if (Objects.equals(args[0], "hamburgueria")) {
            factory = new HamburgueriaFactory();
        } else {
            throw new Exception("Tipo do estabelecimento é obrigatório!");
        }

        Cliente cliente = new Cliente(factory);
        cliente.criaPedido("cebola");
    }
}
