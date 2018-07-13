package dao;

import ConexãoExercicio.ConexaoAluno;
import bean.AlunoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Gabriel Budke
 */
public class AlunoDAO {
    
    public int inserir(AlunoBean aluno){
        
        Connection conexao = ConexaoAluno.obterConexao();
        
        if(conexao!= null){
            String sql = "INSER INT aluno (nome, codigo_matricula, nota_1, nota_2, nota_3, nota_4, frequencia) VALUES (?,?,?,?,?,?)";
            
            try{
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setString(1, aluno.getNome());
                ps.setString(2, aluno.getCodigo_matricula());
                ps.setFloat (3, aluno.getNota_1());
                ps.setFloat (4, aluno.getNota_2());
                ps.setFloat (5, aluno.getNota_3());
                ps.setFloat (6, aluno.getNota_4());
                ps.setInt(7, aluno.getFrequencia());
                ps.execute();
                
                ResultSet resultSet = ps.getGeneratedKeys();
                if(resultSet.next()){
                    return resultSet.getInt(1);
                }
                
                
                
            }catch(SQLException e){
                
            }finally{
                
            }
            
        }
        
        }

        
    
}
