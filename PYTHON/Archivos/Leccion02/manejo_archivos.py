#Declaramos una variable

try:
    archivo = open('prueba.txt', 'w', encoding = 'utf8') #La   w es de escribir, encoding para usar los acentos
    archivo.write('Prgramamos condiferentes tipos de archivos, ahora en txt.\n')
    archivo.write('Los acentos son importantes para las palabras \n')
    archivo.write('como por ejemplo: acción, ejecución y producción\n')
    archivo.write('las letras son: \n "r": read, leer\n "a": append, anexar\n "w": write, escribir\n"x": crea un archivo ')
    archivo.write(' \n"t": text, texto\n"b": binary, binario \n"w+": write and read, escribir y leer \n"r+": read and write, leer y escribir')
    archivo.write('\nCon esto terminamos')
except Exception as e:
    archivo.close() #Con esto se cierra el archivo

#archivo.write('Todo quedo perfecto'): este es un error (archivo cerrado)
