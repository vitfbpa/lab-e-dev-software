package DAO;

import beans.Aluno;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;


public class alunoDAO {
    
    private Conexao conexao;
    
    private Connection conn;
    
    public alunoDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Aluno aluno){
        
        String sql = "INSERT INTO alunos (nome, idade, curso) VALUES (?,?,?);";
        //O INSERT INTO insere um novo registro na tabela pessoa, 
        //onde os valores para as colunas nome, sexo e idioma serão fornecidos por parâmetros (?,?,?).
        
        try {
            
            // O objeto PreparedStatement permite que você substitua os '?' no SQL com valores reais.
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            //Substituição dos Parâmetros:
            //Aqui os parâmetros ? são preenchidos com os valores correspondentes:
            stmt.setString(1, aluno.getNome()); //O primeiro parâmetro 1 é substituído por pessoa.getNome().
            stmt.setInt(2, aluno.getIdade()); //O segundo parâmetro 2 é substituído por pessoa.getSexo().
            stmt.setString(3, aluno.getCurso()); //O terceiro parâmetro 3 é substituído por pessoa.getIdioma().
            
            stmt.execute(); //Isso executa o comando SQL, inserindo o registro no banco de dados
            
        }catch(SQLException ex){
            System.out.println("Erro ao inserir pessoa"+ex.getMessage());
        }
        
    }
    
    public Aluno consulta(int id){
        
        String sql = "SELECT * FROM alunos WHERE id = ?;";
        
        try{
            
            PreparedStatement stmt = this.conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Aluno a = new Aluno();
            
            rs.first();
            a.setId(id);
            a.setId(rs.getInt("id"));
            a.setNome(rs.getString("nome"));
            a.setIdade(rs.getInt("idade"));
            a.setCurso(rs.getString("curso"));
            
            return a;
            
            
            
        }catch(SQLException ex){
            System.out.println("Erro ao consultar dados do aluno" + ex.getMessage());
            return null;
        }
        
    }
    
    
     public void atualizar(Aluno aluno){
        
        String sql = "UPDATE alunos set nome = ?, idade = ?, curso = ? WHERE id = ?;";
        //O INSERT INTO insere um novo registro na tabela pessoa, 
        //onde os valores para as colunas nome, sexo e idioma serão fornecidos por parâmetros (?,?,?).
        
        try {
            
            // O objeto PreparedStatement permite que você substitua os '?' no SQL com valores reais.
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getIdade());
            stmt.setString(3, aluno.getCurso());
            stmt.setInt(4, aluno.getId());
            
            stmt.execute();
            
            
        }catch(SQLException ex){
            System.out.println("Erro ao atualizar os dados do aluno"+ex.getMessage());
            
        }
    }
     
    public void excluir(int id){
        
        try{
            
            String sql = "DELETE FROM alunos WHERE id = ?;";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            
            
        }catch(SQLException ex){
            System.out.println("Erro ao excluir os dados do aluno"+ex.getMessage());
            
        }
        
        
    }
    
     public List<Aluno> getAlunos(){
       
       String sql = "SELECT * FROM alunos";
       
       try{
           
           PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
           
           ResultSet rs = stmt.executeQuery();
           List<Aluno> listaAlunos = new ArrayList();
           
           while (rs.next()){
               Aluno a = new Aluno();
               a.setId(rs.getInt("id"));
               a.setNome(rs.getString("nome"));
               a.setIdade(rs.getInt("idade"));
               a.setCurso(rs.getString("curso"));
               listaAlunos.add(a);
           }
           return listaAlunos;
           
           
       }catch(SQLException ex){
           System.out.println("Erro ao consultar todos os alunos: " + ex.getMessage());
           return null;
       }
       
   }
     
     public List<Aluno> getAlunosNome(String nome){
       
       String sql = "SELECT * FROM alunos WHERE nome LIKE ?";
       
       try{
           
           PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
           
           stmt.setString(1,"%"+nome +"%");
           ResultSet rs = stmt.executeQuery();
           List<Aluno> listaAlunos = new ArrayList();
           
           while (rs.next()){
               Aluno a = new Aluno();
               a.setId(rs.getInt("id"));
               a.setNome(rs.getString("nome"));
               a.setIdade(rs.getInt("idade"));
               a.setCurso(rs.getString("curso"));
               listaAlunos.add(a);
           }
           return listaAlunos;
           
           
       }catch(SQLException ex){
           System.out.println("Erro ao consultar todos os alunos: " + ex.getMessage());
           return null;
       }
       
   }
}