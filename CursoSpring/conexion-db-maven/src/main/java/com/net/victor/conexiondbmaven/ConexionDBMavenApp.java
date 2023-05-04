package com.net.victor.conexiondbmaven;

import java.sql.*;

public class ConexionDBMavenApp {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Carga de Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Credenciales y ruta
        String url = "jdbc:mysql://localhost:3306/tienda?useSSL=false&allowPublicKeyRetrieval=true";
        String user= "tienda";
        String password= "Conquerors.";

        //Conexion a base de Datos
        Connection conexion = DriverManager.getConnection(url, user, password);

        Statement statement = conexion.createStatement();

        //Mala practica "SELECT * FROM cliente"
        //Deber ser SELECT (CAMPOS)
        ResultSet resultSet = statement.executeQuery("SELECT * FROM cliente");

        while (resultSet.next()) {
            System.out.println("ID: "+ resultSet.getInt("id_cliente") +" Nombre: "+ resultSet.getString("nombre")+"  Peso "+ resultSet.getInt("peso"));
        }

        resultSet.close();
        statement.close();
        conexion.close();
    }
}