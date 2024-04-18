package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZonaTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    //
    //
    @Test
    public void ValorCirculoArena(){
        LOG.info("Iniciado test ValorCirculoArena");
        Zona zona = new Zona("Zona1");// Crea una instancia de Zona con radio 10
        double resultadoCalculado = zona.CalcularCircularArena(); 
        double valorEsperado = 3141592.65;
        assertEquals(valorEsperado, resultadoCalculado,0.01);
        LOG.info("finalizando test ValorCirculoArena");
    }

    //
    @Test
    public void ValorRectanguloGramaS (){
        LOG.info("Iniciado test ValorRectanguloGramaS");
        Zona zona = new Zona("Zona1");// Crea una instancia de Zona con radio 10
        double resultadoCalculado = zona.CalcularRectanguloGramaS(); 
        double valorEsperado = 7000000;
        assertEquals(valorEsperado, resultadoCalculado);
        LOG.info("finalizando test ValorRectanguloGramaS");
    }

     //
     @Test
     public void ValorCuadradoGramaN (){
         LOG.info("Iniciado test ValorCuadradoGramaN");
         Zona zona = new Zona("Zona1");// Crea una instancia de Zona con radio 10
         double resultadoCalculado = zona.CalcularCuadradoGramaN(); 
         double valorEsperado = 2000000;
         assertEquals(valorEsperado, resultadoCalculado);
         LOG.info("finalizando test ValorCuadradoGramaN");
     }

      //
    @Test
    public void ValorTrianguloAsfalto(){
        LOG.info("Iniciado test ValorTrianguloAsfalto");
        Zona zona = new Zona("Zona1");// Crea una instancia de Zona con radio 10
        double resultadoCalculado = zona.CalcularTrianguloAsfalto(); 
        double valorEsperado = 4000000;
        assertEquals(valorEsperado, resultadoCalculado);
        LOG.info("finalizando test ValorTrianguloAsfalto");
    }

 





    



}
