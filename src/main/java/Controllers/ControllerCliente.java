/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.InterfaceController;
import br.dev.lomm.automecanicapoo.database.Cliente;
import br.dev.lomm.automecanicapoo.database.Pessoa;

/**
 *
 * @author roger
 */
public class ControllerCliente implements InterfaceController {
    
    private Cliente cliente;
    
    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }
    
    public boolean validarDados() throws Exception{
        if(!(this.cliente.getCliIdpessoa() instanceof Pessoa)){
            new Exception("Pessoa não informada.");
        }
        ControllerPessoa controllerPessoa = new ControllerPessoa();
        controllerPessoa.setPessoa(this.cliente.getCliIdpessoa());
        controllerPessoa.validarDados();
        return true;
    }
    
}
