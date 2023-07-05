/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.EnumMensagem;
import Interfaces.FalhaException;
import Interfaces.InterfaceController;
import br.dev.lomm.automecanicapoo.database.Estoque;
import br.dev.lomm.automecanicapoo.database.Fornecedor;
import br.dev.lomm.automecanicapoo.database.Nota;
import br.dev.lomm.automecanicapoo.database.Produto;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

/**
 *
 * @author roger
 */
public class ControllerLote implements InterfaceController {
    private Estoque estoque;
    private Produto produto;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setEstoque(Estoque estoque){
        this.estoque = estoque;
    }
    
    public Estoque getEstoque(){
        return this.estoque;
    }
    
    public void preencherForm(
        JTextPane produto,
        JTextPane quantidade,
        JTextPane preco,
        JTextPane nota
    ){
        nota.disable();
        produto.disable();
        produto.setText(estoque.getEstIdproduto().getProdNome());
        quantidade.setText(estoque.getEstQuantidade()+"");
        preco.setText(estoque.getEstQuantidade()+"");
        nota.setText(estoque.getEstIdnota().getIdnota()+"");
    }
    
    public void setCampos(
        JTextPane quantidade,
        JTextPane preco
    ){
        estoque.setEstPreco(Double.parseDouble(preco.getText()));
        estoque.setEstQuantidade(Integer.parseInt(quantidade.getText()));
    }
    
    public void setCampos(
        JTextPane quantidade,
        JTextPane preco,
        JComboBox nota
    ){
        if(!(this.estoque instanceof Estoque)){
            estoque= new Estoque();
        }
        estoque.setEstPreco(Double.parseDouble(preco.getText()));
        estoque.setEstQuantidade(Integer.parseInt(quantidade.getText()));
        estoque.setEstIdnota(DAO.getInstance().find(Nota.class, Integer.parseInt((String) nota.getItemAt(nota.getSelectedIndex()))));
        estoque.setEstIdproduto(produto);
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
