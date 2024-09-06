/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuario;

/**
 *
 * @author laboratorio
 */
public class Professor extends Usuario {
    private String matricula;
    private String areaFormacao;
    private String alocacao;

    Professor(String text, String sexo, String text0, String text1, String text2, String identificador, String text3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getAreaFormacao() { return areaFormacao; }
    public void setAreaFormacao(String areaFormacao) { this.areaFormacao = areaFormacao; }

    public String getAlocacao() { return alocacao; }
    public void setAlocacao(String alocacao) { this.alocacao = alocacao; }

    @Override
    public void executaAcao() {
        System.out.println("O professor " + getNomeCompleto() + " foi inserido.");
    }
}