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
import javax.transaction.Transactional;

/**
 *
 * @author oseas
 */
@Entity
@Table(name = "fornecedor")
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f"),
    @NamedQuery(name = "Fornecedor.findByIdfornecedor", query = "SELECT f FROM Fornecedor f WHERE f.idfornecedor = :idfornecedor"),
    @NamedQuery(name = "Fornecedor.findByForNomefantasia", query = "SELECT f FROM Fornecedor f WHERE f.forNomefantasia = :forNomefantasia"),
    @NamedQuery(name = "Fornecedor.findByForRazaosocial", query = "SELECT f FROM Fornecedor f WHERE f.forRazaosocial = :forRazaosocial"),
    @NamedQuery(name = "Fornecedor.findByForCnpj", query = "SELECT f FROM Fornecedor f WHERE f.forCnpj = :forCnpj"),
    @NamedQuery(name = "Fornecedor.findByForInscricaoestadual", query = "SELECT f FROM Fornecedor f WHERE f.forInscricaoestadual = :forInscricaoestadual")})
public class Fornecedor extends DAO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfornecedor")
    private Integer idfornecedor;
    @Basic(optional = false)
    @Column(name = "for_nomefantasia")
    private String forNomefantasia;
    @Basic(optional = false)
    @Column(name = "for_razaosocial")
    private String forRazaosocial;
    @Basic(optional = false)
    @Column(name = "for_cnpj")
    private String forCnpj;
    @Basic(optional = false)
    @Column(name = "for_inscricaoestadual")
    private String forInscricaoestadual;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "notaIdfornecedor")
    private List<Nota> notaList;

    public static List<Fornecedor> getFornecedores(){        
        Query query = DAO.getInstance().createNamedQuery("Fornecedor.findAll");
        return query.getResultList();
    }
    
    public List<Fornecedor> getFornecedor(){        
        Query query = DAO.getInstance().createNamedQuery("Fornecedor.findAll");
        return query.getResultList();
    }
        
    public Fornecedor() {
    }

    public Fornecedor(Integer idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public Fornecedor(Integer idfornecedor, String forNomefantasia, String forRazaosocial, String forCnpj, String forInscricaoestadual) {
        this.idfornecedor = idfornecedor;
        this.forNomefantasia = forNomefantasia;
        this.forRazaosocial = forRazaosocial;
        this.forCnpj = forCnpj;
        this.forInscricaoestadual = forInscricaoestadual;
    }

    public Integer getIdfornecedor() {
        return idfornecedor;
    }

    public void setIdfornecedor(Integer idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public String getForNomefantasia() {
        return forNomefantasia;
    }

    public void setForNomefantasia(String forNomefantasia) {
        this.forNomefantasia = forNomefantasia;
    }

    public String getForRazaosocial() {
        return forRazaosocial;
    }

    public void setForRazaosocial(String forRazaosocial) {
        this.forRazaosocial = forRazaosocial;
    }

    public String getForCnpj() {
        return forCnpj;
    }

    public void setForCnpj(String forCnpj) {
        this.forCnpj = forCnpj;
    }

    public String getForInscricaoestadual() {
        return forInscricaoestadual;
    }

    public void setForInscricaoestadual(String forInscricaoestadual) {
        this.forInscricaoestadual = forInscricaoestadual;
    }

    public List<Nota> getNotaList() {
        return notaList;
    }

    public void setNotaList(List<Nota> notaList) {
        this.notaList = notaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfornecedor != null ? idfornecedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.idfornecedor == null && other.idfornecedor != null) || (this.idfornecedor != null && !this.idfornecedor.equals(other.idfornecedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Fornecedor[ idfornecedor=" + idfornecedor + " ]";
    }
    
}
