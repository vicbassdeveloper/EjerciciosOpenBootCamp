from cmath import pi
import math

print("Funcion que calcula el area de un triangulo")

base_triangulo = float(input("Escribe la base del triangulo: "))
altura_triangulo = float(input("Escribe la altura del triangulo: "))
radio_circulo = float(input("Escribe el radio del circulo: "))


def area_triangulo(a, b):
    area = float((a*b)/2)
    print(area)

def area_circulo(radio):
    pi = math.pi
    area = float(pi * (radio * radio))
    print("El radio del circulo es: ", area) 

area_triangulo(base_triangulo, altura_triangulo)
area_circulo(radio_circulo)