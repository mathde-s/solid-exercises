package ex05;

public class Teclado implements DispositivoEntrada{
    @Override
    public void usar() {
        System.out.println("digitando...");
    }
}
