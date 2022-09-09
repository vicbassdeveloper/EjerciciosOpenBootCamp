# En este ejercicio tenéis que crear una lista de RadioButton que muestre la opción que se ha seleccionado y que contenga un botón de reinicio 
# para que deje todo como al principio.
# Al principio no tiene que haber una opción seleccionada.


from tkinter import *

def seleccionar():
    monitor.config(text="{}".format(opcion.get()))
def reset():
    opcion.set(None)
    monitor.config(text="")

root = Tk()
opcion = StringVar()
opcion.set(None)
Radiobutton(root, text="Opcion1", variable=opcion, 
            value='Opcion1', command=seleccionar).pack(anchor=W)

Radiobutton(root, text="Opcion2", variable=opcion, 
            value="Opcion2", command=seleccionar).pack(anchor=W)
Radiobutton(root, text="Opcion3", variable=opcion,   
            value='Opcion3', command=seleccionar).pack(anchor=W)
Radiobutton(root, text="Opcion4", variable=opcion,   
            value='Opcion4', command=seleccionar).pack(anchor=W)

monitor = Label(root)
monitor.pack()
Button(root, text="Reiniciar", command=reset).pack()

root.mainloop()