// Clase DispositivoEntrada
class DispositivoEntrada {
    constructor(tipoEntrada, marca) {
        this._tipoEntrada = tipoEntrada;
        this._marca = marca;
    }

    get tipoEntrada() {
        return this._tipoEntrada;
    }

    set tipoEntrada(tipoEntrada) {
        this._tipoEntrada = tipoEntrada;
    }

    get marca() {
        return this._marca;
    }

    set marca(marca) {
        this._marca = marca;
    }

    toString() {
        return `Tipo de Entrada: ${this._tipoEntrada}, Marca: ${this._marca}`;
    }
}

// Clase Raton
class Raton extends DispositivoEntrada {
    static contadorRatones = 0;

    constructor(tipoEntrada, marca) {
        super(tipoEntrada, marca);
        this._idRaton = ++Raton.contadorRatones;
    }

    get idRaton() {
        return this._idRaton;
    }

    toString() {
        return `Ratón [ID: ${this._idRaton}, ${super.toString()}]`;
    }
}

// Clase Teclado
class Teclado extends DispositivoEntrada {
    static contadorTeclados = 0;

    constructor(tipoEntrada, marca) {
        super(tipoEntrada, marca);
        this._idTeclado = ++Teclado.contadorTeclados;
    }

    get idTeclado() {
        return this._idTeclado;
    }

    toString() {
        return `Teclado [ID: ${this._idTeclado}, ${super.toString()}]`;
    }
}

// Clase Monitor
class Monitor {
    static contadorMonitores = 0;

    constructor(marca, tamanio) {
        this._idMonitor = ++Monitor.contadorMonitores;
        this._marca = marca;
        this._tamanio = tamanio;
    }

    get idMonitor() {
        return this._idMonitor;
    }

    get marca() {
        return this._marca;
    }

    set marca(marca) {
        this._marca = marca;
    }

    get tamanio() {
        return this._tamanio;
    }

    set tamanio(tamanio) {
        this._tamanio = tamanio;
    }

    toString() {
        return `Monitor [ID: ${this._idMonitor}, Marca: ${this._marca}, Tamaño: ${this._tamanio}]`;
    }
}

// Clase Computadora
class Computadora {
    static contadorComputadoras = 0;

    constructor(nombre, monitor, teclado, raton) {
        this._idComputadora = ++Computadora.contadorComputadoras;
        this._nombre = nombre;
        this._monitor = monitor;
        this._teclado = teclado;
        this._raton = raton;
    }

    get idComputadora() {
        return this._idComputadora;
    }

    toString() {
        return `Computadora ${this._idComputadora}: ${this._nombre}\n    ${this._monitor}\n    ${this._raton}\n    ${this._teclado}`;
    }
}

// Clase Orden
class Orden {
    static contadorOrdenes = 0;

    constructor() {
        this._idOrden = ++Orden.contadorOrdenes;
        this._computadoras = [];
    }

    get idOrden() {
        return this._idOrden;
    }

    agregarComputadora(computadora) {
        this._computadoras.push(computadora);
    }

    mostrarOrden() {
        let ordenStr = `Orden: ${this._idOrden}\nComputadoras:\n`;
        this._computadoras.forEach((computadora, index) => {
            ordenStr += `${index + 1}. ${computadora}\n`;
        });
        return ordenStr;
    }
}

// Pruebas del sistema
// Crear dispositivos
const raton1 = new Raton('USB', 'HP');
const teclado1 = new Teclado('Bluetooth', 'MSI');
const monitor1 = new Monitor('Dell', '24 pulgadas');

// Crear una computadora
const computadora1 = new Computadora('PC Gaming', monitor1, teclado1, raton1);

// Crear una orden
const orden1 = new Orden();
orden1.agregarComputadora(computadora1);

// Mostrar resultados
console.log(orden1.mostrarOrden());

// Crear más dispositivos para una segunda computadora
const raton2 = new Raton('USB', 'Acer');
const teclado2 = new Teclado('USB', 'Acer');
const monitor2 = new Monitor('Acer', '27 pulgadas');
const computadora2 = new Computadora('PC Oficina', monitor2, teclado2, raton2);

// Agregar segunda computadora a la orden
orden1.agregarComputadora(computadora2);

// Mostrar orden actualizada
console.log('\nOrden actualizada:');
console.log(orden1.mostrarOrden()); 