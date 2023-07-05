/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forms;

import Models.Fornecedor;
import Models.Produto;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oseas
 */
public class FormListarFornecedor {
    private static DefaultTableModel tabela;

    public static DefaultTableModel getTabela() {
        return tabela;
    }

    public static void setTabela(JTable tabela) {
        FormListarFornecedor.tabela = (DefaultTableModel) tabela.getModel();
    }
    
    public static void atualizar(){
        FormListarFornecedor.tabela.getDataVector().removeAllElements();
        for (Fornecedor forn : Fornecedor.getFornecedores()) {
            String data[] = {forn.getIdfornecedor()+"",forn.getForNomefantasia(),forn.getForCnpj()};
            FormListarFornecedor.tabela.addRow(data);   
        }
    }
}
