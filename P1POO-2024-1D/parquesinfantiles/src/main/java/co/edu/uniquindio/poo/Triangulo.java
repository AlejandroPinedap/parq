package co.edu.uniquindio.poo;

public class Triangulo extends Figura {

    private double base;

    private double altura;

    //constructor

    public Triangulo (double base, double altura){

        this.base = base;
        this.altura = altura;

    }

    public double calcularArea () {

        assert base >= 0;
        assert altura >= 0;
        return (base * altura)/2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }



    
}