import uuid
from django.db import models

# Create your models here.

class Genero(models.Model):
    name = models.CharField(max_length=64, help_text="Nombre del Genero")
    
    def __str__(self):
        return self.name
    
class Pelicula(models.Model):
    titulo = models.CharField(max_length=32)
    director = models.ForeignKey('Director', on_delete=models.SET_NULL, null=True)
    resumen = models.TextField(max_length=100, help_text='Sinopsis de Pelicula')
    genero = models.ManyToManyField(Genero)
    
    def __str__(self):
        return self.titulo
    
    def get_absolute_url(self):
        return reverse("pelicula_detail", args=[str(self.id)])
    
class PeliculaID(models.Model):
    id = models.UUIDField(primary_key=True, default=uuid.uuid4, help_text='ID unico de esta Pelicula')
    pelicula= models.ForeignKey('Pelicula', on_delete=models.SET_NULL, null=True)
    imp = models.CharField(max_length=200)
    alquiler = models.DateField(null=True, blank=True)
    
    LOAN_STATUS = (
        ('d', 'Disponible'),
        ('m', 'Mantenimiento'),
        ('n', 'No disponible'),
    )
    
    status = models.CharField(max_length=1, choices=LOAN_STATUS, blank=True, default='m', help_text='Disponibilidad de la Pelicula')
    
    class Meta:
        ordering = ['alquiler']
        
    def __str__(self):
        return '%s (%s)' % (self.id, self.pelicula)
    
class Director(models.Model):
    nombre = models.CharField(max_length=100)
    apellido = models.CharField(max_length=100)   
    fecha_de_nacimiento = models.DateField(null=True, blank=True)
    fecha_finado= models.DateField('Died', null=True, blank=True)
    
    def get_absolute_url(self):
        return reverse("Director_detail", args=[str(self.id)])
    
    def __str__(self):
        return '%s %s' % (self.nombre, self.apellido)
    
    