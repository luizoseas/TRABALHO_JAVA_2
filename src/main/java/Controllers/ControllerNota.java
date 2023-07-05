/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import Interfaces.FalhaException;
import Interfaces.InterfaceController;
import br.dev.lomm.automecanicapoo.database.Fornecedor;
import br.dev.lomm.automecanicapoo.database.Nota;
import br.dev.lomm.automecanicapoo.database.Produto;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.JTextPane;

/**
 *
 * @author roger
 */
public class ControllerNota implements InterfaceController {

    private Nota nota;
    private Fornecedor fornecedor;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
        if(nota instanceof Nota){
            nota.setNotaIdfornecedor(fornecedor);
        }
    }

    public void setNota(Nota nota){
        this.nota = nota;
    }
    
    public Nota getNota(){
        return this.nota;
    }

    public void setCampos(
        JTextPane numero,
        JDateChooser dataEntrada,
        JDateChooser dataCompra
    ){
        if(!(nota instanceof Nota)){
            nota = new Nota();
        }
        nota.setIdnota(Integer.valueOf(numero.getText()));
        nota.setNotaDatacompra(dataCompra.getDate());
        nota.setNotaDataentrada(dataEntrada.getDate());
    }
   
    public void preencherForm(
        JTextPane numero,
        JDateChooser dataEntrada,
        JDateChooser dataCompra,
        JTextPane fornecedor
    ){
        fornecedor.setText(nota.getNotaIdfornecedor().getForNomefantasia());
        dataCompra.setDate(nota.getNotaDatacompra());
        dataEntrada.setDate(nota.getNotaDataentrada());
        numero.setText(nota.getIdnota()+"");
    }
    
    @Override
    public boolean validarDados() throws FalhaException {
        if(!(nota.getNotaDatacompra() instanceof Date) ||
                nota.getNotaDatacompra().toString().isEmpty()){
            throw new FalhaException(EnumMensagem.MSG013.getDescricao());
        }
        if(!(nota.getNotaDataentrada() instanceof Date) ||
                nota.getNotaDataentrada().toString().isEmpty()){
            throw new FalhaException(EnumMensagem.MSG013.getDescricao());
        }
        return true;
    }
    
    
}
