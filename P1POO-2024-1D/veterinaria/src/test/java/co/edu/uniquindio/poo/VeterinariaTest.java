package co.edu.uniquindio.poo;
/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * VeterinariaTest
 */

public class VeterinariaTest {

    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    /**
     * Prueba para verificar que el nombre del curso este correcto
     */
    @Test
    public void datosCompletosCurso(){
        LOG.info("Inicio test datosCompletosCurso");
        Veterinaria veterinaria = new Veterinaria("Amigos Peludos");
        assertEquals("Amigos Peludos", veterinaria.getNombre());
        LOG.info("Fin test datosCompletosCurso");
    }

    /**
     * Prueba para verificar que los datos del curso no esten nulos
     */
    @Test
    public void datosNulosCurso(){
        LOG.info("Inicio test datosCompletosVeterinaria");
        assertThrows(Throwable.class, ()-> new Veterinaria(null));
        LOG.info("Fin test datosCompletosVeterinaria");
    }
    /**
     * Prueba para registrar las mascotas
     */
    @Test
public void registrarMascota(){
    LOG.info("Inicio test registrarMascota");
    Veterinaria veterinaria = new Veterinaria("Amigos Peludos");
    Mascota mascota = new Mascota ("Tobi", "perro", "labrador", 12, "M", 10, "blanco", "19");

    veterinaria.agregarMascota(mascota);
    assertTrue(Veterinaria.getMascotas().contains(mascota));
    assertEquals(1, Veterinaria.getMascotas().size());

    LOG.info("Fin test registrarMascota");
}

     /**
     * 
     */
    @Test
    public void VerificarIdMascotaExistente(){
        LOG.info("Inicio test verificarIdMascota");
        Veterinaria veterinaria = new Veterinaria("Amigos Peludos");

        Mascota mascota1 = new Mascota("Tobi", "perro", "labrador", 12, "M", 10, "blanco", "19");

        Mascota mascota2 = new Mascota("luci", "perro", "buldog", 10, "F", 5, "blanco", "19");

        Mascota mascota3 = new Mascota("paca", "gato", "siames", 4, "F", 2, "cafe oscuro", "19");

        Mascota mascota4 = new Mascota("teo", "loro", "perico", 1, "M", 2, "verde", "19");



        veterinaria.agregarMascota(mascota1);

        assertThrows(Throwable.class, ()-> veterinaria.agregarMascota(mascota2));
        assertThrows(Throwable.class, ()-> veterinaria.agregarMascota(mascota3));
        assertThrows(Throwable.class, ()-> veterinaria.agregarMascota(mascota4));


        LOG.info("Fin test verificarIdMascota");
    }

    
    
    
}