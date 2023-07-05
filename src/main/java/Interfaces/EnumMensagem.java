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
    
    MSG001("Nome inválido deve ter mais de 3 caracteres.");
    
    private String descricao;
    
    EnumMensagem(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
}
