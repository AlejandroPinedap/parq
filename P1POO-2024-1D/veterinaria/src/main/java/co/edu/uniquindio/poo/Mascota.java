package co.edu.uniquindio.poo;

public record Mascota (String nombre, String especie, String raza, int peso, String genero, int edad, String color, String idMascota) {

    public Mascota {
        assert nombre != null && !nombre.isBlank(): "El nombre no puede ser nulo y tampoco debe estar vacio.";
        assert especie != null && !especie.isBlank():"El nombre de la especie no puede ser un dato nulo y tampoco debe estar vacio";
        assert raza != null && !raza.isBlank():"La raza de la mascota no puede ser un nula y tampoco puede estar vacia";
        assert peso >= 0;
        assert genero != null && !genero.isBlank () && genero.contains ("M") || genero.contains("F"):"El genero de la mascota no debe se un dato nulo, tampoco puede estar vacio y debe ser respresentado con una M si es masculino y un F si es femenino";
        assert edad >= 0;
        assert color!= null && !color.isBlank():"El color no puede ser un dato nulo y tampoco debe estar vacio";
        assert idMascota!= null && !idMascota.isBlank():"La id de la mascota no puede ser null ni un dato vacio";
    }

}



