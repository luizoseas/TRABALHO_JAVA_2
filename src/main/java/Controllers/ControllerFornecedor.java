/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

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
    public boolean validarDados() throws FalhaException {
    if (fornecedor.getForNomefantasia() instanceof String){

    }
    return true;
    }
    
}
