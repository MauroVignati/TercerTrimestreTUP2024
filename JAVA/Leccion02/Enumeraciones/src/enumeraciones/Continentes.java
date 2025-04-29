package enumeraciones;

public enum Continentes {
    AFRICA(53, "1,2 billones"),
    ASIA(44, "3 billones"),
    OCEANIA(14, "1,7 billones"),
    AMERICA(34, "1,5 billones"),
    EUROPA(46, "1,3 billones");

    private final int paises;
    private String habitantes;
    Continentes(int paises, String habitantes) {
        this.paises = paises;
        this.habitantes = habitantes;
    }
    //Metodo get
    public int getPaises() {
        return paises;
    }
    public String getHabitantes() {
        return habitantes;
    }
}
