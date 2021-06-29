package primero;

import javax.swing.JOptionPane;

public class ClaseString {
    public static void main(String[] args) {
        
        String texto ="Hola Programadores ciclo 2";
        String puntero =" de java";
        JOptionPane.showMessageDialog(null, texto);

        // length() longitud de la cadena
        System.out.println(texto.length()); 

        // substring captura parte de la cadena
        System.out.println(texto.substring(6,18));

        //toLowerCase and toUpperCase poner en mayuscula y minuscula la cadena
        System.out.println(texto.toLowerCase());
        System.out.println(texto.toUpperCase());

        //equals compara cadenas
        System.out.println(texto.equals("Hola Programadores ciclo 1"));
        System.out.println(texto.equals("Hola Programadores ciclo 2"));

        //contac concatenar cadenas 
        System.out.println(texto.concat(puntero));

        //replace cambiar cadenas
        System.out.println(texto.replaceAll("Hola", "Animo"));

        // combinar metodos
        System.out.println(texto.toUpperCase().replaceAll("HOLA", "ANIMO"));

        //indexOf
        System.out.println(texto.indexOf("c"));

        //lasIndexOf
        System.out.println(texto.lastIndexOf("c"));

        //charAt
        System.out.println(texto.charAt(5));

        // trim 
        var texto2 = texto.trim();
        System.out.println(texto2);
    }
}
