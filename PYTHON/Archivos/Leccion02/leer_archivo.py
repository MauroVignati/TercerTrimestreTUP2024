
archivo = open('prueba.txt', 'r', encoding='utf8')# modo para leer (r): read, otras letras : 'w':write,'a':append,'x'
#print(archivo.read()) #muestra todo el archivo
print(archivo.read(15))# muestra 15 caracteres
print(archivo.read(12))# muestra los siguentes 12 despues del anterior
print(archivo.readline())# lee la PRIMER LINEA
print(archivo.readline()) #lee la SEGUNDA

# VAMOS a iterar el archivos, cada una de las lineas
for linea in archivo:
    print(linea) #iteramos todos los elementos del archivo

print(archivo.readlines()) #accedemos al archivo como una lista
print(archivo.readlines()[2]) # Tratamos como una lista