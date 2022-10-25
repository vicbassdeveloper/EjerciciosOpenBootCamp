from django.shortcuts import render
from django.views import generic

from .models import Director, Pelicula, Genero


    
def index(generic.ListView):
    
        
        template_name = 'directores.html'
        model = Director 
        
         


class DirectorView(generic.DetailView):
    template_name = 'director.html'
    model = Director

class PeliculaView(generic.DetailView):
    template_name = 'pelicula.html'
    model = Pelicula
    
def peliculas(request):
    return render(
        request,
        'pelicula.html'
    )
    
class Genero(generic.ListView):
    model = Genero
    
    
def genero(request):
    return render(
        request,
        'genero.html'
        )