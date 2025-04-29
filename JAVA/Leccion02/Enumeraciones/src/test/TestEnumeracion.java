package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeracion {
    public static void main(String[] args) {
        System.out.println("Dia 1: "+ Dias.MARTES);
        indicarDiaSemana(Dias.MARTES);
        System.out.println("Continente No 4: "+ Continentes.AMERICA);
        System.out.println("No. de paises en el 4to continentes: "+ Continentes.AMERICA.getPaises());
        System.out.println("No. de habitantes en el 4to continentes: "+ Continentes.AMERICA.getHabitantes());
        System.out.println("Continente No 1: "+ Continentes.AFRICA);
        System.out.println("No. de paises en el 1ro. continentes: "+ Continentes.AFRICA.getPaises());
        System.out.println("No. de habitantes en el 1ro continentes: "+ Continentes.AFRICA.getHabitantes());
        System.out.println("Continente No 2: "+ Continentes.ASIA);
        System.out.println("No. de paises en el 2o continentes: "+ Continentes.ASIA.getPaises());
        System.out.println("No. de habitantes en el 2o continentes: "+ Continentes.ASIA.getHabitantes());
        System.out.println("Continente No 3 "+ Continentes.OCEANIA);
        System.out.println("No. de paises en el 3ro continentes: "+ Continentes.OCEANIA.getPaises());
        System.out.println("No. de habitantes en el 3ro continentes: "+ Continentes.OCEANIA.getHabitantes());
        System.out.println("Continente No 5: "+ Continentes.EUROPA);
        System.out.println("No. de paises en el 5to continentes: "+ Continentes.EUROPA.getPaises());
        System.out.println("No. de habitantes en el 5to continentes: "+ Continentes.EUROPA.getHabitantes());
    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Quarta dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinta dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto Dia de la semana ");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("No pertenece a dia de la semana");
        }
    }
}
