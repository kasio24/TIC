package primero.Ejercicios;
import java.util.Scanner;
public class Segundo {
    public static void main(String[] args) {
        
        var  sc = new Scanner(System.in);
        System.out.println("\n Ingrese grados centígrados");
        String numeroEnteroS = sc.nextLine();
        fahrenheit(numeroEnteroS);
    }

    public static void fahrenheit(String a){
        
        int cen =Integer.parseInt(a);
        String fah = Integer.toString(32+(9*cen/5));
        System.out.println("\n La temperatura en grados fahrenheit es:"+ fah);
    }
}
