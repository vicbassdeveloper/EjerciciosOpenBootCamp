from django.shortcuts import render, HttpResponse
from . models import Pelicula, PeliculaID, Director, Genero

# Create your views here.

def index(request):
    num_peliculas = Pelicula.objects.all().count()
    num_ids = PeliculaID.objects.all().count()
    
    disponibles = PeliculaID.objects.filter(status__exact='d').count()
    num_director = Director.objects.all().count()
    num_genero = Genero.objects.all().count()
    
    return render(
        request, 
        'index.html',
        context={
            'num_peliculas': num_peliculas,
            'num_director': num_director,
            'disponibles': disponibles,
            'num_ids': num_ids,
            'num_genero': num_genero,
        }
    )   
    
def peliculas(request):
    nombre = Pelicula.titulo
    return render(
        request,
        'peliculas.html'
        )
    
def directores(request):
    nombre = Director.nombre
    apellido = Director.apellido
    return render(
        request,
        'directores.html'
    )    