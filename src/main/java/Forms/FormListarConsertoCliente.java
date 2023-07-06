/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forms;

import Models.Cliente;
import Models.Conserto;
import Models.Veiculo;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oseas
 */
public class FormListarConsertoCliente {
    private static DefaultTableModel tabela;
    private static Cliente cliente;

    public static Cliente getCliente() {
        return cliente;
    }

    public static void setCliente(Cliente cliente) {
        FormListarConsertoCliente.cliente = cliente;
    }

    public static DefaultTableModel getTabela() {
        return tabela;
    }

    public static void setTabela(JTable tabela) {
        FormListarConsertoCliente.tabela = (DefaultTableModel) tabela.getModel();
    }
    
    public static void atualizar(){
        FormListarConsertoCliente.tabela.getDataVector().removeAllElements();
        for (Veiculo veiculo : cliente.getVeiculoList()) {
            for (Conserto conserto : veiculo.getConsertoList()) {
                String data[] = {conserto.getIdconserto()+"",conserto.getConsIdstatus().getStatDescricao(),veiculo.getVeiPlaca(),conserto.getConsDatainicio().toString()};
                FormListarConsertoCliente.tabela.addRow(data);          
            }

        }
    }
    
}
