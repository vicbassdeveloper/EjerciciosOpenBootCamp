
class Alumno:
    
    def datos(self,nombre,nota):
        self.nombre=nombre
        self.nota=nota
        
    def impDatos(self):
        print("Nombre:",self.nombre)
        print("Nota:",self.nota)
        
    def aprobacion(self):
        if self.nota >= 6.5:
            print("El alumno aprobo")
        else:
            print("El alumno reprobo")
            
    def revision(self,nombre,nota):
        self.datos(nombre=nombre, nota=nota)
        self.impDatos()
        self.aprobacion()        
        
        
alumno1=Alumno()
alumno2=Alumno()


alumno1.revision("Isela",8)           
alumno2.revision("Alfonoso",6)