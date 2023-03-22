print("Este programa recorre numeros de maner impar y los muestra en pantalla")

numero_inicial = int(input("Escribe el numero inicial"))
numero_final = int(input("Escribe el numero final, este debe ser mayos que el numero inicial.")) 


for x in range (numero_inicial, numero_final):
    if x%2 != 0:
        print(x)