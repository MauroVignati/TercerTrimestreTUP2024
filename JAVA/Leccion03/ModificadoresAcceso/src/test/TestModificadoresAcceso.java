package test;

import paquete1.Clase1;
import paquete2.Clase3;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1.atributoPublic);
        clase1.metodoPublico();

        //Clase1 clase1 = new Clase1("Constructor protected");//Al pasarle un parametros usamos, de los constructores, el que esta protected y no se puede
        //solo desde las clase hija, desde la misma clase o paquete

        //Creamos un objeto desde la clase hija 3, en la cual ya accedimos a los protected de la 1 dentro de la clase 3
        Clase3 claseHija = new Clase3();
        System.out.println("claseHija = " + claseHija);
    }
}
