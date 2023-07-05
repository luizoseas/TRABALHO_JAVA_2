/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

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
@Table(name = "logradouro")
@NamedQueries({
    @NamedQuery(name = "Logradouro.findAll", query = "SELECT l FROM Logradouro l"),
    @NamedQuery(name = "Logradouro.findByIdlogradouro", query = "SELECT l FROM Logradouro l WHERE l.idlogradouro = :idlogradouro"),
    @NamedQuery(name = "Logradouro.findByLogDescricao", query = "SELECT l FROM Logradouro l WHERE l.logDescricao = :logDescricao")})
public class Logradouro extends DAO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlogradouro")
    private Integer idlogradouro;
    @Basic(optional = false)
    @Column(name = "log_descricao")
    private String logDescricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "endIdlogradouro")
    private List<Endereco> enderecoList;

    public static Logradouro buscarOuInserirLogradouro(String logradouro) throws FalhaException{
        TypedQuery<Logradouro> query = DAO.getInstance().createNamedQuery("Logradouro.findByLogDescricao", Logradouro.class);
        query.setParameter("logDescricao", logradouro);
        
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            Logradouro novoLogradouro = new Logradouro();
            novoLogradouro.setLogDescricao(logradouro);
            novoLogradouro.salvar();
            return novoLogradouro;
        }
    }
    
    public Logradouro() {
    }

    public Logradouro(Integer idlogradouro) {
        this.idlogradouro = idlogradouro;
    }

    public Logradouro(Integer idlogradouro, String logDescricao) {
        this.idlogradouro = idlogradouro;
        this.logDescricao = logDescricao;
    }

    public Integer getIdlogradouro() {
        return idlogradouro;
    }

    public void setIdlogradouro(Integer idlogradouro) {
        this.idlogradouro = idlogradouro;
    }

    public String getLogDescricao() {
        return logDescricao;
    }

    public void setLogDescricao(String logDescricao) {
        this.logDescricao = logDescricao;
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
        hash += (idlogradouro != null ? idlogradouro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Logradouro)) {
            return false;
        }
        Logradouro other = (Logradouro) object;
        if ((this.idlogradouro == null && other.idlogradouro != null) || (this.idlogradouro != null && !this.idlogradouro.equals(other.idlogradouro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Logradouro[ idlogradouro=" + idlogradouro + " ]";
    }
    
}
