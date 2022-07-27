
package Tema4;


public class EjercicioTema4 {

    
    public static void main(String[] args) {

        //ejercicio if
        int numeroIf = 1;

        if (numeroIf > 0) {
            System.out.println("La variable numeroIf " + numeroIf + " es positivo");
        } else if (numeroIf < 0) {
            System.out.println("La variable numeroIf " + numeroIf + " es negativo");
        } else {
            System.out.println("La variable numeroIf es 0");
        }

        
        //ejercicio while
        int numeroWhile = 0;

        while (numeroWhile < 3) {

            numeroWhile++;// tambien valdría numeroWhile=numeroWhile+1;
            System.out.println("La variable numeroWhile vale ahora: " + numeroWhile);
        }

        
        //ejercicio do while
        int numeroDoWhile = 0;

        do {

            numeroDoWhile++;
            System.out.println("La variable numeroDoWhile vale ahora: " + numeroDoWhile);

        } while (numeroDoWhile < 3);
        
        
        //ejercicio for 
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("La variable numeroFor vale ahora: " + numeroFor);
        }
        
      
        //ejercicio switch
        String estacion = "primavera";

        switch (estacion) {
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}
