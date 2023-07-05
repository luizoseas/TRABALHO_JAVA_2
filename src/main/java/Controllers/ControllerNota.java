/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.InterfaceController;
import br.dev.lomm.automecanicapoo.database.Conserto;
import br.dev.lomm.automecanicapoo.database.Nota;

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
    public boolean validarDados() throws Exception {
        return false;
    }
}
