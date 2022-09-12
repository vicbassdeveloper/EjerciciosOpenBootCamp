from cProfile import label
from cgitb import text
from msilib import MSIMODIFY_INSERT_TEMPORARY
from tkinter import *

#En este segundo ejercicio, tendréis que crear una interfaz sencilla 
# la cual debe de contener una lista de elementos seleccionables, 
# también debe de tener un label con el texto que queráis.

def sleccionar():
    interfaz.config(text=f"{opcion.get}")

interfaz = Tk()
opcion = StringVar()
opcion.set(None)

label = Label(interfaz, text="Motos").pack()
    

Radiobutton(interfaz, text="Vento", variable=opcion, value="Vento", command=sleccionar).pack(anchor=W)
Radiobutton(interfaz, text="Itallika", variable=opcion, value="Itallika", command=sleccionar).pack(anchor=W)
Radiobutton(interfaz, text="Honda",variable=opcion, value="Honda", command=sleccionar).pack(anchor=W)
Radiobutton(interfaz, text="Yamaha", variable=opcion, value="Yamaha", command=sleccionar).pack(anchor=W)
Radiobutton(interfaz, text="Triumph", variable=opcion, value="Triumph", command=sleccionar).pack(anchor=W)
Radiobutton(interfaz, text="VMW",variable=opcion, value="VMW", command=sleccionar).pack(anchor=W)
Radiobutton(interfaz, text="Indian", variable=opcion, value="Indian", command=sleccionar).pack(anchor=W)

ventana = Label(interfaz)
interfaz.mainloop()