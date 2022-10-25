package encapsulamento;

public interface Controle {
    static boolean ligado = false;

    public abstract void ligar();
    
    public abstract void desligar();

    public abstract void aumentarTemperatura(int n);

    public abstract void diminuirTemperatura(int n);
}
