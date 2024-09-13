/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoveiculos;

/**
 *
 * @author laboratorio
 */
public class Carro extends Veiculo {
    private String numPortas;
    private String capPortaMalas;

    public Carro(char tipo, String modelo, String marca, String anoFabricacao, String tipoCombustivel, String placa) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.tipoCombustivel = tipoCombustivel;
        this.placa = placa;
    }
    
    public String getNumPortas() { return numPortas; }
    public void setNumPortas(String numPortas) { this.numPortas = numPortas; }

    public String getCapPortaMalas() { return capPortaMalas; }
    public void setCapPortaMalas(String capPortaMalas) { this.capPortaMalas = capPortaMalas; }
    
    @Override
    public void calculaImposto() {
        System.out.println("Imposto para carro: R$10000,00 + adicional por porta!");
    }
    
    public Object[] obterDados() {
        return new Object[] {tipo, modelo, marca, anoFabricacao, tipoCombustivel, placa};
    }
}
