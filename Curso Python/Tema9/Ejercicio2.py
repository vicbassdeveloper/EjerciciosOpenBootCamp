from functools import reduce



lista= range(0,100)
lista = list(filter(lambda x: x % 2, lista))
lista = reduce(lambda x, y: x + y, lista)


print(lista)