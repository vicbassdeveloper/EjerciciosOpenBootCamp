print("Funcion que determina si un año es bisiesto")

print("Esrciibe un año y te dire si es bisiesto: ")
año = int(input("..."))

def año_bisiesto(año):
    if año % 4 == 0:
        print("Es un año bisiesto")
    else:
        print("No es un año bisiesto, intentalo de nuevo")


año_bisiesto(año)