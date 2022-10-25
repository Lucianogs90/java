package encapsulamento;

public class ControleElgin implements Controle {
    private boolean ligado;
    private int temperaturaMinima = 16;
    private int temperaturaMaxima = 32;
    private int temperaturaAtual = 24;

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(int temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(int temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public int getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(int temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void aumentarTemperatura(int n) {
        if (this.isLigado()) {
            int i = 0;

            while (this.getTemperaturaAtual() < this.getTemperaturaMaxima() && n > i) {
                this.setTemperaturaAtual(this.getTemperaturaAtual() + 1);
                i++;
            }
        }
    }

    @Override
    public void diminuirTemperatura(int n) {
        if (this.isLigado()) {
            int i = 0;

            while (this.getTemperaturaAtual() > this.getTemperaturaMinima() && n > i) {
                this.setTemperaturaAtual(this.getTemperaturaAtual() - 1);
                i++;
            }
        }
    }
}
