package org.example.connection;
import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class DataBaseConnection {


    Dotenv dotenv = Dotenv.load();

    private static DataBaseConnection instace;

    private final Connection connection;

    String url = dotenv.get("CHAVE_URL");
    String usuario = dotenv.get("CHAVE_USER");
    String senha = dotenv.get("CHAVE_PASSWORD");

    private DataBaseConnection(){
        try {
            connection = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            throw new RuntimeException("Ocorreu um erro ao se conectar com o banco de dados");
        }
    }

    public static DataBaseConnection getInstace() {
        if (Objects.isNull(instace)) {
            instace = new DataBaseConnection();
        }
        return instace;
    }

    public Connection connection() {
        return connection;
    }
}
