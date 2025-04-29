package mundopc;

import ar.mundo.system2023.muncopc.*;


public class mundoPc {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP",13); //Importar clase
        Teclado tecladoHP = new Teclado("Bluetooth","HP");
        Raton ratonHP = new Raton("Bluetooth","HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP,ratonHP);

        //Creamos otros objetos diferentes
        Monitor monitorGamer = new Monitor("HP",13); //Importar clase
        Teclado tecladoGamer = new Teclado("Bluetooth","HP");
        Raton ratonGamer = new Raton("Bluetooth","HP");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        Orden orden1 = new Orden(); //Inicializamos el arreglo vacio
        Orden orden2 = new Orden();//Nueva lista para el objeto orden2
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraHP);

        Computadora computadorasVarias = new Computadora("Computadora diferentes marcas", monitorHP, tecladoGamer,ratonHP);
        orden2.agregarComputadora(computadorasVarias);

        orden1.mostrarOrden();
        orden2.mostrarOrden();

    }
}
