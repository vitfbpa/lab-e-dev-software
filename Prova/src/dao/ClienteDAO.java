/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Cliente;
import java.sql.SQLException;
import java.sql.Connection;
import Conexao.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class ClienteDAO {
    private Conexao conexao;
    private Connection conn;
    
    public ClienteDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir (Cliente cliente) {
        String sql = "INSERT INTO clientes (nome,cpf,endereco,telefone) VALUES (?,?,?,?)";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1,cliente.getNome());
            stmt.setString(2,cliente.getCpf());
            stmt.setString(3,cliente.getEndereco());
            stmt.setString(4,cliente.getTelefone());
            
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir cliente:" +ex.getMessage());
        }
    }
    
    public Cliente getCliente(int id) {
        String sql = "SELECT * FROM clientes WHERE id = ?";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            Cliente c = new Cliente();
            rs.first();
            c.setId(id);
            c.setNome(rs.getString("nome"));
            c.setCpf(rs.getString("cpf"));
            c.setEndereco(rs.getString("endereco"));
            c.setTelefone(rs.getString("telefone"));
            return c;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar cliente: " +ex.getMessage());
            return null;
        }
    }
    
    public void editar(Cliente cliente) {
        try {
            String sql = "UPDATE clientes set nome=?, cpf=?, endereco=?, telefone=? WHERE id=?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEndereco());
            stmt.setString(4, cliente.getTelefone());
            stmt.setInt(5, cliente.getId());
            stmt.execute();
        } catch(SQLException ex) {
            System.out.println("Erro ao atualizar cliente: "+ex.getMessage());
        }
    }
    
    public void excluir(int id) {
        try {
            String sql = "delete from clientes WHERE id=?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch(SQLException ex) {
            System.out.println("Erro ao atualizar cliente: "+ex.getMessage());
        }
    }
    
    public List<Cliente> getClientes() {
        String sql = "SELECT * FROM clientes";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = stmt.executeQuery();
            List<Cliente> listaClientes = new ArrayList();
            
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setEndereco(rs.getString("endereco"));
                c.setTelefone(rs.getString("telefone"));
                listaClientes.add(c);
            }
            return listaClientes;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar todas os clientes: "+ex.getMessage());
            return null;
        }
    }
    
    public List<Cliente> getClientesNome(String nome) {
        String sql = "SELECT * FROM clientes WHERE nome LIKE ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            stmt.setString(1,"%"+nome+"%");
            ResultSet rs = stmt.executeQuery();
            List<Cliente> listaClientes = new ArrayList();
            
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setEndereco(rs.getString("endereco"));
                c.setTelefone(rs.getString("telefone"));
                listaClientes.add(c);
            }
            return listaClientes;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar todas os clientes: "+ex.getMessage());
            return null;
        }
    }
}
