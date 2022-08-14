
package Tema9;


public class EjerTema9 {

    
    public static void main(String[] args) {
    
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.nombre = "Nacho García";
        cliente.edad = 29;
        cliente.numtelefono = 952658512;
        cliente.credito = 1000;

        System.out.println("Mi nombre es: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Mi nunero es: " + cliente.numtelefono);
        System.out.println("Credito que tengo: " + cliente.credito + "euros");

        System.out.println("------------------------");

        trabajador.nombre = "Juan Perez";
        trabajador.edad = 32;
        trabajador.numtelefono = 946851232;
        trabajador.salario = 1500;

        System.out.println("Mi nombre es: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Mi nunero es: " + trabajador.numtelefono);
        System.out.println("Mi salario es de: " + trabajador.salario + "euros");

    }
}

class Persona {

    int edad;
    String nombre;
    int numtelefono;
}

class Cliente extends Persona {

    double credito;
}

class Trabajador extends Persona {

    double salario;
}
