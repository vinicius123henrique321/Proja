/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;



/**
 *
 * @author fatec
 */
public class ConnectionFactory {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:/cadAluno","root","fatec");
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
