/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import Interfaces.InterfaceController;
import br.dev.lomm.automecanicapoo.database.Conserto;
import br.dev.lomm.automecanicapoo.database.Pessoa;

/**
 *
 * @author roger
 */
public class ControllerConserto implements InterfaceController {

    private Conserto conserto;

    public void setConserto(Conserto conserto){
        this.conserto = conserto;
    }

    @Override
    public boolean validarDados() throws Exception {
        if (!(conserto.getConsDescricao() instanceof String) || conserto.getConsDescricao().length() <= 3){
            throw new Exception(EnumMensagem.MSG002.getDescricao());
        }

        return true;
    }
}
