/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import br.dev.lomm.automecanicapoo.database.Veiculo;

/**
 *
 * @author roger
 */
public class ControllerVeiculo {

    private Veiculo veiculo;
    
    public void setVeiculo(Veiculo veiculo)
    {
        this.veiculo = veiculo;
    }

    public boolean validarDados() throws Exception{
        if(!(pessoa.getPesNome() instanceof String) || 
                pessoa.getPesNome().length() <= 3){
            throw new Exception("Nome inválido deve ter mais de 3 caracteres.");
        }
        if(!(pessoa.getPesCpf() instanceof String) ||
                pessoa.getPesCpf().length() != 11 ||
                !pessoa.getPesCpf().matches("\\d+")){
            throw new Exception("CPF Inválido.");
        }
        if(!(pessoa.getPesDatanasc() instanceof Date) ||
                pessoa.getPesDatanasc().toString().isEmpty()){
            throw new Exception("Data inválida.");
        }
        if(!(pessoa.getPesEmail() instanceof String) || !pessoa.getPesEmail().contains("@")){
            throw new Exception("E-mail inválido.");
        }
        return true;
    }
    
}
