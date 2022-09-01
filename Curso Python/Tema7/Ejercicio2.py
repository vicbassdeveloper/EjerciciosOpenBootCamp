import time

hora = time.strftime("%H")
minutos = time.strftime("%M")
h = int(hora)
m = int(minutos)

if h >= 19:
    print("Es hora de ir a casa")
else:
    print(f"Faltan {18 - h} horas con {60 - m} minutos para salir del trabajo")