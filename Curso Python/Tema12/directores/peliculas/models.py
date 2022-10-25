from django.db import models

# Create your models here.

class Director(models.Model):
    nombre = models.CharField(max_length=50)
    apellidos = models.CharField(max_length=50)   
    fecha_de_nacimiento = models.DateField(null=True, blank=True)
    fecha_finado= models.DateField(null=True, blank=True)
    biografia = models.TextField()
    imagen = models.URLField(max_length=200, null=True)
    
    def __str__(self):
        return '%s %s' % (self.nombre, self.apellidos)
    
class Genero(models.Model):
    name = models.CharField(max_length=64, help_text="Nombre del Genero")
    
class Pelicula(models.Model):
    titulo = models.CharField(max_length=32)
    director = models.ForeignKey(Director, on_delete=models.SET_NULL, null=True)
    resumen = models.TextField(max_length=100, help_text='Sinopsis de Pelicula')
    genero = models.ManyToManyField(Genero)
    duracion = models.PositiveIntegerField()
    imagen = models.URLField(max_length=200, null=True)
    
    def __str__(self):
        return self.titulo