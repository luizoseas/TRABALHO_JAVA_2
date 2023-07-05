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
@Table(name = "cidade")
@NamedQueries({
    @NamedQuery(name = "Cidade.findAll", query = "SELECT c FROM Cidade c"),
    @NamedQuery(name = "Cidade.findByIdcidade", query = "SELECT c FROM Cidade c WHERE c.idcidade = :idcidade"),
    @NamedQuery(name = "Cidade.findByCidDescricao", query = "SELECT c FROM Cidade c WHERE c.cidDescricao = :cidDescricao")})
public class Cidade extends DAO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcidade")
    private Integer idcidade;
    @Basic(optional = false)
    @Column(name = "cid_descricao")
    private String cidDescricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "endIdcidade")
    private List<Endereco> enderecoList;

    public static Cidade buscarOuInserirCidade(String nomeCidade) throws FalhaException {
        TypedQuery<Cidade> query = DAO.getInstance().createNamedQuery("Cidade.findByCidDescricao", Cidade.class);
        query.setParameter("cidDescricao", nomeCidade);

        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            Cidade novaCidade = new Cidade();
            novaCidade.setCidDescricao(nomeCidade);
            novaCidade.salvar();
            return novaCidade;
        }
    }
    
    
    public Cidade() {
    }

    public Cidade(Integer idcidade) {
        this.idcidade = idcidade;
    }

    public Cidade(Integer idcidade, String cidDescricao) {
        this.idcidade = idcidade;
        this.cidDescricao = cidDescricao;
    }

    public Integer getIdcidade() {
        return idcidade;
    }

    public void setIdcidade(Integer idcidade) {
        this.idcidade = idcidade;
    }

    public String getCidDescricao() {
        return cidDescricao;
    }

    public void setCidDescricao(String cidDescricao) {
        this.cidDescricao = cidDescricao;
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
        hash += (idcidade != null ? idcidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cidade)) {
            return false;
        }
        Cidade other = (Cidade) object;
        if ((this.idcidade == null && other.idcidade != null) || (this.idcidade != null && !this.idcidade.equals(other.idcidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Cidade[ idcidade=" + idcidade + " ]";
    }
    
}
