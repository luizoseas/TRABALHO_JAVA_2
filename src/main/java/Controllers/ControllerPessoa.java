/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import Interfaces.FalhaException;
import Interfaces.InterfaceController;
import Models.Pessoa;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.JTextPane;

/**
 *
 * @author roger
 */
public class ControllerPessoa implements InterfaceController {
    
    private Pessoa pessoa;
    
    public void setPessoa(Pessoa pessoa){
           this.pessoa = pessoa;
    }
    
    public Pessoa getPessoa(){
        return this.pessoa;
    }
    public void setCampos(
        JTextPane nome,
        JTextPane cpf, 
        JDateChooser dataNascimento,
        JTextPane email
        ){
        this.pessoa = new Pessoa();
        this.pessoa.setPesCpf(cpf.getText());
        this.pessoa.setPesDatanasc(dataNascimento.getDate());
        this.pessoa.setPesEmail(email.getText());
        this.pessoa.setPesNome(nome.getText());
    }
    
    public boolean validarDados() throws FalhaException{
        if(!(pessoa.getPesNome() instanceof String) || 
                pessoa.getPesNome().length() <= 3){
            throw new FalhaException(EnumMensagem.MSG001.getDescricao());
        }
        if(!(pessoa.getPesCpf() instanceof String) ||
                pessoa.getPesCpf().length() != 11 ||
                !pessoa.getPesCpf().matches("\\d+")){
            throw new FalhaException("CPF Inválido.");
        }
        if(!(pessoa.getPesDatanasc() instanceof Date) ||
                pessoa.getPesDatanasc().toString().isEmpty()){
            throw new FalhaException("Data inválida.");
        }
        if(!(pessoa.getPesEmail() instanceof String) || !pessoa.getPesEmail().contains("@")){
            throw new FalhaException("E-mail inválido.");
        }
        ControllerEndereco controllerEndereco = new ControllerEndereco();
        controllerEndereco.setEndereco(this.getPessoa().getPesIdendereco());
        controllerEndereco.validarDados();
        return true;
    }
    
    
}
