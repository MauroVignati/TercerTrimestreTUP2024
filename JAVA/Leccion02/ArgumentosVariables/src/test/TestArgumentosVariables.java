package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumero(3,4,5);
        imprimirNumero(1,2);
        variosParametros("Juanito",7,8,9);
    }

    private static void variosParametros(String nombre, int ...numeros){//los variables siempre al final
        System.out.println("Nombre: "+nombre);
        imprimirNumero(numeros);
    }

    private static void imprimirNumero(int ...numeros) {
        for (int i = 0;i < numeros.length;i++) {
            System.out.println("Elementos: " + numeros[i]);
        }
    }
}
