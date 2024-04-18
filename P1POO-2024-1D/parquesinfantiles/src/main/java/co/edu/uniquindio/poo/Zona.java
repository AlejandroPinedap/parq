package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.PrecioMaterial.Material;

public class Zona {

    private String nombre;

    //constructor

    public Zona (String nombre) {

        this.nombre=nombre;

    }

   
    public double CalcularCircularArena() {

        double radio = 10;
        double valor = Material.ARENA.getValorMetroCuadrado();
        double area = Math.PI * Math.pow(radio, 2);
        double resultado = area * valor;
        return resultado;
        
    }

    public double CalcularRectanguloGramaS() {
        double ancho = 10;
        double lado = 20;
        double valor = Material.GRAMASINTECTICA.getValorMetroCuadrado();
        double area = lado*ancho;
        double resultado = area*valor;
        return resultado;

    }

    public double CalcularCuadradoGramaN(){
        double lado = 10;
        double valor = Material.GRAMANATURAL.getValorMetroCuadrado();
        double area = lado*lado;
        double resultado = area*valor;
        return resultado;

    }

    public double CalcularTrianguloAsfalto(){
        double base = 10;
        double altura = 20;
        double valor = Material.ASFALTO.getValorMetroCuadrado();
        double area = (base*altura)/2;
        double resultado = area*valor;
        return resultado;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
    
    public String getNombre() {
        return nombre;
    }



    
    

}
