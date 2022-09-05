from pickle import *

class Vehiculo:
    
    def __init__(self, t, p, m, v):
        self.tipo = t
        self.puertas = p
        self.modelo = m
        self.version = v
    
    def __str__(self):
      return self.tipo + " " + self.puertas + " " + self.modelo + " " + self.version


vento = Vehiculo("sedan","4","2017","startline")
print(vento)

f = open("vehiculo_objeto","w+b")

dump(vento, f)

f.seek(0)
nuevo_vento = load(f)
print(nuevo_vento)
f.close