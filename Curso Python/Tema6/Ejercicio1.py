class Vehiculo:
    color = "Rojo"
    puertas = 4
    ruedas = 4          
        
class Coche(Vehiculo):
    velocidad = 120
    cilindrada = 1200
    
        
        
carro = Coche()
print("El carro es de color", carro.color, "tiene", carro.puertas, "puertas y", carro.ruedas, "llantas.")
print("La velocidad es de", carro.velocidad, "Km/h.")
print("El carro tiene una cilindrada de", carro.cilindrada)