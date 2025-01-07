package ex02;

public class Calculadora {
    private Operacao operacao;

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public double calcular(int a, int b) {
        return operacao.calcular(a, b);
    }
}
