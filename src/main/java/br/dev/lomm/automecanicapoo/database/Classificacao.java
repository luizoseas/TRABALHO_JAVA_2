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
@Table(name = "classificacao")
@NamedQueries({
    @NamedQuery(name = "Classificacao.findAll", query = "SELECT c FROM Classificacao c"),
    @NamedQuery(name = "Classificacao.findByIdclassificacao", query = "SELECT c FROM Classificacao c WHERE c.idclassificacao = :idclassificacao"),
    @NamedQuery(name = "Classificacao.findByClasDescricao", query = "SELECT c FROM Classificacao c WHERE c.clasDescricao = :clasDescricao")})
public class Classificacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idclassificacao")
    private Integer idclassificacao;
    @Basic(optional = false)
    @Column(name = "clas_descricao")
    private String clasDescricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "veiIdclassificacao")
    private List<Veiculo> veiculoList;

    public Classificacao() {
    }

    public Classificacao(Integer idclassificacao) {
        this.idclassificacao = idclassificacao;
    }

    public Classificacao(Integer idclassificacao, String clasDescricao) {
        this.idclassificacao = idclassificacao;
        this.clasDescricao = clasDescricao;
    }

    public Integer getIdclassificacao() {
        return idclassificacao;
    }

    public void setIdclassificacao(Integer idclassificacao) {
        this.idclassificacao = idclassificacao;
    }

    public String getClasDescricao() {
        return clasDescricao;
    }

    public void setClasDescricao(String clasDescricao) {
        this.clasDescricao = clasDescricao;
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
        hash += (idclassificacao != null ? idclassificacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Classificacao)) {
            return false;
        }
        Classificacao other = (Classificacao) object;
        if ((this.idclassificacao == null && other.idclassificacao != null) || (this.idclassificacao != null && !this.idclassificacao.equals(other.idclassificacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Classificacao[ idclassificacao=" + idclassificacao + " ]";
    }
    
}
