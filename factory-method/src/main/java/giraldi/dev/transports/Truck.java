package giraldi.dev.transports;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Entrega realizada de caminhão!");
    }
}
