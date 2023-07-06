/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forms;

import Models.Conserto;
import Models.Pecasconserto;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oseas
 */
public class FormListarProdutoConserto {
    private static DefaultTableModel tabela;
    private static Conserto conserto;

    public static Conserto getConserto() {
        return conserto;
    }

    public static void setConserto(Conserto conserto) {
        FormListarProdutoConserto.conserto = conserto;
    }

    public static DefaultTableModel getTabela() {
        return tabela;
    }

    public static void setTabela(JTable tabela) {
        FormListarProdutoConserto.tabela = (DefaultTableModel) tabela.getModel();
    }
    
    public static void atualizar(){
        FormListarProdutoConserto.tabela.getDataVector().removeAllElements();
        for (Pecasconserto con : conserto.getPecasconsertoList()) {
            String data[] = {con.getEstoque().getEstIdproduto().getProdNome(),con.getEstoque().getIdestoque()+"",con.getPcQuantidade()+""};
            FormListarProdutoConserto.tabela.addRow(data);   
        }
    }
}