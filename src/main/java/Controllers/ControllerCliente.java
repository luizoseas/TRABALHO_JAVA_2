/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import br.dev.lomm.automecanicapoo.database.Cliente;
import br.dev.lomm.automecanicapoo.database.Pessoa;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextPane;

/**
 *
 * @author roger
 */
public class ControllerCliente {
    
    private Cliente cliente;
    
    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }
    
    public void getCliente(){
        return this.cliente;
    }
    
    public void setCampos(
            JTextPane nome,
            JTextPane cpf, 
            JDateChooser dataNascimento,
            JTextPane email,
            JTextPane logradouro,
            JTextPane cep,
            JTextPane bairro,
            JTextPane cidade
            ){
        
        ControllerEndereco controllerEndereco = new ControllerEndereco();
        controllerEndereco.setCampos(logradouro,cep,bairro,cidade);
        controllerEndereco.validarDados();
        
        ControllerPessoa controllerPessoa = new ControllerPessoa();
        controllerPessoa.setCampos(nome,cpf,dataNascimento,email);
        controllerPessoa.getPessoa().setPesIdendereco(controllerEndereco.getEndereco());
        controllerPessoa.validarDados();
        
        
        cliente = new Cliente();
        cliente.setCliIdpessoa(controllerPessoa.getPessoa());
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
