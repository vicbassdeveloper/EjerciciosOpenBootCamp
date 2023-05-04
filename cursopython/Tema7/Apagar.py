import time
import os

h = int(time.strftime("%H"))
m = int(time.strftime("%M"))


if h >= 18 and m >= 55:
    print(f"Ya son las {h}:{m} es hora de ir a casa")
    os.system("shutdown /s /t 300 /c \"Huye!!! el equipo explotara en 5 minutos, cierra todo y largo de aqui") 
else:
    print(f"La hora es {h}:{m}. Faltan {18 - h}:{60 - m} hrs para salir del trabajo")