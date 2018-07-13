package ConexãoExercicio;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author Gabriel Budke
 */
public class ConexaoAluno {

    private static String CLASS_NAME = "com.mysql.jdbc.Driver";
    private static String HOST = "jdbc:mysql://localhost/alunos";
    private static String LOGIN = "root";
    private static String SENHA = "";
    private static Connection conexao;

    /*public static void main(String[] args) {
        ConexaoAluno.obterConexao();
    }
    */
    
    public static Connection obterConexao() {
        try {
            conexao = DriverManager.getConnection(HOST, LOGIN, SENHA);
        } catch (SQLException e) {
            e.printStackTrace();

        }

        return conexao;
    }

    public static void fecharConexao() {
        try {
            if (conexao != null) {
                conexao.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
