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
@Table(name = "bairro")
@NamedQueries({
    @NamedQuery(name = "Bairro.findAll", query = "SELECT b FROM Bairro b"),
    @NamedQuery(name = "Bairro.findByIdbairro", query = "SELECT b FROM Bairro b WHERE b.idbairro = :idbairro"),
    @NamedQuery(name = "Bairro.findByBaiDescricao", query = "SELECT b FROM Bairro b WHERE b.baiDescricao = :baiDescricao")})
public class Bairro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idbairro")
    private Integer idbairro;
    @Basic(optional = false)
    @Column(name = "bai_descricao")
    private String baiDescricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "endIdbairro")
    private List<Endereco> enderecoList;

    public Bairro() {
    }

    public Bairro(Integer idbairro) {
        this.idbairro = idbairro;
    }

    public Bairro(Integer idbairro, String baiDescricao) {
        this.idbairro = idbairro;
        this.baiDescricao = baiDescricao;
    }

    public Integer getIdbairro() {
        return idbairro;
    }

    public void setIdbairro(Integer idbairro) {
        this.idbairro = idbairro;
    }

    public String getBaiDescricao() {
        return baiDescricao;
    }

    public void setBaiDescricao(String baiDescricao) {
        this.baiDescricao = baiDescricao;
    }

    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbairro != null ? idbairro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bairro)) {
            return false;
        }
        Bairro other = (Bairro) object;
        if ((this.idbairro == null && other.idbairro != null) || (this.idbairro != null && !this.idbairro.equals(other.idbairro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Bairro[ idbairro=" + idbairro + " ]";
    }
    
}
