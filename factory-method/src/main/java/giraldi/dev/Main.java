package giraldi.dev;

import giraldi.dev.factory.Logistic;
import giraldi.dev.factory.RoadLogistic;
import giraldi.dev.factory.SeaLogistic;

public class Main {
    private static Logistic logistic;

    public static void main(String[] args) {
        try {
            configure(args);
            runBusinessLogic();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

    static void configure(String[] args) throws Exception {
        if (args.length < 1) {
            throw new Exception("Tipo de logística é obrigatório ser passado no argumento!");
        }

        switch (args[0]) {
            case ("Rodoviária"):
                logistic = new RoadLogistic();
                break;
            case ("Marítima"):
                logistic = new SeaLogistic();
                break;
            default:
                throw new Exception("Tipos de logística disponíveis: Rodoviária e Marítima");
        }
    }

    static void runBusinessLogic() {
        logistic.planDeliver();
    }
}