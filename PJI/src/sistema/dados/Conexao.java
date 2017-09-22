package sistema.dados;

//Conexão
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3307/camadas";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection abrir() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException(ex.getMessage());

        }

    }

    public static void fechar(Connection kleber){
        try {
            kleber.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
    
}
