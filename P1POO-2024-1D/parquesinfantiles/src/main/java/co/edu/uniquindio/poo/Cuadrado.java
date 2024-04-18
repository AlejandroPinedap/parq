package co.edu.uniquindio.poo;

public class Cuadrado extends Rectangulo {

    private double lado;

    public Cuadrado (double lado) {

        super(lado, lado);
        this.lado=lado;
        

        
    }

    public double calcularArea () {

        assert lado >= 0; 
        
        return lado * lado;

    }



}
