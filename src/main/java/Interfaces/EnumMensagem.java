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
    
    MSG001("Nome inválido, deve ter mais de 1 caracteres."),
    MSG002("Descrição inválida, deve ter mais de 1 ter caracteres."),
    MSG003("Número invalido, deve ser maior que 0."),
    MSG004("CEP inválido."),
    MSG005("Cidade inválida"),
    MSG006("Bairro inválido."),
    MSG007("Logradouro inválido."),
    MSG008("Nome Fantasia inválida."),
    MSG009("Razão Social inválido."),
    MSG010("CNPJ inválido."),
    MSG011("Inscrição Estadual inválida."),
    MSG012("Pessoa não informada."),
    MSG013("Data inválida."),
    MSG014("O valor não pode ser negativo.");
    

    private String descricao;
    
    EnumMensagem(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
}
