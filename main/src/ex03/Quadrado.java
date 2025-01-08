package ex03;

public class Quadrado implements  FormaGeometrica{
    protected int lado;

    public void setLado(int lado){
        this.lado = lado;
    }

    @Override
    public int getArea() {
        return lado * lado;
    }
}
