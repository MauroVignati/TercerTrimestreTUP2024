package paquete2;

public class Clase4 {

    private String atributoPrivado = "atributo Privado";

    private Clase4() {
        System.out.println("Constructor privado");
    }

    //Creamos un constructor public para poder crear objetos
    public Clase4(String argumento) { //Aqui se puede llamar al constructor vacio
        this();
        System.out.println("Constructor publico");
    }

    //Metodo private
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
}
