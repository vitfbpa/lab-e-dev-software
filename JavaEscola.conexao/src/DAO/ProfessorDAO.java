package DAO;

import beans.Professor;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProfessorDAO {

    private Conexao conexao;

    private Connection conn;

    public ProfessorDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void inserir(Professor professor){

        String sql = "INSERT INTO professores (nome, idade, disciplina) VALUES (?,?,?);";


        try {


            PreparedStatement stmt = this.conn.prepareStatement(sql);



            stmt.setString(1, professor.getNome()); //O primeiro parâmetro 1 é substituído por pessoa.getNome().
            stmt.setInt(2, professor.getIdade()); //O segundo parâmetro 2 é substituído por pessoa.getSexo().
            stmt.setString(3, professor.getDisciplina()); //O terceiro parâmetro 3 é substituído por pessoa.getIdioma().

            stmt.execute(); //Isso executa o comando SQL, inserindo o registro no banco de dados

        }catch(SQLException ex){
            System.out.println("Erro ao inserir pessoa"+ex.getMessage());
        }
    }
}