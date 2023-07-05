/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import Interfaces.FalhaException;
import Interfaces.InterfaceController;
import br.dev.lomm.automecanicapoo.database.Estoque;

/**
 *
 * @author roger
 */
public class ControllerLote implements InterfaceController {
    private Estoque estoque;

    public void setEstoque(Estoque estoque){
        this.estoque = estoque;
    }

    @Override
    public boolean validarDados() throws FalhaException {
        if(estoque.getEstPreco() < 0){
            throw new FalhaException(EnumMensagem.MSG014.getDescricao());
        }
        if(estoque.getEstQuantidade() < 0){
            throw new FalhaException(EnumMensagem.MSG014.getDescricao());
        }
        return true;
    }
}
