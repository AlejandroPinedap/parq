package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class CuadradoTest {
    
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());
    
    //area cuadrado 

    @Test
    public void areaCaudrado(){
     
        LOG.info("Iniciando test areaCuadrado");
        Cuadrado cuadrado = new Cuadrado(10);
        assertEquals(100, cuadrado.calcularArea());
        LOG.info("Finalizacion test areaCuadrado");

    }

    @Test
    public void areaCaudradonegativo(){

        LOG.info("Iniciando test areacuadradonegativo");
        Cuadrado cuadrado = new Cuadrado(-10);
        assertThrows(Throwable.class, ()-> cuadrado.calcularArea());
        LOG.info("Finalizacion test areacuadradonegativa");

    }
}
