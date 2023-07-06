/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forms;

import Models.Estoque;
import Models.Produto;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oseas
 */
public class FormListarEstoqueDisponivel {
     private static DefaultTableModel tabela;
    private static Produto produto;

    public static DefaultTableModel getTabela() {
        return tabela;
    }

    public static void setTabela(JTable tabela) {
        FormListarEstoqueDisponivel.tabela = (DefaultTableModel) tabela.getModel();
    }
    
    public static void atualizar(){
        FormListarEstoqueDisponivel.tabela.getDataVector().removeAllElements();
        for (Estoque est : Estoque.getEstoques()) {
            if(est.getEstQuantidade() > 0){
                String data[] = {
                    est.getIdestoque()+"",
                    est.getEstIdproduto().getProdNome(),
                    est.getEstQuantidade()+" unid.",
                    "R$ "+est.getEstPreco(),};
                FormListarEstoqueDisponivel.tabela.addRow(data);   
            }
        }
    }
}
