from NumerosIgualesException import NumerosIgualesException


resultado = None
a = '10'
b= 0

try:
    a =int(input('Digite el primer numero: '))
    b = int(input('Digite el segundo numero: '))
    if a == b:
        raise NumerosIgualesException('Los numeros son iguales')
    resultado = a / b

except ZeroDivisionError as e:
    print(f'ZeroDivisionError -  Ocurrio un error: {type(e)}')
except TypeError as e:
    print(f'TypeError -  Ocurrio un error: {type(e)}')
except Exception as e:
    print(f'Exception -  Ocurrio un error: {type(e)}')
else :
    print('No se arrojo ninguna excepcion')
finally:
    print('Ejecucion de este bloque final')
print(f'El resultado es: {resultado}')
print('seguimos...')
