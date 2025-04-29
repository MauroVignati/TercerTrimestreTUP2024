# anexamos informacion, copiamos a otro
archivo = open('prueba.txt', 'r', encoding='utf-8')
archivo2 = open('copia.txt', 'a', encoding='utf-8')
archivo2.write(archivo.read())
archivo.close()
archivo2.close()

print('Se ha terminado el proceso de leer y copiar archivos')