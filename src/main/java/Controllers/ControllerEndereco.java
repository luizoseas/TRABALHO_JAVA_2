/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import Interfaces.FalhaException;
import Interfaces.InterfaceController;
import br.dev.lomm.automecanicapoo.database.Bairro;
import br.dev.lomm.automecanicapoo.database.Cidade;
import br.dev.lomm.automecanicapoo.database.Endereco;
import br.dev.lomm.automecanicapoo.database.Logradouro;

/**
 *
 * @author roger
 */
public class ControllerEndereco implements InterfaceController {

    private Endereco endereco;

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    @Override
    public boolean validarDados() throws Exception {
        if(!(endereco.getEndNumero() instanceof String) ||
                endereco.getEndNumero().isEmpty() ||
                endereco.getEndNumero().length() <= 1){
            throw new FalhaException(EnumMensagem.MSG003.getDescricao());
        }
        if(!(endereco.getEndCep() instanceof String) ||
                endereco.getEndCep().isEmpty() ||
                endereco.getEndCep().length() != 8 ||
                !endereco.getEndCep().matches("\\d+")){
            throw new FalhaException(EnumMensagem.MSG004.getDescricao());
        }
        if(!(endereco.getEndIdcidade() instanceof Cidade) ||
                endereco.getEndIdcidade().getCidDescricao().isEmpty()){
            throw new FalhaException(EnumMensagem.MSG005.getDescricao());
        }
        if(!(endereco.getEndIdbairro() instanceof Bairro) || 
                endereco.getEndIdbairro().getBaiDescricao().isEmpty()){
            throw new FalhaException(EnumMensagem.MSG006.getDescricao());
        }
        if(!(endereco.getEndIdlogradouro() instanceof Logradouro) ||
                endereco.getEndIdlogradouro().getLogDescricao().isEmpty()){
            throw new FalhaException(EnumMensagem.MSG007.getDescricao());
        }
        
        return true;
    }
}
