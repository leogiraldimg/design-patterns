package giraldi.dev.transports;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Entrega realizada de barco!");
    }
}
