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
import javax.swing.JTextPane;

/**
 *
 * @author roger
 */
public class ControllerEndereco implements InterfaceController {

    private Endereco endereco;

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Endereco getEndereco(){
        return this.endereco;
    }
    
    public void setCampos(JTextPane logradouro,JTextPane cep, JTextPane bairro, JTextPane cidade) throws FalhaException{
        endereco = new Endereco();
        endereco.setEndCep(cep.getText());
        endereco.setEndIdbairro(Bairro.buscarOuInserirBairro(bairro.getText()));
        endereco.setEndIdcidade(Cidade.buscarOuInserirCidade(cidade.getText()));
        endereco.setEndIdlogradouro(Logradouro.buscarOuInserirLogradouro(logradouro.getText()));
    }

    public boolean validarDados() throws FalhaException {
//        if(!(endereco.getEndNumero() instanceof String) ||
//                endereco.getEndNumero().isEmpty() ||
//                endereco.getEndNumero().length() <= 1){
//            throw new FalhaException(EnumMensagem.MSG003.getDescricao());
//        }
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
