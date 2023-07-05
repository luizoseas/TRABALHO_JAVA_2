/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import Interfaces.FalhaException;
import Interfaces.InterfaceController;
import br.dev.lomm.automecanicapoo.database.Estoque;
import java.util.Date;


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
        if(estoque.getEstIdnota().getNotaDatacompra() instanceof Date ||
                estoque.getEstIdnota().getNotaDatacompra().toString().isEmpty()){
            throw new FalhaException(EnumMensagem.MSG013.getDescricao());
        }
        if(estoque.getEstIdnota().getNotaDataentrada() instanceof Date ||
                estoque.getEstIdnota().getNotaDataentrada().toString().isEmpty()){
            throw new FalhaException(EnumMensagem.MSG013.getDescricao());
        }
        if(estoque.getEstIdproduto().getProdNome() instanceof String ||
                estoque.getEstIdproduto().getProdNome().isEmpty() ||
                estoque.getEstIdproduto().getProdNome().length() <= 1){
            throw new FalhaException(EnumMensagem.MSG001.getDescricao());
        }
        if(estoque.getEstIdproduto().getProdValidade() instanceof Date ||
                estoque.getEstIdproduto().getProdValidade().toString().isEmpty())
            new FalhaException(EnumMensagem.MSG013.getDescricao());
        
        return true;
    }
}
