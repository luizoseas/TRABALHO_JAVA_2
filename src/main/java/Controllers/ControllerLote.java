/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.InterfaceController;
import br.dev.lomm.automecanicapoo.database.Conserto;

/**
 *
 * @author roger
 */
public class ControllerLote implements InterfaceController {

    private Lote lote;

    public void setLote(Lote lote){
        this.lote = lote;
    }

    @Override
    public boolean validarDados() throws Exception {
        return false;
    }
}
