package paquete1;

class Clase2 { //clas default o pacage /solo se puede utilizar dentro del mismo paquete
    String atributoDefault = "Valor del atributo default";

    //Clase2(){
  //      System.out.println("Constructor default");
  //  }

    public Clase2(){
        super();
        this.atributoDefault = "modificacion del atributo default";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }

    void metodoDefault(){
        System.out.println("Metodo default");
    }
    // TEST MODIFICADORES NO PUEDE TRABAJAR CON ESST ACLASE POR Q ES DEFAULT Y ES SOLO DENTRO DEL MISMO PAQUETE
}
