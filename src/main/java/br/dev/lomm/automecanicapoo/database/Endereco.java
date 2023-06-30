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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author oseas
 */
@Entity
@Table(name = "endereco")
@NamedQueries({
    @NamedQuery(name = "Endereco.findAll", query = "SELECT e FROM Endereco e"),
    @NamedQuery(name = "Endereco.findByIdendereco", query = "SELECT e FROM Endereco e WHERE e.idendereco = :idendereco"),
    @NamedQuery(name = "Endereco.findByEndNumero", query = "SELECT e FROM Endereco e WHERE e.endNumero = :endNumero"),
    @NamedQuery(name = "Endereco.findByEndCep", query = "SELECT e FROM Endereco e WHERE e.endCep = :endCep")})
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idendereco")
    private Integer idendereco;
    @Basic(optional = false)
    @Column(name = "end_numero")
    private String endNumero;
    @Basic(optional = false)
    @Column(name = "end_cep")
    private String endCep;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pesIdendereco")
    private List<Pessoa> pessoaList;
    @JoinColumn(name = "end_idbairro", referencedColumnName = "idbairro")
    @ManyToOne(optional = false)
    private Bairro endIdbairro;
    @JoinColumn(name = "end_idcidade", referencedColumnName = "idcidade")
    @ManyToOne(optional = false)
    private Cidade endIdcidade;
    @JoinColumn(name = "end_idlogradouro", referencedColumnName = "idlogradouro")
    @ManyToOne(optional = false)
    private Logradouro endIdlogradouro;

    public Endereco() {
    }

    public Endereco(Integer idendereco) {
        this.idendereco = idendereco;
    }

    public Endereco(Integer idendereco, String endNumero, String endCep) {
        this.idendereco = idendereco;
        this.endNumero = endNumero;
        this.endCep = endCep;
    }

    public Integer getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(Integer idendereco) {
        this.idendereco = idendereco;
    }

    public String getEndNumero() {
        return endNumero;
    }

    public void setEndNumero(String endNumero) {
        this.endNumero = endNumero;
    }

    public String getEndCep() {
        return endCep;
    }

    public void setEndCep(String endCep) {
        this.endCep = endCep;
    }

    public List<Pessoa> getPessoaList() {
        return pessoaList;
    }

    public void setPessoaList(List<Pessoa> pessoaList) {
        this.pessoaList = pessoaList;
    }

    public Bairro getEndIdbairro() {
        return endIdbairro;
    }

    public void setEndIdbairro(Bairro endIdbairro) {
        this.endIdbairro = endIdbairro;
    }

    public Cidade getEndIdcidade() {
        return endIdcidade;
    }

    public void setEndIdcidade(Cidade endIdcidade) {
        this.endIdcidade = endIdcidade;
    }

    public Logradouro getEndIdlogradouro() {
        return endIdlogradouro;
    }

    public void setEndIdlogradouro(Logradouro endIdlogradouro) {
        this.endIdlogradouro = endIdlogradouro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idendereco != null ? idendereco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Endereco)) {
            return false;
        }
        Endereco other = (Endereco) object;
        if ((this.idendereco == null && other.idendereco != null) || (this.idendereco != null && !this.idendereco.equals(other.idendereco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Endereco[ idendereco=" + idendereco + " ]";
    }
    
}
