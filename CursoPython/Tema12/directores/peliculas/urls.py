from django.urls import path
from . views import genero, index
from . import views

urlpatterns = [
  path('', index, name='admin-index'),
  path('', views.IndexView.as_view(), name='directores'),
  path('', views.DirectorView.as_view(), name='director'),
  path('', views.peliculas, name='pelicula'),
  path('', views.genero, name='genero'),
]