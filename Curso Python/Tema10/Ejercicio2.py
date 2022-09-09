from cgitb import text
from msilib import MSIMODIFY_INSERT_TEMPORARY
from tkinter import *



interfaz = Tk()


label = Label(interfaz)
interfaz.pack()
Button(interfaz, text="Reiniciar, comand=").pack()


interfaz.mainloop()