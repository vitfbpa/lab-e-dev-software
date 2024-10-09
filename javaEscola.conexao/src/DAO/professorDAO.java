package DAO;

import beans.Aluno;
import beans.Professor;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class professorDAO {
    
    private Conexao conexao;
    
    private Connection conn;
    
    public professorDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Professor professor){
        
        String sql = "INSERT INTO professores (nome, idade, disciplina) VALUES (?,?,?);";
        //O INSERT INTO insere um novo registro na tabela pessoa, 
        //onde os valores para as colunas nome, sexo e idioma serão fornecidos por parâmetros (?,?,?).
        
        try {
            
            // O objeto PreparedStatement permite que você substitua os '?' no SQL com valores reais.
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            //Substituição dos Parâmetros:
            //Aqui os parâmetros ? são preenchidos com os valores correspondentes:
            stmt.setString(1, professor.getNome()); //O primeiro parâmetro 1 é substituído por pessoa.getNome().
            stmt.setInt(2, professor.getIdade()); //O segundo parâmetro 2 é substituído por pessoa.getSexo().
            stmt.setString(3, professor.getDisciplina()); //O terceiro parâmetro 3 é substituído por pessoa.getIdioma().
            
            stmt.execute(); //Isso executa o comando SQL, inserindo o registro no banco de dados
            
        }catch(SQLException ex){
            System.out.println("Erro ao inserir pessoa"+ex.getMessage());
        }
        
    }
    
    
    
    public Professor consulta(int id){
        
        String sql = "SELECT * FROM professores WHERE id = ?;";
        
        try{
            
            PreparedStatement stmt = this.conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Professor p = new Professor();
            
            rs.first();
            p.setId(id);
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            p.setIdade(rs.getInt("idade"));
            p.setDisciplina(rs.getString("disciplina"));
            
            return p;
            
            
            
        }catch(SQLException ex){
            System.out.println("Erro ao consultar dados do professor" + ex.getMessage());
            return null;
        }
        
    }
    
    public void atualizar(Professor professor){
        
        String sql = "UPDATE professores set nome = ?, idade = ?, disciplina = ? WHERE id = ?;";
        //O INSERT INTO insere um novo registro na tabela pessoa, 
        //onde os valores para as colunas nome, sexo e idioma serão fornecidos por parâmetros (?,?,?).
        
        try {
            
            // O objeto PreparedStatement permite que você substitua os '?' no SQL com valores reais.
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, professor.getNome());
            stmt.setInt(2, professor.getIdade());
            stmt.setString(3, professor.getDisciplina());
            stmt.setInt(4, professor.getId());
            
            stmt.execute();
            
            
        }catch(SQLException ex){
            System.out.println("Erro ao atualizar os dados do professor"+ex.getMessage());
            
        }
    }
    
    
    public void excluir(int id){
        
        try{
            
            String sql = "DELETE FROM professores WHERE id = ?;";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            
            
        }catch(SQLException ex){
            System.out.println("Erro ao excluir os dados do professor"+ex.getMessage());
            
        }
        
        
    }
    
    public List<Professor> getProfessores(){
       
       String sql = "SELECT * FROM professores";
       
       try{
           
           PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
           
           ResultSet rs = stmt.executeQuery();
           List<Professor> listaProfessores = new ArrayList();
           
           while (rs.next()){
               Professor p = new Professor();
               p.setId(rs.getInt("id"));
               p.setNome(rs.getString("nome"));
               p.setIdade(rs.getInt("idade"));
               p.setDisciplina(rs.getString("disciplina"));
               listaProfessores.add(p);
           }
           return listaProfessores;
           
       }catch(SQLException ex){
           System.out.println("Erro ao consultar todos os alunos: " + ex.getMessage());
           return null;
       }
       
   }
    
    public List<Professor> getProfessoresNome(String nome){
       
       String sql = "SELECT * FROM professores WHERE nome LIKE ?";
       
       try{
           
           PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
           
           stmt.setString(1,"%"+nome +"%");
           ResultSet rs = stmt.executeQuery();
           List<Professor> listaProfessores = new ArrayList();
           
           while (rs.next()){
               Professor p = new Professor();
               p.setId(rs.getInt("id"));
               p.setNome(rs.getString("nome"));
               p.setIdade(rs.getInt("idade"));
               p.setDisciplina(rs.getString("disciplina"));
               listaProfessores.add(p);
           }
           return listaProfessores;
           
       }catch(SQLException ex){
           System.out.println("Erro ao consultar todos os alunos: " + ex.getMessage());
           return null;
       }
       
   }
}
