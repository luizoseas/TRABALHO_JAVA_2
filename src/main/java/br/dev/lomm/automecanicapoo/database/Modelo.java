/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.lomm.automecanicapoo.database;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author oseas
 */
@Entity
@Table(name = "modelo")
@NamedQueries({
    @NamedQuery(name = "Modelo.findAll", query = "SELECT m FROM Modelo m"),
    @NamedQuery(name = "Modelo.findByIdmodelo", query = "SELECT m FROM Modelo m WHERE m.idmodelo = :idmodelo"),
    @NamedQuery(name = "Modelo.findByModDescricao", query = "SELECT m FROM Modelo m WHERE m.modDescricao = :modDescricao")})
public class Modelo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idmodelo")
    private Integer idmodelo;
    @Basic(optional = false)
    @Column(name = "mod_descricao")
    private String modDescricao;
    @OneToMany(mappedBy = "veiIdmodelo")
    private List<Veiculo> veiculoList;

    public Modelo() {
    }

    public Modelo(Integer idmodelo) {
        this.idmodelo = idmodelo;
    }

    public Modelo(Integer idmodelo, String modDescricao) {
        this.idmodelo = idmodelo;
        this.modDescricao = modDescricao;
    }

    public Integer getIdmodelo() {
        return idmodelo;
    }

    public void setIdmodelo(Integer idmodelo) {
        this.idmodelo = idmodelo;
    }

    public String getModDescricao() {
        return modDescricao;
    }

    public void setModDescricao(String modDescricao) {
        this.modDescricao = modDescricao;
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
        hash += (idmodelo != null ? idmodelo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modelo)) {
            return false;
        }
        Modelo other = (Modelo) object;
        if ((this.idmodelo == null && other.idmodelo != null) || (this.idmodelo != null && !this.idmodelo.equals(other.idmodelo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Modelo[ idmodelo=" + idmodelo + " ]";
    }
    
}
