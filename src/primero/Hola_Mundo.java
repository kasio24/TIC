package primero;

import java.util.Scanner;

public class Hola_Mundo {
    
    public static void main(String[] args) throws Exception {

        // Variable

        int numeroInt = (int)2147483647L;
        System.out.println("numeroInt =" + numeroInt);

    
        
        String edad ="20";
        int edad1= Integer.parseInt(edad);
        System.out.println("\n edad = " + edad + edad1);

        var edadTexto= String.valueOf(edad1);
        System.out.println("\n edadTexto = " + edadTexto);

        //----------------------Operadores ---------------------------------------

        var sc = new Scanner(System.in);

        System.out.println("\n Ingrese primer termino 'A'");
        var numA =Integer.valueOf(sc.nextLine());
        System.out.println("\n Ingrese primer termino 'B'");
        var numB =Integer.valueOf( sc.nextLine());

        /*var resultado = numA+numB;                      // variable resultado definida como entera 
        System.out.println("\n Resultado Suma = " + resultado);

        resultado = numA/numB;
        System.out.println("\n Resultado división = " + resultado);  // solo se puede ver la parte entera del resultado 

        var resultado2 = 3f/numB;
        System.out.println("\n Resultado2 división = " + resultado2);  // solo se puede ver la parte entera del resultado 
        */
        /*for (int i=0; i<=2; i++){

            System.out.println("\n imprimir  = " + (i));
            
        }

        System.out.println("--------------------------------------");

        for (int i=0; i<=2; i++){
            System.out.println("\n imprimir  = " + (++i));
        }*/

        /*if(numA%2 == 0){
            System.out.println("\n el numero es par");
        }else{
            System.out.println("\n el numero es impar");
        }*/

        do {
            numB+=numB;
            System.out.println("\n numB es:"+ numB);
            
        }while(numB<=numA);

        System.out.println("\n termino");

    }
}
