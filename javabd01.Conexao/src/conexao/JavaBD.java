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

    public static void main(String[] args) throws IOException {

        int porta = 12345;

        try (ServerSocket servidorSocket = new ServerSocket(porta)){

            System.out.println("Servidor aguardando conexões na porta " + porta);

            while (true) { //Loop infinito porque quero sempre estar recebendo conexões
                try{

                    Socket clienteSocket = servidorSocket.accept(); //Aceito todas as conexões e solicitações do cliente automáticamente
                    System.out.println("Conexão aceita de " + clienteSocket.getInetAddress()); //Após aceitar, printo o IP do Cliente

                    Thread threadCliente = new ThreadServer(clienteSocket);
                    threadCliente.start();



                } catch (IOException ex){
                    System.out.println("Erro ao aceitar conexão do cliente");
                }
            }
        }catch(IOException ex){
            System.out.println("Erro ao criar ServerSocket");
        }
      }
    }
