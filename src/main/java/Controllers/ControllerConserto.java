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
    ){
        if(!(conserto instanceof Conserto)){
            conserto = new Conserto();
        }
        conserto.setConsIdveiculo(DAO.getInstance().find(Veiculo.class, Integer.parseInt((String) veic.getItemAt(veic.getSelectedIndex()))));
        conserto.setConsIdstatus(DAO.getInstance().find(Status.class, Integer.parseInt((String) sta.getItemAt(sta.getSelectedIndex()))));
        conserto.setConsDescricao(descricao.getText());
    }

    public void preencherForm(
        JComboBox veic,
        JComboBox cliente,
        JComboBox status,
        JTextPane descricao,
        JTextPane total
    ) {
        veic.setSelectedItem(conserto.getConsIdveiculo());
        cliente.setSelectedItem(conserto.getConsIdveiculo().getVeiIdcliente());
        status.setSelectedItem(conserto.getConsIdstatus());
        descricao.setText(conserto.getConsDescricao());
        double valortotal = 0;
        for (Pecasconserto pecaconcerto : conserto.getPecasconsertoList()) {
            valortotal += pecaconcerto.getEstoque().getEstPreco();
        }
        total.setText("R$ "+valortotal);
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
