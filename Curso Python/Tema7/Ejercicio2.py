import time

hora = time.strftime("%H")
minutos = time.strftime("%M")
h = int(hora)
m = int(minutos)

def h_salir():
    return 18 - h
def m_salir():
    return 60 - m

if h >= 19:
    print("Es hora de ir a casa")
else:
    print(f"Faltan {h_salir()} horas con {m_salir()} minutos para salir del trabajo")