/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import beans.Pessoa;
import dao.PessoaDAO;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laboratorio
 */
public class ThreadServer extends Thread {
    private Socket clienteSocket;
    
    public ThreadServer(Socket clienteSocket) {
        this.clienteSocket = clienteSocket;
    }
    
    @Override
    public void run() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(clienteSocket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(clienteSocket.getInputStream());
            
            Pessoa pessoa = (Pessoa) in.readObject();
            PessoaDAO pDAO = new PessoaDAO();
            pDAO.inserir(pessoa);
            out.writeObject(pessoa);
            
 // Parte de Consulta           
//            int id = in.readInt();
//            System.out.println("ID recebido: "+ id);
//            
//            PessoaDAO pDAO = new PessoaDAO();
//            Pessoa p = pDAO.getPessoa(id);
//            
//            out.writeObject(p);

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Erro ao lidar com o cliente (cadastro): " + ex.getMessage());
        } finally {
            try {
                clienteSocket.close();
            } catch (IOException e) {
                System.out.println("Erro ao fechar o socket (cadastro): " + e.getMessage());
            }
        }
    }
}
        
