/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoveiculos;

/**
 *
 * @author laboratorio
 */
public class Moto extends Veiculo {
    private String cilindradas;
    private String tipoTransmissao;

    public Moto(char tipo, String modelo, String marca, String anoFabricacao, String tipoCombustivel, String placa) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.tipoCombustivel = tipoCombustivel;
        this.placa = placa;
    }
    
    public String getCilindradas() { return cilindradas; }
    public void setCilindradas(String cilindradas) { this.cilindradas = cilindradas; }

    public String getTipoTransmissao() { return tipoTransmissao; }
    public void setTipoTransmissao(String tipoTransmissao) { this.tipoTransmissao = tipoTransmissao; }
    
    @Override
    public void calculaImposto() {
        System.out.println("Imposto para moto: R$5000,00 + adicional por cilindrada!");
    }
    
    public Object[] obterDados() {
        return new Object[] {tipo, modelo, marca, anoFabricacao, tipoCombustivel, placa};
    }
}
