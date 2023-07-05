/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Interfaces;

/**
 *
 * @author roger
 */
public enum EnumMensagem {
    
    MSG001("Nome inválido, deve ter mais de 3 caracteres.");
    MSG002("Descrição inválida, deve ter mais de 3 ter caracteres.");

    MSG003("Número invalido, deve ser maior que 0");



    private String descricao;
    
    EnumMensagem(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
}
