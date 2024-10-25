/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mercado.conexao.Conexao;


/**
 *
 * @author laboratorio
 */

public class ProdutoDAO {
    private Conexao conexao;
    private Connection conn;
    
    public ProdutoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir (Produto produto) {
        String sql = "INSERT INTO produtos (nome, preco, quantidade, categoria_id) VALUES (?,?,?,?)";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setInt(1, produto.getPreco());
            stmt.setInt(1, produto.getQuantidade());
            stmt.setInt(1, produto.getCategoria_id());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir pessoa:" +ex.getMessage());
        }
    }
    
    public Produto getProdutos(int id) {
        String sql = "SELECT * FROM produtos WHERE id = ?";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            Produto p = new Produto();
            rs.first();
            p.setCategoria_id(id);
            p.setNome(rs.getString("nome"));
            p.setPreco(rs.getInt("preco"));
            p.setQuantidade(rs.getInt("quantidade"));
            return p;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar produto: " +ex.getMessage());
            return null;
        }
    }
    
    public void editar(Produto produto) {
        try {
            String sql = "UPDATE produtos set nome=?, preco=?, quantidade=?, categoria_id=? WHERE id=?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setInt(4, produto.getCategoria_id());
            stmt.execute();
        } catch(SQLException ex) {
            System.out.println("Erro ao atualizar produto: "+ex.getMessage());
        }
    }
    
    public void excluir(int id) {
        try {
            String sql = "delete from produtos WHERE id=?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch(SQLException ex) {
            System.out.println("Erro ao excluir produto: "+ex.getMessage());
        }
    }
    
    public List<Produto> getProdutos() {
        String sql = "SELECT * FROM protudos";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = stmt.executeQuery();
            List<Produto> listaProdutos = new ArrayList();
            
            while (rs.next()) {
                Produto p = new Produto();
                p.setCategoria_id(rs.getInt("categoria_id"));
                p.setNome(rs.getString("nome"));
                p.setPreco(rs.getInt("preco"));
                p.setQuantidade(rs.getInt("quantidade"));
                listaProdutos.add(p);
            }
            return listaProdutos;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar todas os produtos: "+ex.getMessage());
            return null;
        }
    }
    
    public List<Produto> getProdutosNome(String nome,int preco, int quantidade) {
        String sql = "SELECT * FROM produtos WHERE nome LIKE ? and preco LIKE ? and quantidade LIKE ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            stmt.setString(1,"%"+nome+"%");
            stmt.setString(2,"%"+preco+"%");
            stmt.setString(3,"%"+quantidade+"%");
            ResultSet rs = stmt.executeQuery();
            List<Produto> listaProdutos = new ArrayList();
            
            while (rs.next()) {
                Produto p = new Produto();
                p.setCategoria_id(rs.getInt("categoria_id"));
                p.setNome(rs.getString("nome"));
                p.setPreco(rs.getInt("preco"));
                p.setQuantidade(rs.getInt("quantidade"));
                listaProdutos.add(p);
            }
            return listaProdutos;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar todas os produtos: "+ex.getMessage());
            return null;
        }
    }
}
