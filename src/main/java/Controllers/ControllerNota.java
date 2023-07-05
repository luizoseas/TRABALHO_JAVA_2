/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import Interfaces.FalhaException;
import Interfaces.InterfaceController;
import br.dev.lomm.automecanicapoo.database.Nota;
import java.util.Date;

/**
 *
 * @author roger
 */
public class ControllerNota implements InterfaceController {

    private Nota nota;

    public void setNota(Nota nota){
        this.nota = nota;
    }

    @Override
    public boolean validarDados() throws FalhaException {
        if(nota.getNotaDatacompra() instanceof Date ||
                nota.getNotaDatacompra().toString().isEmpty()){
            throw new FalhaException(EnumMensagem.MSG013.getDescricao());
        }
        if(nota.getNotaDataentrada() instanceof Date ||
                nota.getNotaDataentrada().toString().isEmpty()){
            throw new FalhaException(EnumMensagem.MSG013.getDescricao());
        }
        return true;
    }
}
