/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import Interfaces.FalhaException;
import Interfaces.InterfaceController;
import Models.Fornecedor;
import javax.swing.JTextPane;

/**
 *
 * @author roger
 */
public class ControllerFornecedor implements InterfaceController{

    private Fornecedor fornecedor;

    public void setFornecedor(Fornecedor fornecedor){
        this.fornecedor = fornecedor;
    }
    
    public Fornecedor getFornecedor(){
        return this.fornecedor;
    }
    
    public void preencherForm(
        JTextPane nomeFantasia,
        JTextPane razaoSocial,
        JTextPane cnpj,
        JTextPane ie
    ){
        nomeFantasia.setText(fornecedor.getForNomefantasia());
        razaoSocial.setText(fornecedor.getForRazaosocial());
        cnpj.setText(fornecedor.getForCnpj());
        ie.setText(fornecedor.getForInscricaoestadual());
    }
    
    public void setCampos(
        JTextPane nomeFantasia,
        JTextPane razaoSocial,
        JTextPane cnpj,
        JTextPane ie
    ){
        if(!(this.fornecedor instanceof Fornecedor)){
            fornecedor = new Fornecedor();
        }
        fornecedor.setForCnpj(cnpj.getText());
        fornecedor.setForRazaosocial(razaoSocial.getText());
        fornecedor.setForInscricaoestadual(ie.getText());
        fornecedor.setForNomefantasia(nomeFantasia.getText());
    }

    @Override
    public boolean validarDados() throws FalhaException {
        if (!(fornecedor.getForNomefantasia() instanceof String) ||
                fornecedor.getForNomefantasia().isEmpty() ||
                fornecedor.getForNomefantasia().length() <= 1){
            throw new FalhaException(EnumMensagem.MSG008.getDescricao());
        }
        if (!(fornecedor.getForRazaosocial() instanceof String) ||
                fornecedor.getForRazaosocial().isEmpty() ||
                fornecedor.getForRazaosocial().length() <= 1){
            throw new FalhaException(EnumMensagem.MSG009.getDescricao());
        }
        if (!(fornecedor.getForCnpj() instanceof String) ||
                fornecedor.getForCnpj().isEmpty() ||
                fornecedor.getForCnpj().length() != 14 ||
                !fornecedor.getForCnpj().matches("\\d+")){
            throw new FalhaException(EnumMensagem.MSG010.getDescricao());
        }
        if (!(fornecedor.getForInscricaoestadual() instanceof String) ||
                fornecedor.getForInscricaoestadual().isEmpty() ||
                !fornecedor.getForInscricaoestadual().matches("\\d+")){
            throw new FalhaException(EnumMensagem.MSG011.getDescricao());
        }
        return true;
    }
    
}
