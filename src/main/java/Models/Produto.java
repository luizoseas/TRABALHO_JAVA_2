/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Controllers.DAO;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author oseas
 */
@Entity
@Table(name = "produto")
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByIdproduto", query = "SELECT p FROM Produto p WHERE p.idproduto = :idproduto"),
    @NamedQuery(name = "Produto.findByProdNome", query = "SELECT p FROM Produto p WHERE p.prodNome like :prodNome"),
    @NamedQuery(name = "Produto.findByProdValidade", query = "SELECT p FROM Produto p WHERE p.prodValidade = :prodValidade")})
public class Produto extends DAO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproduto")
    private Integer idproduto;
    @Basic(optional = false)
    @Column(name = "prod_nome")
    private String prodNome;
    @Basic(optional = false)
    @Column(name = "prod_validade")
    @Temporal(TemporalType.DATE)
    private Date prodValidade;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estIdproduto")
    private List<Estoque> estoqueList;

    public Produto() {
    }
    
    public static List<Produto> getProdutos(){        
        Query query = DAO.getInstance().createNamedQuery("Produto.findAll");
        return query.getResultList();
    }
    
    public List<Produto> getProdutoPorDescricao(){
        Query query = DAO.getInstance().createNamedQuery("Produto.findByProdNome");
        query.setParameter("prodNome",this);
        return query.getResultList();
    }
    

    public Produto(Integer idproduto) {
        this.idproduto = idproduto;
    }

    public Produto(Integer idproduto, String prodNome, Date prodValidade) {
        this.idproduto = idproduto;
        this.prodNome = prodNome;
        this.prodValidade = prodValidade;
    }

    public Integer getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Integer idproduto) {
        this.idproduto = idproduto;
    }

    public String getProdNome() {
        return prodNome;
    }

    public void setProdNome(String prodNome) {
        this.prodNome = prodNome;
    }

    public Date getProdValidade() {
        return prodValidade;
    }

    public void setProdValidade(Date prodValidade) {
        this.prodValidade = prodValidade;
    }

    public List<Estoque> getEstoqueList() {
        return estoqueList;
    }

    public void setEstoqueList(List<Estoque> estoqueList) {
        this.estoqueList = estoqueList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproduto != null ? idproduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.idproduto == null && other.idproduto != null) || (this.idproduto != null && !this.idproduto.equals(other.idproduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Produto[ idproduto=" + idproduto + " ]";
    }
    
}
