/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forms;

import Models.Fornecedor;
import Models.Funcionario;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oseas
 */
public class FormListarFuncionario {
     private static DefaultTableModel tabela;

    public static DefaultTableModel getTabela() {
        return tabela;
    }

    public static void setTabela(JTable tabela) {
        FormListarFuncionario.tabela = (DefaultTableModel) tabela.getModel();
    }
    
    public static void atualizar(){
        FormListarFuncionario.tabela.getDataVector().removeAllElements();
        for (Funcionario forn : Funcionario.getFuncionarios()) {
            String data[] = {forn.getIdfuncionario()+"",forn.getFunIdpessoa().getPesNome(),forn.getFunIdcargo().getCargDescricao()};
            FormListarFuncionario.tabela.addRow(data);   
        }
    }
}
