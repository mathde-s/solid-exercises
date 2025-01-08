package ex03;

public class Retangulo implements FormaGeometrica{
    protected int largura;
    protected int altura;

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int getArea() {
        return altura * largura;
    }
}
