/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import Interfaces.InterfaceController;
import br.dev.lomm.automecanicapoo.database.Conserto;
import br.dev.lomm.automecanicapoo.database.Endereco;

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
        if(!(endereco.getEndNumero() instanceof String) || endereco.getEndNumero().length() < 0){
            throw new Exception(EnumMensagem.MSG003.getDescricao());
        }
        if(!(endereco.getEndCep() instanceof String) ||
                endereco.getEndCep().length() != 8 ||
                !endereco.getEndCep().matches("\\d+")){
            throw new Exception(EnumMensagem.MSG004.getDescricao());
        }
        return true;
    }
}
