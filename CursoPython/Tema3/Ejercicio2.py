peso = float(input("Mi peso es de: "))
altura = float(input("Mi altura es de: "))


alturaImc = altura * altura
imc = peso / alturaImc


print("Tu indice de masa corporal es de: ", round(imc))

