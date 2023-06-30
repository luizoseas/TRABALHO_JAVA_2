/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.lomm.automecanicapoo.database;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "status")
@NamedQueries({
    @NamedQuery(name = "Status.findAll", query = "SELECT s FROM Status s"),
    @NamedQuery(name = "Status.findByIdstatus", query = "SELECT s FROM Status s WHERE s.idstatus = :idstatus"),
    @NamedQuery(name = "Status.findByStatDescricao", query = "SELECT s FROM Status s WHERE s.statDescricao = :statDescricao")})
public class Status implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idstatus")
    private Integer idstatus;
    @Basic(optional = false)
    @Column(name = "stat_descricao")
    private String statDescricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consIdstatus")
    private List<Conserto> consertoList;

    public Status() {
    }

    public Status(Integer idstatus) {
        this.idstatus = idstatus;
    }

    public Status(Integer idstatus, String statDescricao) {
        this.idstatus = idstatus;
        this.statDescricao = statDescricao;
    }

    public Integer getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(Integer idstatus) {
        this.idstatus = idstatus;
    }

    public String getStatDescricao() {
        return statDescricao;
    }

    public void setStatDescricao(String statDescricao) {
        this.statDescricao = statDescricao;
    }

    public List<Conserto> getConsertoList() {
        return consertoList;
    }

    public void setConsertoList(List<Conserto> consertoList) {
        this.consertoList = consertoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idstatus != null ? idstatus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Status)) {
            return false;
        }
        Status other = (Status) object;
        if ((this.idstatus == null && other.idstatus != null) || (this.idstatus != null && !this.idstatus.equals(other.idstatus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Status[ idstatus=" + idstatus + " ]";
    }
    
}
