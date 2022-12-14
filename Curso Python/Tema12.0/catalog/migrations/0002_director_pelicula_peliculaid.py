# Generated by Django 4.1.1 on 2022-09-19 19:58

from django.db import migrations, models
import django.db.models.deletion
import uuid


class Migration(migrations.Migration):

    dependencies = [
        ('catalog', '0001_initial'),
    ]

    operations = [
        migrations.CreateModel(
            name='Director',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('nombre', models.CharField(max_length=100)),
                ('apellido', models.CharField(max_length=100)),
                ('fecha_de_nacimiento', models.DateField(blank=True, null=True)),
                ('fecha_finado', models.DateField(blank=True, null=True, verbose_name='Died')),
            ],
        ),
        migrations.CreateModel(
            name='Pelicula',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('titulo', models.CharField(max_length=32)),
                ('resumen', models.TextField(help_text='Sinopsis de Pelicula', max_length=100)),
                ('isbn', models.CharField(help_text='ISBN Pelicula', max_length=13, verbose_name='ISBN')),
                ('director', models.ForeignKey(null=True, on_delete=django.db.models.deletion.SET_NULL, to='catalog.director')),
                ('genero', models.ManyToManyField(to='catalog.genero')),
            ],
        ),
        migrations.CreateModel(
            name='PeliculaID',
            fields=[
                ('id', models.UUIDField(default=uuid.uuid4, help_text='ID unico de esta Pelicula', primary_key=True, serialize=False)),
                ('imp', models.CharField(max_length=200)),
                ('alquiler', models.DateField(blank=True, null=True)),
                ('status', models.CharField(blank=True, choices=[('d', 'Disponible'), ('m', 'Mantenimiento'), ('n', 'No disponible')], default='m', help_text='Disponibilidad de la Pelicula', max_length=1)),
                ('pelicula', models.ForeignKey(null=True, on_delete=django.db.models.deletion.SET_NULL, to='catalog.pelicula')),
            ],
            options={
                'ordering': ['alquiler'],
            },
        ),
    ]
