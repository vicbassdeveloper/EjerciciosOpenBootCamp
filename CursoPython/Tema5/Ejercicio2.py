print("Funcion que muestra si el numero es primo o no")

numero = int(input("Escribe un numero: "))

def num_primo(numero):
    for i in range(2, int(numero)):
        if (numero % i) != 0:
            print("El numero", numero, "es primo")
            break
        else:
            print("El numero", numero, "no es primo")
            break

num_primo(numero)