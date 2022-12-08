import java.util.ArrayList;

public class Lutador implements IPersonagem {
    ArrayList<IObserver> observadores = new ArrayList<IObserver>();
    private String nome = "Goku";
    private double cp = 10;

    @Override
    public void registrarObservador(IObserver observador) {
        this.observadores.add(observador);
    }

    @Override
    public void notificarInimigo() {
        for (IObserver obs : observadores) {
            obs.update();
        }
    }
}