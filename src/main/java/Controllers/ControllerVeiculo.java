/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import Interfaces.FalhaException;
import br.dev.lomm.automecanicapoo.database.Cliente;
import br.dev.lomm.automecanicapoo.database.Veiculo;
import java.util.Date;

/**
 *
 * @author roger
 */
public class ControllerVeiculo {

    private Veiculo veiculo;
    
    public void setVeiculo(Veiculo veiculo)
    {
        this.veiculo = veiculo;
    }

    public boolean validarDados() throws Exception{
        if(!(veiculo.getVeiDatafabric() instanceof Date) ||
                veiculo.getVeiDatafabric().toString().isEmpty()){
            throw new FalhaException(EnumMensagem.MSG013.getDescricao());
        }
        if(!(veiculo.getVeiPlaca() instanceof String) ||
                veiculo.getVeiPlaca().isEmpty() ||
                veiculo.getVeiPlaca().length() != 7){
            throw new FalhaException(EnumMensagem.MSG013.getDescricao());
        }
        if(!(veiculo.getVeiQuilometragem() instanceof String) ||
                veiculo.getVeiQuilometragem().isEmpty()){
            throw new FalhaException(EnumMensagem.MSG013.getDescricao());
        }
        if(!(veiculo.getVeiIdcombustivel().getCombDescricao() instanceof String) ||
                veiculo.getVeiIdcombustivel().getCombDescricao().isEmpty()){
            throw new FalhaException(EnumMensagem.MSG013.getDescricao());
        }
        if(!(veiculo.getVeiIdmodelo().getModDescricao() instanceof String ||
                veiculo.getVeiIdmodelo().getModDescricao().isEmpty())){
            throw new FalhaException(EnumMensagem.MSG013.getDescricao());
        }
        if(!(veiculo.getVeiIdmodelo().getModDescricao() instanceof String ||
                veiculo.getVeiIdmodelo().getModDescricao().isEmpty())){
            throw new FalhaException(EnumMensagem.MSG013.getDescricao());
        }
        if(!(veiculo.getVeiIdcor().getCorDescricao() instanceof String ||
                veiculo.getVeiIdcor().getCorDescricao().isEmpty())){
            throw new FalhaException(EnumMensagem.MSG013.getDescricao());
        }
        if(!(veiculo.getVeiIdcliente() instanceof Cliente)){
            throw new FalhaException(EnumMensagem.MSG013.getDescricao());
        }
        if(!(veiculo.getVeiIdclassificacao().getClasDescricao() instanceof String ||
                veiculo.getVeiIdclassificacao().getClasDescricao().isEmpty())){
            throw new FalhaException(EnumMensagem.MSG013.getDescricao());
        }
        return true;
    }
    
}
