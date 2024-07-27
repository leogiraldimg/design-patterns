package giraldi.dev.factory;

import giraldi.dev.transports.Transport;
import giraldi.dev.transports.Truck;

public class RoadLogistic extends Logistic {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
