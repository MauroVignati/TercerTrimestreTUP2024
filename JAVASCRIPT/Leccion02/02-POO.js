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

let empleado1 = new Empleado('Juan', 3000);
let gerente1 = new Gerente('Carlos', 5000, 'Sistemas');
console.log(empleado1);
console.log(gerente1);
console.log(empleado1.obtenerDetalles());
console.log(gerente1.obtenerDetalles());