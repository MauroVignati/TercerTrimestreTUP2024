from ManejoArchivos import ManejoArchivos

#with open('prueba.txt', 'r', encoding='utf8') as archivo: #abre y cierra de manera automatica el archivo
 #   print(archivo.read())

#No hace falta ni el try ni el finallly
# en el contecto de with lo que se ejecuta de manera automatica:
# utiliza diferentes metodos: __enter__, __exit__ : el que abre y cierra respectivamente
# utiliza diferentes metodos: __enter__, __exit__ : el que abre y cierra respectivamente

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())