package giraldi.dev.factory;

import giraldi.dev.transports.Ship;
import giraldi.dev.transports.Transport;

public class SeaLogistic extends Logistic {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
