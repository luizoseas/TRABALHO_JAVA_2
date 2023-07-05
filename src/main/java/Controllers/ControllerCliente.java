/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import Interfaces.FalhaException;
import Interfaces.InterfaceController;
import br.dev.lomm.automecanicapoo.database.Cliente;
import br.dev.lomm.automecanicapoo.database.Pessoa;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextPane;

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
    
    public Cliente getCliente(){
        return this.cliente;
    }

    public void preencherForm(
            JTextPane nome,
            JTextPane cpf,
            JDateChooser dataNascimento,
            JTextPane email,
            JTextPane logradouro,
            JTextPane cep,
            JTextPane bairro,
            JTextPane cidade){
        nome.setText(cliente.getCliIdpessoa().getPesNome());
        cpf.setText(cliente.getCliIdpessoa().getPesCpf());
        dataNascimento.setDate(cliente.getCliIdpessoa().getPesDatanasc());
        email.setText(cliente.getCliIdpessoa().getPesEmail());
        logradouro.setText(cliente.getCliIdpessoa().getPesIdendereco().getEndIdlogradouro().getLogDescricao());
        cep.setText(cliente.getCliIdpessoa().getPesIdendereco().getEndCep());
        bairro.setText(cliente.getCliIdpessoa().getPesIdendereco().getEndIdbairro().getBaiDescricao());
        cidade.setText(cliente.getCliIdpessoa().getPesIdendereco().getEndIdcidade().getCidDescricao());
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

        ControllerPessoa controllerPessoa = new ControllerPessoa();
        controllerPessoa.setCampos(nome,cpf,dataNascimento,email);
        controllerPessoa.getPessoa().setPesIdendereco(controllerEndereco.getEndereco());

        if(!(cliente instanceof Cliente)){
            cliente = new Cliente();
        }
        cliente.setCliIdpessoa(controllerPessoa.getPessoa());
    }

    public boolean validarDados() throws FalhaException{
        if(!(this.cliente.getCliIdpessoa() instanceof Pessoa)){
            throw new FalhaException(EnumMensagem.MSG012.getDescricao());
        }
        ControllerPessoa controllerPessoa = new ControllerPessoa();
        controllerPessoa.setPessoa(this.cliente.getCliIdpessoa());
        controllerPessoa.validarDados();
        return true;
    }
    
}
