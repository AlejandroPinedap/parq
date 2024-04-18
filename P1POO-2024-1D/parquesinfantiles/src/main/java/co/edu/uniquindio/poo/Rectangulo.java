package co.edu.uniquindio.poo;

public class Rectangulo extends Figura {

    private double lado, ancho;

    public Rectangulo(double ancho, double lado){
        this.ancho=ancho;
        this.lado=lado;
    }

    public double calcularArea(){
        assert ancho >= 0;
        assert lado >= 0;
        return lado * ancho;
    }
    
}
