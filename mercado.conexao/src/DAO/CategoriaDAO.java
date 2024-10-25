/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import mercado.conexao.Conexao;

/**
 *
 * @author laboratorio
 */
public class CategoriaDAO {
    private Conexao conexao;
    private Connection conn;
    
    public CategoriaDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }


public void inserir(Categoria categoria) {
    String sql = "INSERT INTO categorias (nome) VALUES (?);";

    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setString(1, categoria.getNomeCategoria());

        stmt.execute();
    } catch (SQLException ex) {
        System.out.println("Erro ao inserir categoria: " + ex.getMessage());
    }
  }
}
