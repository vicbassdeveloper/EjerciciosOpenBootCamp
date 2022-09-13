# En este ejercicio tendréis que crear una tabla llamada Alumnos que constará de tres columnas: 
#  la columna id de tipo entero, la columna nombre que será de tipo texto y la columna apellido que también será de tipo texto.
 
# Una vez creada la tabla, tenéis que insertarle datos, como mínimo tenéis que insertar 8 alumnos a la tabla.
 
# Por último, tienes que realizar una búsqueda de un alumno por nombre y mostrar los datos por consola.

import sqlite3

def nuevo_alumno():
    ag = 1
    while ag != 0:
        nombre_alumno = str(input("Nombre: "))
        apellido_alumno = str(input("Apelllido: "))
        agregar_alumno(nombre_alumno, apellido_alumno)
        
        print(f"se agrego {datos_alumno(nombre_alumno)}")
        
        ag = int(input("Deseas agregar otro alumno?"))

def agregar_alumno(nombre_alumno, apellido_alumno):
    conect = sqlite3.connect("reg.db")
    cursor = conect.cursor()
    cursor.execute(f"INSERT INTO alumnos(NOMBRE, APELLIDO) VALUES('{nombre_alumno}', '{apellido_alumno}');")
    conect.commit()
    cursor.close()
    conect.close()

def datos_alumno(nombre_alumno):
    conect = sqlite3.connect("reg.db")
    cursor = conect.cursor()
    cursor.execute(f"SELECT * FROM Alumnos WHERE Nombre = '{nombre_alumno}';")
    alumno = cursor.fetchall()
    cursor.close()
    conect.close()

    return alumno
 

nuevo_alumno()