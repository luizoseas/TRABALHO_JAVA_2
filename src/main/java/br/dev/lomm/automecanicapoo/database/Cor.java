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
@Table(name = "cor")
@NamedQueries({
    @NamedQuery(name = "Cor.findAll", query = "SELECT c FROM Cor c"),
    @NamedQuery(name = "Cor.findByIdcor", query = "SELECT c FROM Cor c WHERE c.idcor = :idcor"),
    @NamedQuery(name = "Cor.findByCorDescricao", query = "SELECT c FROM Cor c WHERE c.corDescricao = :corDescricao")})
public class Cor extends DAO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcor")
    private Integer idcor;
    @Basic(optional = false)
    @Column(name = "cor_descricao")
    private String corDescricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "veiIdcor")
    private List<Veiculo> veiculoList;

    public static Cor buscarOuInserirCor(String nome) throws FalhaException {
        TypedQuery<Cor> query = DAO.getInstance().createNamedQuery("Cor.findByCorDescricao", Cor.class);
        query.setParameter("corDescricao", nome);

        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            Cor novo = new Cor();
            novo.setCorDescricao(nome);
            novo.salvar();
            return novo;
        }
    }
    
    public Cor() {
    }

    public Cor(Integer idcor) {
        this.idcor = idcor;
    }

    public Cor(Integer idcor, String corDescricao) {
        this.idcor = idcor;
        this.corDescricao = corDescricao;
    }

    public Integer getIdcor() {
        return idcor;
    }

    public void setIdcor(Integer idcor) {
        this.idcor = idcor;
    }

    public String getCorDescricao() {
        return corDescricao;
    }

    public void setCorDescricao(String corDescricao) {
        this.corDescricao = corDescricao;
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
        hash += (idcor != null ? idcor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cor)) {
            return false;
        }
        Cor other = (Cor) object;
        if ((this.idcor == null && other.idcor != null) || (this.idcor != null && !this.idcor.equals(other.idcor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Cor[ idcor=" + idcor + " ]";
    }
    
}
