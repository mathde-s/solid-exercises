package ex02;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.setOperacao(new Soma());
        System.out.println(calc.calcular(1,2));
    }
}
