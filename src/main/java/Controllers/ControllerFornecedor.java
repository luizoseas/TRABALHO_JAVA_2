/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import Interfaces.FalhaException;
import Interfaces.InterfaceController;
import br.dev.lomm.automecanicapoo.database.Fornecedor;

/**
 *
 * @author roger
 */
public class ControllerFornecedor implements InterfaceController{

    private Fornecedor fornecedor;

    public void setFornecedor(Fornecedor fornecedor){
        this.fornecedor = fornecedor;
    }

    @Override
    public boolean validarDados() throws Exception {
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
