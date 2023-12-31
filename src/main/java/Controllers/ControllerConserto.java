/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import Interfaces.FalhaException;
import Interfaces.InterfaceController;
import Models.Cargo;
import Models.Cliente;
import Models.Conserto;
import Models.Pecasconserto;
import Models.Produto;
import Models.Status;
import Models.Veiculo;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTextPane;


/**
 *
 * @author roger
 */
public class ControllerConserto implements InterfaceController {

    private Conserto conserto;
    
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setConserto(Conserto conserto){
        this.conserto = conserto;
    }
    
    public Conserto getConserto(){
        return this.conserto;
    }
    
    public void setCampos(
        JComboBox veic,
        JComboBox sta,
        JTextPane descricao
    ) throws FalhaException{
        if(!(conserto instanceof Conserto)){
            conserto = new Conserto();
        }
        conserto.setConsIdveiculo(Veiculo.buscarVeiculo((String) veic.getItemAt(veic.getSelectedIndex())));
        conserto.setConsIdstatus(Status.buscarStatus((String) sta.getItemAt(sta.getSelectedIndex())));
        conserto.setConsDescricao(descricao.getText());
        conserto.setConsIdfuncionario(ControllerFuncionarioLogado.getFuncionario());
        conserto.setConsDatainicio(new Date());
    }
    
        public void setCampos(
        JComboBox sta,
        JTextPane descricao
    ) throws FalhaException{
        if(!(conserto instanceof Conserto)){
            conserto = new Conserto();
        }
        conserto.setConsIdstatus(Status.buscarStatus((String) sta.getItemAt(sta.getSelectedIndex())));
        conserto.setConsDescricao(descricao.getText());
        conserto.setConsIdfuncionario(ControllerFuncionarioLogado.getFuncionario());
        conserto.setConsDatainicio(new Date());
    }

    public void preencherForm(
        JTextPane veic,
        JTextPane cliente,
        JTextPane status,
        JTextPane descricao,
        JTextPane total
    ) {
        veic.setText(conserto.getConsIdveiculo().getVeiPlaca());
        cliente.setText(conserto.getConsIdveiculo().getVeiIdcliente().getCliIdpessoa().getPesNome());
        status.setText(conserto.getConsIdstatus().getStatDescricao());
        descricao.setText(conserto.getConsDescricao());
        double valortotal = 0;
        for (Pecasconserto pecaconcerto : conserto.getPecasconsertoList()) {
            valortotal += pecaconcerto.getEstoque().getEstPreco();
        }
        total.setText("R$ "+valortotal);
    }
    
    public void preencherForm(
        JTextPane veic,
        JTextPane cliente,
        JTextPane status,
        JTextPane descricao
    ) {
        veic.setText(conserto.getConsIdveiculo().getVeiPlaca());
        cliente.setText(conserto.getConsIdveiculo().getVeiIdcliente().getCliIdpessoa().getPesNome());
        status.setText(conserto.getConsIdstatus().getStatDescricao());
        descricao.setText(conserto.getConsDescricao());
    }

    

    @Override
    public boolean validarDados() throws FalhaException {
        if (!(conserto.getConsDescricao() instanceof String) ||
                conserto.getConsDescricao().length() <= 1 ||
                conserto.getConsDescricao().isEmpty()){
            throw new FalhaException(EnumMensagem.MSG002.getDescricao());
        }

        return true;
    }
}
