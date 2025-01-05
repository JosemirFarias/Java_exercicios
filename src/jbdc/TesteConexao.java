package jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {

        final String url = "jbdc:mysql://localhost/curso_java";
        final String usuario = "root";
        final String senha = "8558jfbm";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        System.out.println("Conexão efetuada com sucesso");
        conexao.close();
    }
}
