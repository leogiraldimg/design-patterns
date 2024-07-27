package giraldi.dev.factory;

import giraldi.dev.transports.Transport;

public abstract class Logistic {

    public void planDeliver() {
        Transport transport = createTransport();
        transport.deliver();
    }

    public abstract Transport createTransport();
}
