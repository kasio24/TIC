package primero.Ejercicios;

import java.util.Scanner;



public class Primero {
    public static void main(String[] args) {
        
        var  sc = new Scanner(System.in);
        System.out.println("\n Ingrese primer termino 'A'");
        String numeroEnteroS = sc.nextLine();
        doble_triple(numeroEnteroS);
    }

    public static void doble_triple(String a){
        String b = "";
        int numA =Integer.parseInt(a);
        a = Integer.toString(numA*2);
        b = Integer.toString(numA*3);

        System.out.println("\n El doble del numero es:"+ a + "\n El triple del numero es:"+ b );
    }

    
}
