/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class MascotaTest {
    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        assertTrue(true);
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }

    /**
     * Test para verificar si los datos de la mascota estan completos
     */

    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datosCompletos");
        
        Mascota mascota = new Mascota ("Toby", "perro", "pitbull", 12, "M", 9, "blanco","12");

        assertEquals("Toby", mascota.nombre());
        assertEquals("perro", mascota.especie());
        assertEquals("pitbull", mascota.raza());
        assertEquals(12, mascota.peso());
        assertEquals("M", mascota.genero());
        assertEquals( 9, mascota.edad());
        assertEquals("blanco", mascota.color());

        LOG.info("Finalizando test datosCompletos");
    }

    /**
     * Test para verificar que la edad no sea negativa
     */

    @Test
    public void edadNegativa(){
        LOG.info("Iniciando test edadNegativa");

        assertThrows(Throwable.class,() -> new Mascota("toby", "perro","pitbull", 12,"M", -10, "blanco", "12"));

        LOG.info("Finalizacion de test edadNegativa");
    }

    /**
     * Test para verificar que el peso no sea negativo
     */

     @Test
     public void pesoNegativo(){
         LOG.info("Iniciando test pesoNegativo");
 
         assertThrows(Throwable.class,() -> new Mascota("toby", "perro","pitbull", -2,"M", 9, "blanco","12"));
 
         LOG.info("Finalizacion de test pesoNegativo");
     }

    /**
     * Test para verificar que los datos no esten vacios
     */

     @Test
     public void datosVacios(){
        LOG.info("Iniciando test datosVacios");

        assertThrows(Throwable.class,() -> new Mascota("", "", "", 0, "", 0, "",""));
     }

     /**
      * Test para verificar si los datos no estan nulos
      */

      @Test
      public void datosNulos(){
        LOG.info("Inicio de test datosNulos");

        assertThrows(Throwable.class,() -> new Mascota(null, null, null, 0, null, 0, null,null));
      }
      
      /**
       * Test para verificar que el genero de la mascota sea M "Masculino" o F "Femenino"
       */
      @Test
      public void verificarGenero(){
        LOG.info("Inicio de test verificarGenero");

        assertThrows(Throwable.class,() -> new Mascota("toby", "perro","pitbull", 12,"S", 9, "blanco","12"));
      }

 

}
