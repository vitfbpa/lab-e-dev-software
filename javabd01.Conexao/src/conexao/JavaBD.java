/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import beans.Pessoa;
import dao.PessoaDAO;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.ObjectInputStream;

/**
 *
 * @author laboratorio
 */
public class JavaBD {

    public static void main(String[] args) {
        int porta = 12345;

        try ( ServerSocket servidorSocket = new ServerSocket(porta)) {
            System.out.println("Servidor aguardando conexões na porta " + porta);

            while (true) {
                try {
                    Socket clienteSocket = servidorSocket.accept();
                    System.out.println("Conexão aceita  de " + clienteSocket.getInetAddress());
                    // ObjectOutputStream out = new ObjectOutputStream(clienteSocket.getOutputStream());
                    // ObjectInputStream in = new ObjectInputStream(clienteSocket.getInputStream());

                    //int id = in.readInt();
                    //System.out.println("ID recebido: " + id);

                    //PessoaDAO pDAO = new PessoaDAO();

                    //Pessoa p = pDAO.getPessoa(id);
                    //System.out.println(p.getNome());

                    //out.writeObject(p);
                    
                    // Criar uma nova thread para lidar com o cliente
                    Thread threadCliente = new ThreadServer(clienteSocket);
                    threadCliente.start();
                    
                } catch (IOException ex) {
                    System.out.println("Erro ao aceitar conexão do cliente");
                }
            }
        } catch (IOException ex) {
            System.out.println("Erro ao criar  o ServerSocket");
        }
    }
}
