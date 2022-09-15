from audioop import reverse
from turtle import title
from django.db import models

# Create your models here.
class Genre(models.Model):
    name = models.CharField(max_length=64, help_text="Nombre de Genero")
    
    def __str__(self):
        return self.name
    
class Pelicula(models.Model):
    title = models.CharField(max_length=32)
    director = models.ForeignKey('Director', on_delete=models.SET_NULL, null=True)
    trama = models.TextField(max_length=100, help_text='Trama de la pelicula')
    genre = models.ManyToManyField(Genre)
    
    def __str__(self):
        return self.title
    
    def get_absolute_url(self):
        return reverse("pelicula_detail", args=[str(self.id)])
    