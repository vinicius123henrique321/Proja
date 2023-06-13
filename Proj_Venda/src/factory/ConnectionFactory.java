package factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConnectionFactory {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:/Aluno","root","vinielivia1@");
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
