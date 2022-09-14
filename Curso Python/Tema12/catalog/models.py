from django.db import models

class Genere(models.Model):
    name = models.CharField(max_length=64, help_text=('Genero'))
    
    def __str__(self):
        return self.name

