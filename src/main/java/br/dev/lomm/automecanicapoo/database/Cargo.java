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
@Table(name = "cargo")
@NamedQueries({
    @NamedQuery(name = "Cargo.findAll", query = "SELECT c FROM Cargo c"),
    @NamedQuery(name = "Cargo.findByIdcargo", query = "SELECT c FROM Cargo c WHERE c.idcargo = :idcargo"),
    @NamedQuery(name = "Cargo.findByCargDescricao", query = "SELECT c FROM Cargo c WHERE c.cargDescricao = :cargDescricao"),
    @NamedQuery(name = "Cargo.findByCargSalario", query = "SELECT c FROM Cargo c WHERE c.cargSalario = :cargSalario")})
public class Cargo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcargo")
    private Integer idcargo;
    @Basic(optional = false)
    @Column(name = "carg_descricao")
    private String cargDescricao;
    @Basic(optional = false)
    @Column(name = "carg_salario")
    private double cargSalario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "funIdcargo")
    private List<Funcionario> funcionarioList;

    public static List<Cargo> getCargos(){        
        Query query = DAO.getInstance().createNamedQuery("Cargo.findAll");
        return query.getResultList();
    }
    
    public Cargo() {
    }

    public Cargo(Integer idcargo) {
        this.idcargo = idcargo;
    }

    public Cargo(Integer idcargo, String cargDescricao, double cargSalario) {
        this.idcargo = idcargo;
        this.cargDescricao = cargDescricao;
        this.cargSalario = cargSalario;
    }

    public Integer getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(Integer idcargo) {
        this.idcargo = idcargo;
    }

    public String getCargDescricao() {
        return cargDescricao;
    }

    public void setCargDescricao(String cargDescricao) {
        this.cargDescricao = cargDescricao;
    }

    public double getCargSalario() {
        return cargSalario;
    }

    public void setCargSalario(double cargSalario) {
        this.cargSalario = cargSalario;
    }

    public List<Funcionario> getFuncionarioList() {
        return funcionarioList;
    }

    public void setFuncionarioList(List<Funcionario> funcionarioList) {
        this.funcionarioList = funcionarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcargo != null ? idcargo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cargo)) {
            return false;
        }
        Cargo other = (Cargo) object;
        if ((this.idcargo == null && other.idcargo != null) || (this.idcargo != null && !this.idcargo.equals(other.idcargo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Cargo[ idcargo=" + idcargo + " ]";
    }
    
}
