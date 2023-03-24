package com.ejercicio.implementacion;

public class CocheCrudImpl implements CocheCRUD {


    @Override
    public String save() {
        return save;
    }

    @Override
    public String findAll() {
        return findAll;
    }

    @Override
    public String delete() {
        return delete;
    }

    String save = "Guardando Coche";
    String findAll = "Buscando todos los coches";
    String delete = "Borrando Coche";


}