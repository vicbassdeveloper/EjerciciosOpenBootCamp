# En este ejercicio tendréis que crear una tabla llamada Alumnos que constará de tres columnas: 
#  la columna id de tipo entero, la columna nombre que será de tipo texto y la columna apellido que también será de tipo texto.
 
# Una vez creada la tabla, tenéis que insertarle datos, como mínimo tenéis que insertar 8 alumnos a la tabla.
 
# Por último, tienes que realizar una búsqueda de un alumno por nombre y mostrar los datos por consola.

import sqlite3

conect = sqlite3.connect("reg.db")
cursor = conect.cursor()

cursor.execute("CREATE TABLE alumnos(ID INTEGER PRIMARY KEY AUTOINCREMENT, NOMBRE TEXT NOT NULL, APELLIDO TEXT NOT NULL);")
cursor.execute("INSERT INTO alumnos(NOMBRE, APELLIDO) VALUES('ALFONSO', 'PEREZ');")
cursor.execute("INSERT INTO alumnos(NOMBRE, APELLIDO) VALUES('ALBERTO', 'SUAREZ');")
cursor.execute("INSERT INTO alumnos(NOMBRE, APELLIDO) VALUES('PATRICIA', 'ZANCHEZ');")
cursor.execute("INSERT INTO alumnos(NOMBRE, APELLIDO) VALUES('GONZALO', 'RIOJA');")
cursor.execute("INSERT INTO alumnos(NOMBRE, APELLIDO) VALUES('MARCO', 'CHAVEZ');")
cursor.execute("INSERT INTO alumnos(NOMBRE, APELLIDO) VALUES('NICTE', 'VAZQUEZ');")
cursor.execute("INSERT INTO alumnos(NOMBRE, APELLIDO) VALUES('ADRIANA', 'AGUIRRE');")
cursor.execute("INSERT INTO alumnos(NOMBRE, APELLIDO) VALUES('MARIA', 'MENA');")

conect.commit()

cursor.execute("SELECT * FROM Alumnos WHERE Nombre = 'PATRICIA';")

alumno = cursor.fetchall()

print(alumno) 

cursor.close()
conect.close()