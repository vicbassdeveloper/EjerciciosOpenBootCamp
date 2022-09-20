from django.urls import re_path, path
from . import views
from . views import index, peliculas

urlpatterns = [
    path('', index, name='admin-index'),
    path('peliculas/', views.peliculas, name='peliculas'),
    path('directores/', views.directores, name='directores'),
]
