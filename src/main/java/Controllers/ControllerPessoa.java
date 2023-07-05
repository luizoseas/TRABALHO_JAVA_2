/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import br.dev.lomm.automecanicapoo.database.Cliente;
import br.dev.lomm.automecanicapoo.database.Pessoa;
import java.util.Date;

/**
 *
 * @author roger
 */
public class ControllerPessoa {
    
    private Pessoa pessoa;
    
    public void setPessoa(Pessoa pessoa){
           this.pessoa = pessoa;
    }
    
    public boolean validarDados() throws Exception{
        if(!(pessoa.getPesNome() instanceof String) || 
                pessoa.getPesNome().length() <= 3){
            throw new Exception(EnumMensagem.MSG001.getDescricao());
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
