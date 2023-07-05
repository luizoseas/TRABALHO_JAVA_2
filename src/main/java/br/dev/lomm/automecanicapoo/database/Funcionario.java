/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.lomm.automecanicapoo.database;

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

/**
 *
 * @author oseas
 */
@Entity
@Table(name = "funcionario")
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findByIdfuncionario", query = "SELECT f FROM Funcionario f WHERE f.idfuncionario = :idfuncionario")})
public class Funcionario extends DAO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfuncionario")
    private Integer idfuncionario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consIdfuncionario")
    private List<Conserto> consertoList;
    @JoinColumn(name = "fun_idcargo", referencedColumnName = "idcargo")
    @ManyToOne(optional = false)
    private Cargo funIdcargo;
    @JoinColumn(name = "fun_idpessoa", referencedColumnName = "idpessoa")
    @ManyToOne(optional = false)
    private Pessoa funIdpessoa;
    
    public static List<Funcionario> getFuncionarios(){        
        Query query = DAO.getInstance().createNamedQuery("Funcionario.findAll");
        return query.getResultList();
    }
    

    public Funcionario() {
    }

    public Funcionario(Integer idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public Integer getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(Integer idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public List<Conserto> getConsertoList() {
        return consertoList;
    }

    public void setConsertoList(List<Conserto> consertoList) {
        this.consertoList = consertoList;
    }

    public Cargo getFunIdcargo() {
        return funIdcargo;
    }

    public void setFunIdcargo(Cargo funIdcargo) {
        this.funIdcargo = funIdcargo;
    }

    public Pessoa getFunIdpessoa() {
        return funIdpessoa;
    }

    public void setFunIdpessoa(Pessoa funIdpessoa) {
        this.funIdpessoa = funIdpessoa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfuncionario != null ? idfuncionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.idfuncionario == null && other.idfuncionario != null) || (this.idfuncionario != null && !this.idfuncionario.equals(other.idfuncionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Funcionario[ idfuncionario=" + idfuncionario + " ]";
    }

    
}
