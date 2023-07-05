/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Controllers.DAO;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Query;
import javax.persistence.Table;
import javax.persistence.TypedQuery;

/**
 *
 * @author oseas
 */
@Entity
@Table(name = "estoque")
@NamedQueries({
    @NamedQuery(name = "Estoque.findAll", query = "SELECT e FROM Estoque e"),
    @NamedQuery(name = "Estoque.findByIdestoque", query = "SELECT e FROM Estoque e WHERE e.idestoque = :idestoque"),
    @NamedQuery(name = "Estoque.findByEstQuantidade", query = "SELECT e FROM Estoque e WHERE e.estQuantidade = :estQuantidade"),
    @NamedQuery(name = "Estoque.findByEstPreco", query = "SELECT e FROM Estoque e WHERE e.estPreco = :estPreco")})
public class Estoque extends DAO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idestoque")
    private Integer idestoque;
    @Basic(optional = false)
    @Column(name = "est_quantidade")
    private int estQuantidade;
    @Basic(optional = false)
    @Column(name = "est_preco")
    private double estPreco;
    @JoinColumn(name = "est_idnota", referencedColumnName = "idnota")
    @ManyToOne(optional = false)
    private Nota estIdnota;
    @JoinColumn(name = "est_idproduto", referencedColumnName = "idproduto")
    @ManyToOne(optional = false)
    private Produto estIdproduto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estoque")
    private List<Pecasconserto> pecasconsertoList;

    public Estoque() {
    }

    public Estoque(Integer idestoque) {
        this.idestoque = idestoque;
    }

    public Estoque(Integer idestoque, int estQuantidade, double estPreco) {
        this.idestoque = idestoque;
        this.estQuantidade = estQuantidade;
        this.estPreco = estPreco;
    }

    public Integer getIdestoque() {
        return idestoque;
    }

    public void setIdestoque(Integer idestoque) {
        this.idestoque = idestoque;
    }

    public int getEstQuantidade() {
        return estQuantidade;
    }

    public void setEstQuantidade(int estQuantidade) {
        this.estQuantidade = estQuantidade;
    }

    public double getEstPreco() {
        return estPreco;
    }

    public void setEstPreco(double estPreco) {
        this.estPreco = estPreco;
    }

    public Nota getEstIdnota() {
        return estIdnota;
    }

    public void setEstIdnota(Nota estIdnota) {
        this.estIdnota = estIdnota;
    }

    public Produto getEstIdproduto() {
        return estIdproduto;
    }

    public void setEstIdproduto(Produto estIdproduto) {
        this.estIdproduto = estIdproduto;
    }

    public List<Pecasconserto> getPecasconsertoList() {
        return pecasconsertoList;
    }

    public void setPecasconsertoList(List<Pecasconserto> pecasconsertoList) {
        this.pecasconsertoList = pecasconsertoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestoque != null ? idestoque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estoque)) {
            return false;
        }
        Estoque other = (Estoque) object;
        if ((this.idestoque == null && other.idestoque != null) || (this.idestoque != null && !this.idestoque.equals(other.idestoque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Estoque[ idestoque=" + idestoque + " ]";
    }
    
}
