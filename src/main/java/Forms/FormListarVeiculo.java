/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forms;

import Models.Cliente;
import Models.Fornecedor;
import Models.Nota;
import Models.Veiculo;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oseas
 */
public class FormListarVeiculo {
    private static DefaultTableModel tabela;
    private static Cliente cliente;

    public static Cliente getCliente() {
        return cliente;
    }

    public static void setCliente(Cliente cliente) {
        FormListarVeiculo.cliente = cliente;
    }
    
    public static DefaultTableModel getTabela() {
        return tabela;
    }

    public static void setTabela(JTable tabela) {
        FormListarVeiculo.tabela = (DefaultTableModel) tabela.getModel();
    }
    
    public static void atualizar(){
        FormListarVeiculo.tabela.getDataVector().removeAllElements();
        for (Veiculo vei : FormListarVeiculo.getCliente().getVeiculoList()) {
            String data[] = {vei.getIdveiculo()+"",vei.getVeiQuilometragem(),vei.getVeiIdmodelo().getModDescricao()};
            FormListarVeiculo.tabela.addRow(data);   
        }
    }
}
