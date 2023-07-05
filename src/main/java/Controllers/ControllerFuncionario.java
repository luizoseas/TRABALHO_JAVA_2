/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import Interfaces.FalhaException;
import Interfaces.InterfaceController;
import br.dev.lomm.automecanicapoo.database.Funcionario;
import br.dev.lomm.automecanicapoo.database.Pessoa;

/**
 *
 * @author roger
 */
public class ControllerFuncionario implements InterfaceController {

    private Funcionario funcionario;
    
    public void setFuncionario(Funcionario funcionario)
    {
        this.funcionario = funcionario;
    }
    
    public boolean validarDados() throws Exception{
        if(!(this.funcionario.getCliIdpessoa() instanceof Pessoa)){
            throw new FalhaException(EnumMensagem.MSG012.getDescricao());
        }
        ControllerPessoa controllerPessoa = new ControllerPessoa();
        controllerPessoa.setPessoa(this.funcionario.getCliIdpessoa());
        controllerPessoa.validarDados();
        return true;
    }   

    
}
