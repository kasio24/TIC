package segundo;

public class ClasesWrapper {
    public static void main(String[] args) {

        Integer x = 34;
        Integer y = Integer.getInteger("42");

        Double w = 2.5;
        

        String numero ="2022";
        String strTrue ="true";
        String strFalse ="False";

        int numeroInt = Integer.parseInt(numero);
        float numeroFloat = Float.parseFloat(numero);
        double numeroDouble = Double.parseDouble(numero);
        long numeroLong = Long.parseLong(numero);
        short numeroShort = Short.parseShort(numero);
        boolean v = Boolean.parseBoolean(strTrue);
        boolean f = Boolean.parseBoolean(strFalse);
    
        
        String a= x.toString();
        String b= w.toString();
    
        System.out.println("\n->"+numeroInt+"\n->"+numeroFloat+"\n->"+numeroDouble+"\n->"+numeroLong+"\n->"+numeroShort);
        System.out.println("\n->"+v+"\n->"+f);
        System.out.println("\n->"+a+"\n->"+b);
    }
}
