# Generated by Django 4.1.1 on 2022-09-20 23:46

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('catalog', '0004_pelicula_imagen'),
    ]

    operations = [
        migrations.AddField(
            model_name='director',
            name='imagen',
            field=models.URLField(null=True),
        ),
    ]
