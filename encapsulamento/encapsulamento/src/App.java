import encapsulamento.*;

public class App {
    public static void main(String[] args) throws Exception {
        ControleElgin controle = new ControleElgin();

        System.out.println(controle.getTemperaturaAtual());
        controle.setLigado(true);
        controle.aumentarTemperatura(5);
        System.out.println(controle.getTemperaturaAtual());
        controle.aumentarTemperatura(25);
        System.out.println(controle.getTemperaturaAtual());
        controle.diminuirTemperatura(15);
        System.out.println(controle.getTemperaturaAtual());
        controle.diminuirTemperatura(8);
        System.out.println(controle.getTemperaturaAtual());
    }
}
