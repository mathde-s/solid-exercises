package ex05;

public class Main {
    public static void main(String[] args) {
        DispositivoEntrada teclado = new Teclado();
        Computador computador = new Computador(teclado);
        computador.usarDispositivo();
    }
}
