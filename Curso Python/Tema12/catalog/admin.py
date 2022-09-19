from django.contrib import admin
from .models import Director, Pelicula, PeliculaID, Genero

# Register your models here.
admin.site.register(Genero)
admin.site.register(Director)
admin.site.register(Pelicula)
admin.site.register(PeliculaID)
