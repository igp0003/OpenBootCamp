
package Tema3;


public class EjerTema3 {

    
    public static void main(String[] args) {
    
        //Primera parte:
        suma(1, 2, 3);//llamamos a la funcion y damos valores

        //Segunda parte:
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();//llamamos a la funcion para incrementar el nº de puertas
        System.out.println("El numero de puertas del coche es: " + miCoche.numPuertas);
    }

    //Primera parte:
    public static void suma(int a, int b, int c) { //creamos funcion con 3 parametros
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}

//Segunda parte:

class Coche { // creamos la clase coche

    int numPuertas = 4;

    public void incrementarPuertas() { //funcion para incrementar el nº de puertas
        this.numPuertas++;
    }
}
