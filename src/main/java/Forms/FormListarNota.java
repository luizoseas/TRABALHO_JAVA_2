/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forms;

import Models.Fornecedor;
import Models.Funcionario;
import Models.Nota;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oseas
 */
public class FormListarNota {
    private static DefaultTableModel tabela;
    private static Fornecedor fornecedor;

    public static Fornecedor getFornecedor() {
        return fornecedor;
    }

    public static void setFornecedor(Fornecedor fornecedor) {
        FormListarNota.fornecedor = fornecedor;
    }

    public static DefaultTableModel getTabela() {
        return tabela;
    }

    public static void setTabela(JTable tabela) {
        FormListarNota.tabela = (DefaultTableModel) tabela.getModel();
    }
    
    public static void atualizar(){
        FormListarNota.tabela.getDataVector().removeAllElements();
        for (Nota not : FormListarNota.getFornecedor().getNotaList()) {
            String data[] = {not.getIdnota()+"",not.getNotaDatacompra().toString(),not.getNotaDataentrada().toString()};
            FormListarNota.tabela.addRow(data);   
        }
    }
}
