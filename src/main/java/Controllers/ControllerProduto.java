/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import Interfaces.FalhaException;
import Interfaces.InterfaceController;
import br.dev.lomm.automecanicapoo.database.Produto;
import java.util.Date;

/**
 *
 * @author roger
 */
public class ControllerProduto implements InterfaceController {

    private Produto produto;

    public void setProduto(Produto produto){
        this.produto = produto;
    }
    
    @Override
    public boolean validarDados() throws Exception {
        if(produto.getProdNome() instanceof String ||
                produto.getProdNome().isEmpty() ||
                produto.getProdNome().length() <= 1){
            throw new FalhaException(EnumMensagem.MSG001.getDescricao());
        }
        if(produto.getProdValidade() instanceof Date ||
                produto.getProdValidade().toString().isEmpty()){
                throw new FalhaException(EnumMensagem.MSG013.getDescricao());
        }
        return true;
    }
}
