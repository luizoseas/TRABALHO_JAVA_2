/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forms;

import Models.Cliente;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oseas
 */
public class FormListarCliente {
    
    private static DefaultTableModel tabela;

    public static DefaultTableModel getTabela() {
        return tabela;
    }

    public static void setTabela(JTable tabela) {
        FormListarCliente.tabela = (DefaultTableModel) tabela.getModel();
    }
    
    public static void atualizar(){
        FormListarCliente.tabela.getDataVector().removeAllElements();
        for (Cliente cli : Cliente.getCliente()) {
            String data[] = {cli.getIdcliente()+"",cli.getCliIdpessoa().getPesNome(),cli.getCliIdpessoa().getPesCpf()};
            FormListarCliente.tabela.addRow(data);   
        }
    }
    

}
