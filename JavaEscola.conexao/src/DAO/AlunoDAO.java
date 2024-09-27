package DAO;

import beans.Aluno;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlunoDAO {

    private Conexao conexao;

    private Connection conn;

    public AlunoDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void inserir(Aluno aluno){

        String sql = "INSERT INTO alunos (nome, idade, curso) VALUES (?,?,?);";


        try {


            PreparedStatement stmt = this.conn.prepareStatement(sql);


            stmt.setString(1, aluno.getNome()); //O primeiro parâmetro 1 é substituído por pessoa.getNome().
            stmt.setInt(2, aluno.getIdade()); //O segundo parâmetro 2 é substituído por pessoa.getSexo().
            stmt.setString(3, aluno.getCurso()); //O terceiro parâmetro 3 é substituído por pessoa.getIdioma().

            stmt.execute(); //Isso executa o comando SQL, inserindo o registro no banco de dados

        }catch(SQLException ex){
            System.out.println("Erro ao inserir pessoa"+ex.getMessage());
        }

    }
}