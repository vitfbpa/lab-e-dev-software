/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula30;

/**
 *
 * @author laboratorio
 */
public class Pessoa {
    public String nome;
    public char sexo;
    public String idioma;
    
    public Pessoa(String nome, char sexo, String idioma) {
        this.nome = nome;
        this.sexo = sexo;
        this.idioma = idioma;
    }
    
    public Object[] obterDados() {
        return new Object[] {nome, sexo, idioma};
    }
}