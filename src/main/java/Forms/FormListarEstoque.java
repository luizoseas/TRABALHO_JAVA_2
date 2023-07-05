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
public class FormListarEstoque {
    private static DefaultTableModel tabela;
    private static Produto produto;

    public static Produto getProduto() {
        return produto;
    }

    public static void setProduto(Produto produto) {
        FormListarEstoque.produto = produto;
    }

    public static DefaultTableModel getTabela() {
        return tabela;
    }

    public static void setTabela(JTable tabela) {
        FormListarEstoque.tabela = (DefaultTableModel) tabela.getModel();
    }
    
    public static void atualizar(){
        FormListarEstoque.tabela.getDataVector().removeAllElements();
        for (Estoque est : FormListarEstoque.produto.getEstoqueList()) {
            String data[] = {est.getEstIdnota()+"","R$ "+est.getEstPreco(),est.getEstQuantidade()+" unid."};
            FormListarEstoque.tabela.addRow(data);   
        }
    }
}
