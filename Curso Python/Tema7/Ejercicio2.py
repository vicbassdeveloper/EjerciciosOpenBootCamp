import time

h = int(time.strftime("%H"))
m = int(time.strftime("%M"))


if h >= 19:
    print(f"Ya son las {h}:{m} es hora de ir a casa")
else:
    print(f"La hora es {h}:{m}. Faltan {18 - h}:{60 - m} hrs para salir del trabajo")