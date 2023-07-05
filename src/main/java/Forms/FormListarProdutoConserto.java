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
public class FormListarProdutoConserto {
    private static DefaultTableModel tabela;
    private static Cliente cliente;

    public static Cliente getCliente() {
        return cliente;
    }

    public static void setCliente(Cliente cliente) {
        FormListarProdutoConserto.cliente = cliente;
    }

    public static DefaultTableModel getTabela() {
        return tabela;
    }

    public static void setTabela(JTable tabela) {
        FormListarProdutoConserto.tabela = (DefaultTableModel) tabela.getModel();
    }
    
    public static void atualizar(){
        FormListarProdutoConserto.tabela.getDataVector().removeAllElements();
        for (Veiculo vei : FormListarProdutoConserto.getCliente().getVeiculoList()) {
            for (Conserto con : vei.getConsertoList()) {
                String data[] = {con.getIdconserto()+"",con.getConsIdstatus().getStatDescricao(),vei.getIdveiculo()+"",con.getConsDatainicio().toString()};
                FormListarProdutoConserto.tabela.addRow(data);   
            }
        }
    }
}
