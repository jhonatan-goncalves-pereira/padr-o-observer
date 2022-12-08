public interface IPersonagem {
    void registrarObservador(IObserver observador);

    void notificarInimigo();
}
