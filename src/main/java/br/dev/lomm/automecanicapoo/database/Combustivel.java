/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.lomm.automecanicapoo.database;

import Controllers.DAO;
import Interfaces.FalhaException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.NoResultException;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TypedQuery;

/**
 *
 * @author oseas
 */
@Entity
@Table(name = "combustivel")
@NamedQueries({
    @NamedQuery(name = "Combustivel.findAll", query = "SELECT c FROM Combustivel c"),
    @NamedQuery(name = "Combustivel.findByIdcombustivel", query = "SELECT c FROM Combustivel c WHERE c.idcombustivel = :idcombustivel"),
    @NamedQuery(name = "Combustivel.findByCombDescricao", query = "SELECT c FROM Combustivel c WHERE c.combDescricao = :combDescricao")})
public class Combustivel extends DAO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcombustivel")
    private Integer idcombustivel;
    @Basic(optional = false)
    @Column(name = "comb_descricao")
    private String combDescricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "veiIdcombustivel")
    private List<Veiculo> veiculoList;

    public static Combustivel buscarOuInserirCombustivel(String descricao) throws FalhaException {
        TypedQuery<Combustivel> query = DAO.getInstance().createNamedQuery("Combustivel.findByCombDescricao", Combustivel.class);
        query.setParameter("combDescricao", descricao);
        
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            Combustivel novoCombustivel = new Combustivel();
            novoCombustivel.salvar(); 
            return novoCombustivel;
        }
    }
    
    public Combustivel() {
    }

    public Combustivel(Integer idcombustivel) {
        this.idcombustivel = idcombustivel;
    }

    public Combustivel(Integer idcombustivel, String combDescricao) {
        this.idcombustivel = idcombustivel;
        this.combDescricao = combDescricao;
    }

    public Integer getIdcombustivel() {
        return idcombustivel;
    }

    public void setIdcombustivel(Integer idcombustivel) {
        this.idcombustivel = idcombustivel;
    }

    public String getCombDescricao() {
        return combDescricao;
    }

    public void setCombDescricao(String combDescricao) {
        this.combDescricao = combDescricao;
    }

    public List<Veiculo> getVeiculoList() {
        return veiculoList;
    }

    public void setVeiculoList(List<Veiculo> veiculoList) {
        this.veiculoList = veiculoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcombustivel != null ? idcombustivel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Combustivel)) {
            return false;
        }
        Combustivel other = (Combustivel) object;
        if ((this.idcombustivel == null && other.idcombustivel != null) || (this.idcombustivel != null && !this.idcombustivel.equals(other.idcombustivel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Combustivel[ idcombustivel=" + idcombustivel + " ]";
    }
    
}
