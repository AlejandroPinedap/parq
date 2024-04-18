package co.edu.uniquindio.poo;


import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;



public class Veterinaria {
    // Atributos
    private String nombre;
    private int edad;
    private static Collection <Mascota> mascotas;
    

    /**
     * Constructor de la clase Veterinaria
     * @param nombre
     */
    public Veterinaria(String nombre) {
        assert nombre != null;
        mascotas = new LinkedList<>();
        this.nombre = nombre;
        Veterinaria.mascotas = new ArrayList<>();
        
    }

    /**
     * Metodo para agregar mascotas
     * @param mascota
     */
    public void agregarMascota(Mascota mascota){
        assert VerificarIdMascotaExistente(mascota.idMascota()) == false;
        mascotas.add(mascota);
    }
    
     
    /**
     * Metodo para verificar que el ID de la mascota y no se repita en la lista de las mascotas
     * @param idMascota
     * @return existe
     */
    private boolean VerificarIdMascotaExistente(String idMascota){
        boolean existe = false;
        for(Mascota mascota : mascotas){
            if(mascota.idMascota().equals(idMascota)){
                existe = true;
            }
        }
        return existe;
    }
    
     /**
     * Metodo para verificar que el ID de la mascota no se repita en la lista de las mascotas
     * @param edadMascota
     * @return existe
     */
    private boolean VerificarMascotasMayores10anios (int edadMascota){
        boolean existe = false;
        for (Mascota mascota : mascotas) {
            if (mascota.edad() > edadMascota) { // Compara si la edad de la mascota es mayor a la edad proporcionada
                existe = true;
                break; // No necesitas continuar el bucle una vez que encuentras una mascota con la edad requerida
            }
        }
        return existe;
    }
    


     /**
     * Metodo get para obtener el nombre de la veterinaria
     * @return nombre
     */
    public String getNombre(){
        return nombre;
    }
    
    public int getedad(){
        return edad;
    }

     /**
     * Metodo para obtener la lista de mascotas
     * @return mascotas
     */
    public static Collection<Mascota> getMascotas() {
        return mascotas;
    }
    
    


    
}


   

    