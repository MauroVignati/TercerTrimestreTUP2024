package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes o Wrapper
        /*
            Clases envolventes de tipos primitivos
            int = la clase envolvente es integer
         */
        int enteroPrim = 10;//tipo primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        Integer entero = 10;//tipo object con la clase Integer
        System.out.println("entero = " + entero.toString());//el 10 como cadena (Autoboxing)
        System.out.println("entero.floatValue() = " + entero.floatValue());//convertimos a float (10,0) (Autoboxing)
        System.out.println("entero.doubleValue() = " + entero.doubleValue());//Convertimos a entero (Autoboxing) etc etc

        //Unboxing
        int entero2 = entero;
        System.out.println("entero2 = " + entero2); //Unboxing

    }
}
