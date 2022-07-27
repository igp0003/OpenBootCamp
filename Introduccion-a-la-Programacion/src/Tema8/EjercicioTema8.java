
package Tema8;


public class EjercicioTema8 {

    
    public static void main(String[] args) {
    
        Persona persona = new Persona ();
        
        persona.setNombre("Nacho García");
        persona.setEdad(29);
        persona.setNumtelefono(952898425);
        
        System.out.println("Me llamo " + persona.getNombre());
        System.out.println("Tengo " + persona.getEdad() + " años");
        System.out.println("Mi número de teléfono es " + persona.getNumtelefono());
    }
    
}

class Persona {

    private String nombre;
    private int edad;
    private int numtelefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumtelefono() {
        return numtelefono;
    }

    public void setNumtelefono(int numtelefono) {
        this.numtelefono = numtelefono;
    }
}
