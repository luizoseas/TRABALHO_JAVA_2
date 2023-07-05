/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forms;

import Models.Produto;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oseas
 */
public class FormListarProduto {
    private static DefaultTableModel tabela;

    public static DefaultTableModel getTabela() {
        return tabela;
    }

    public static void setTabela(JTable tabela) {
        FormListarProduto.tabela = (DefaultTableModel) tabela.getModel();
    }
    
    public static void atualizar(){
        FormListarProduto.tabela.getDataVector().removeAllElements();
        for (Produto prod : Produto.getProdutos()) {
            String data[] = {prod.getIdproduto()+"",prod.getProdNome(),prod.getProdValidade().toString()};
            FormListarProduto.tabela.addRow(data);   
        }
    }
}
