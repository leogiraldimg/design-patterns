package giraldi.dev.bebidas;

public class MilkShake implements Bebida {

    @Override
    public void escolheSemAcucar() {
        System.out.println("Açúcar removido do milk shake");
    }
}
