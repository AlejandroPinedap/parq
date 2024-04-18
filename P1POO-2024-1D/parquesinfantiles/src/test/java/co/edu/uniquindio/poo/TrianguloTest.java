package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class TrianguloTest {
    
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    // area triangulorectangulo postivo

    @Test
    public void areaTrianguloRectangulo(){

        LOG.info("Inicializando test de areaTrianguloRectangulo");
        Triangulo triangulo = new Triangulo(10, 20);
        assertEquals(100, triangulo.calcularArea());
        LOG.info("Finalizacion test areaTrianguloRectangulo");
    }

    // area TrianguloRectangulo base negativa

    @Test
    public void areaTriangulobasenegativa(){

        LOG.info("Inicializando test de areatriangulobasenegativa");
        Triangulo triangulo = new Triangulo(-10, 20);
        assertThrows(Throwable.class, ()-> triangulo.calcularArea());
        LOG.info("Finalizando test de areatriangulobasenegativa");

    }

    // area TrianguloRectanguloAlturaNegativa

    @Test
    public void areaTrianguloAlturanegativa(){

        LOG.info("Inicializando test de areatrianguloAlturanegativa");
        Triangulo triangulo = new Triangulo(10, -20);
        assertThrows(Throwable.class, ()-> triangulo.calcularArea());
        LOG.info("Finalizando test de areatrianguloAlturanegativa");

    }
}