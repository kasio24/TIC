package primero;

import java.util.Scanner;


public class Hola_Mundo { 

    public static void main(String[] args) throws Exception {
        
        // Comentario de linea

        /*
            Comentario en bloque
            hola muchachos 
        
        */


        /*
        * Este es un comentario de documentación
        * 
        */

        

        //byte numeroByte = 127; // perdida de precision, conversión de tipos


        /*
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("numeroByte = " + Byte.MAX_VALUE);
        System.out.println("numeroByte = " + Byte.MIN_VALUE);
        System.out.println("\f --------------------------------------------------------- " );
        
        short numeroShort =  (short)32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("numeroShort = " + Short.MAX_VALUE);
        System.out.println("numeroShort = " + Short.MIN_VALUE);
        System.out.println("\f --------------------------------------------------------- " );

        int numeroInt = (int)2147483648L;  //literal entera por de default de 32bit 
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("numeroInt = " + Integer.MAX_VALUE);
        System.out.println("numeroInt = " + Integer.MIN_VALUE);
        System.out.println("\f --------------------------------------------------------- " );

        var numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("numeroLong = " + Long.MAX_VALUE);
        System.out.println("numeroLong = " + Long.MIN_VALUE);
        System.out.println("\f \t\t--------------------------------------------------------- " );
        var numeroInt2 =10;
        numeroInt2 = (int)numeroLong; 
        System.out.println("numeroLong = " + numeroInt2);
        
        */
        


        /*
        String persona="jaime";

        var x= 3;
        int z= 4;
        System.out.println(x+z); // se realiza la suma

        var w= persona+x+z;
        var q =x+z +persona;

        System.out.println(q);
        System.out.println(persona+x+z); 
        System.out.println(x+z + persona); 
        System.out.println(persona+(x+z)); // contexto cadena, si al evaluar la expresión de Izquierda a derecha encuentra una cadena doto lo demas es una cadena. 
        */
        
        //----------------------Operadores ---------------------------------------
        /*
        var  sc = new Scanner(System.in);
        System.out.println("\n Ingrese primer termino 'A'");
        String termino = sc.nextLine();
        int numA =Integer.valueOf(termino);
        System.out.println("\n Ingrese primer termino 'B'");
        var numB =Integer.valueOf( sc.nextLine());
        var resultado = numA+numB;                      // variable resultado definida como entera 
        System.out.println("\n Resultado Suma = " + resultado);
        resultado = numA/numB;  // ya que resultado es una variable entera no puede almacenar flotantes, pero tambien si los terminos son flotantes da como resultado flotante  
        System.out.println("\n Resultado división = " + resultado);  // solo se puede ver la parte entera del resultado 
        float resultado2 = 3/numB;
        System.out.println("\n Resultado2 división = " + resultado2);  
        */
        
        for (int i=0; i<=2; i++){
            System.out.println("\n imprimir  = " + (i));
            
        }
        System.out.println("--------------------------------------");

        for ( int i=0; i<=2; i++){
            System.out.println("\n imprimir  = " + (++i));
        }
        int a=10;
        int b=1;    
        
        a=a-b;
        System.out.println("\n imprimir  = " + a);
        a=10; // reinicia variable
        a-=b;
        System.out.println("\n imprimir  = " + a);

       /* if(numA%2 == 0){
            System.out.println("\n el numero es par");
        }else{
            System.out.println("\n el numero es impar");
        }
        do {
            numB+=numB;
            System.out.println("\n numB es:"+ numB);
            
        }while(numB<=numA);
        */
    }
}
