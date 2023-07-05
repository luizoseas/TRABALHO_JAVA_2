/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import Interfaces.FalhaException;
import Models.Classificacao;
import Models.Cliente;
import Models.Combustivel;
import Models.Cor;
import Models.Modelo;
import Models.Produto;
import Models.Veiculo;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.JTextPane;

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
    
    public Veiculo getVeiculo(){
        return this.veiculo;
    }
    
    public void setCampos(
        JTextPane placa,
        JTextPane quilometrage,
        JTextPane cor,
        JTextPane combustivel,
        JTextPane modelo,
        JTextPane classificacao,
        JDateChooser dataFabricacao
    ) throws FalhaException {
        if(!(veiculo instanceof Veiculo)){
            veiculo = new Veiculo();
        }
        veiculo.setVeiPlaca(placa.getText());
        veiculo.setVeiQuilometragem(placa.getText());
        veiculo.setVeiIdclassificacao(Classificacao.buscarOuInserirClassificacao(classificacao.getText()));
        veiculo.setVeiIdcor(Cor.buscarOuInserirCor(cor.getText()));
        veiculo.setVeiIdmodelo(Modelo.buscarOuInserirModelo(classificacao.getText()));
        veiculo.setVeiIdcombustivel(Combustivel.buscarOuInserirCombustivel(combustivel.getText()));
        veiculo.setVeiDatafabric(dataFabricacao.getDate());
    }

    public void preencherForm(
        JTextPane placa,
        JTextPane quilometrage,
        JTextPane cor,
        JTextPane combustivel,
        JTextPane modelo,
        JTextPane classificacao,
        JDateChooser dataFabricacao
    ) throws FalhaException {
        dataFabricacao.setDate(veiculo.getVeiDatafabric());
        placa.setText(veiculo.getVeiPlaca());
        quilometrage.setText(veiculo.getVeiQuilometragem());
        cor.setText(veiculo.getVeiIdcor().getCorDescricao());
        combustivel.setText(veiculo.getVeiIdcombustivel().getCombDescricao());
        modelo.setText(veiculo.getVeiIdmodelo().getModDescricao());
        classificacao.setText(veiculo.getVeiIdclassificacao().getClasDescricao());
    }

    public boolean validarDados() throws Exception{
        if(!(veiculo.getVeiDatafabric() instanceof Date) ||
                veiculo.getVeiDatafabric().toString().isEmpty()){
            throw new FalhaException(EnumMensagem.MSG013.getDescricao());
        }
        if(!(veiculo.getVeiPlaca() instanceof String) ||
                veiculo.getVeiPlaca().isEmpty() ||
                veiculo.getVeiPlaca().length() != 7){
            throw new FalhaException(EnumMensagem.MSG015.getDescricao());
        }
        if(!(veiculo.getVeiQuilometragem() instanceof String) ||
                veiculo.getVeiQuilometragem().isEmpty()){
            throw new FalhaException(EnumMensagem.MSG016.getDescricao());
        }
        if(!(veiculo.getVeiIdcombustivel().getCombDescricao() instanceof String) ||
                veiculo.getVeiIdcombustivel().getCombDescricao().isEmpty()){
            throw new FalhaException(EnumMensagem.MSG002.getDescricao());
        }
        if(!(veiculo.getVeiIdmodelo().getModDescricao() instanceof String ||
                veiculo.getVeiIdmodelo().getModDescricao().isEmpty())){
            throw new FalhaException(EnumMensagem.MSG002.getDescricao());
        }
        if(!(veiculo.getVeiIdmodelo().getModDescricao() instanceof String ||
                veiculo.getVeiIdmodelo().getModDescricao().isEmpty())){
            throw new FalhaException(EnumMensagem.MSG002.getDescricao());
        }
        if(!(veiculo.getVeiIdcor().getCorDescricao() instanceof String ||
                veiculo.getVeiIdcor().getCorDescricao().isEmpty())){
            throw new FalhaException(EnumMensagem.MSG002.getDescricao());
        }
        if(!(veiculo.getVeiIdcliente() instanceof Cliente)){
            throw new FalhaException(EnumMensagem.MSG017.getDescricao());
        }
        if(!(veiculo.getVeiIdclassificacao().getClasDescricao() instanceof String ||
                veiculo.getVeiIdclassificacao().getClasDescricao().isEmpty())){
            throw new FalhaException(EnumMensagem.MSG002.getDescricao());
        }
        return true;
    }
    
}
