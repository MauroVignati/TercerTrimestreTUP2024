class Empleado {
    constructor(nombre, salario) {
        this._nombre = nombre;
        this._salario = salario;
    }

    obtenerDetalles() {
        return `Empleado: nombre: ${this._nombre},
         salario: ${this._salario}`;
    } 
}
class Gerente extends Empleado {
    constructor(nombre, sueldo, departamento) {
        super(nombre, sueldo);
        this._departamento = departamento;
    }
    //Agregamos la sobreescritura
    obtenerDetalles() {
        return `Gerente: ${super.obtenerDetalles()}, 
        departamento: ${this._departamento}`;
    }
}

function imprimir(tipo) {
    console.log(tipo.obtenerDetalles());
    if(tipo instanceof Gerente) {
        console.log('Es un objeto de tipo Gerente');
        console.log(tipo._departamento); //Accediendo a la propiedad del gerente con el encapsulamiento.
    }
    else if(tipo instanceof Empleado) {
        console.log('Es un objeto de tipo Empleado');
    }
    else if( tipo instanceof Object){ //no muestra por que la clase empleado antes es verdadera y se va por ahi
        console.log('Es de tipo Object')
    }
}
//Creando objetos de las clases
let empleado1 = new Empleado('Juan', 3000);
let gerente1 = new Gerente('Carlos', 5000, 'Sistemas');
console.log(empleado1);
console.log(gerente1);
console.log(empleado1.obtenerDetalles());
console.log(gerente1.obtenerDetalles());

imprimir(gerente1);
imprimir(empleado1);