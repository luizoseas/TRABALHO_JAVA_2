/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import Interfaces.FalhaException;
import Interfaces.InterfaceController;
import br.dev.lomm.automecanicapoo.database.Cargo;
import br.dev.lomm.automecanicapoo.database.Funcionario;
import br.dev.lomm.automecanicapoo.database.Pessoa;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

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
    
    public Funcionario getFuncionario(){
        return funcionario;
    }
    
     public void preencherForm(
            JTextPane nome,
            JTextPane cpf,
            JDateChooser dataNascimento,
            JTextPane email,
            JTextPane logradouro,
            JTextPane cep,
            JTextPane bairro,
            JTextPane cidade,
            JTextPane cargo) throws FalhaException{
        nome.setText(funcionario.getFunIdpessoa().getPesNome());
        cpf.setText(funcionario.getFunIdpessoa().getPesCpf());
        dataNascimento.setDate(funcionario.getFunIdpessoa().getPesDatanasc());
        email.setText(funcionario.getFunIdpessoa().getPesEmail());
        logradouro.setText(funcionario.getFunIdpessoa().getPesIdendereco().getEndIdlogradouro().getLogDescricao());
        cep.setText(funcionario.getFunIdpessoa().getPesIdendereco().getEndCep());
        bairro.setText(funcionario.getFunIdpessoa().getPesIdendereco().getEndIdbairro().getBaiDescricao());
        cidade.setText(funcionario.getFunIdpessoa().getPesIdendereco().getEndIdcidade().getCidDescricao());
        cargo.setText(funcionario.getFunIdcargo().getCargDescricao());
    }

     public void preencherForm(
            JTextPane nome,
            JTextPane cpf,
            JDateChooser dataNascimento,
            JTextPane email,
            JTextPane logradouro,
            JTextPane cep,
            JTextPane bairro,
            JTextPane cidade) throws FalhaException{
        nome.setText(funcionario.getFunIdpessoa().getPesNome());
        cpf.setText(funcionario.getFunIdpessoa().getPesCpf());
        dataNascimento.setDate(funcionario.getFunIdpessoa().getPesDatanasc());
        email.setText(funcionario.getFunIdpessoa().getPesEmail());
        logradouro.setText(funcionario.getFunIdpessoa().getPesIdendereco().getEndIdlogradouro().getLogDescricao());
        cep.setText(funcionario.getFunIdpessoa().getPesIdendereco().getEndCep());
        bairro.setText(funcionario.getFunIdpessoa().getPesIdendereco().getEndIdbairro().getBaiDescricao());
        cidade.setText(funcionario.getFunIdpessoa().getPesIdendereco().getEndIdcidade().getCidDescricao());
    }
    
        public void setCampos(
            JTextPane nome,
            JTextPane cpf,
            JDateChooser dataNascimento,
            JTextPane email,
            JTextPane logradouro,
            JTextPane cep,
            JTextPane bairro,
            JTextPane cidade,
            JComboBox cargo
            )  throws FalhaException{

        ControllerEndereco controllerEndereco = new ControllerEndereco();
        controllerEndereco.setCampos(logradouro,cep,bairro,cidade);

        ControllerPessoa controllerPessoa = new ControllerPessoa();
        controllerPessoa.setCampos(nome,cpf,dataNascimento,email);
        controllerPessoa.getPessoa().setPesIdendereco(controllerEndereco.getEndereco());

        if(!(funcionario instanceof Funcionario)){
            funcionario = new Funcionario();
        }
        funcionario.setFunIdpessoa(controllerPessoa.getPessoa());
        funcionario.setFunIdcargo(DAO.getInstance().find(Cargo.class, Integer.parseInt((String) cargo.getItemAt(cargo.getSelectedIndex()))));
    }
    
    
    public boolean validarDados() throws FalhaException {
        if(!(this.funcionario.getFunIdpessoa() instanceof Pessoa)){
            throw new FalhaException(EnumMensagem.MSG012.getDescricao());
        }
        ControllerPessoa controllerPessoa = new ControllerPessoa();
        controllerPessoa.setPessoa(this.funcionario.getFunIdpessoa());
        controllerPessoa.validarDados();
        return true;
    }   
    
    public void salvar() throws FalhaException{
        this.funcionario.getFunIdpessoa().getPesIdendereco().salvar();
        this.funcionario.getFunIdpessoa().salvar();
        this.funcionario.salvar();
    }
}
