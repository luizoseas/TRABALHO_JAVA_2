/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Controllers.DAO;
import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 *
 * @author oseas
 */
@Entity
@Table(name = "nota")
@NamedQueries({
    @NamedQuery(name = "Nota.findAll", query = "SELECT n FROM Nota n"),
    @NamedQuery(name = "Nota.findByIdnota", query = "SELECT n FROM Nota n WHERE n.idnota = :idnota"),
    @NamedQuery(name = "Nota.findByNotaDatacompra", query = "SELECT n FROM Nota n WHERE n.notaDatacompra = :notaDatacompra"),
    @NamedQuery(name = "Nota.findByNotaDataentrada", query = "SELECT n FROM Nota n WHERE n.notaDataentrada = :notaDataentrada")})
public class Nota extends DAO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idnota")
    private Integer idnota;
    @Basic(optional = false)
    @Column(name = "nota_datacompra")
    @Temporal(TemporalType.DATE)
    private Date notaDatacompra;
    @Basic(optional = false)
    @Column(name = "nota_dataentrada")
    @Temporal(TemporalType.DATE)
    private Date notaDataentrada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estIdnota")
    private List<Estoque> estoqueList;
    @JoinColumn(name = "nota_idfornecedor", referencedColumnName = "idfornecedor")
    @ManyToOne(optional = false)
    private Fornecedor notaIdfornecedor;

    public Nota() {
    }

    public Nota(Integer idnota) {
        this.idnota = idnota;
    }
    
    public static List<Nota> getNotas(){        
        Query query = DAO.getInstance().createNamedQuery("Nota.findAll");
        return query.getResultList();
    }

    public Nota(Integer idnota, Date notaDatacompra, Date notaDataentrada) {
        this.idnota = idnota;
        this.notaDatacompra = notaDatacompra;
        this.notaDataentrada = notaDataentrada;
    }

    public Integer getIdnota() {
        return idnota;
    }

    public void setIdnota(Integer idnota) {
        this.idnota = idnota;
    }

    public Date getNotaDatacompra() {
        return notaDatacompra;
    }

    public void setNotaDatacompra(Date notaDatacompra) {
        this.notaDatacompra = notaDatacompra;
    }

    public Date getNotaDataentrada() {
        return notaDataentrada;
    }

    public void setNotaDataentrada(Date notaDataentrada) {
        this.notaDataentrada = notaDataentrada;
    }

    public List<Estoque> getEstoqueList() {
        return estoqueList;
    }

    public void setEstoqueList(List<Estoque> estoqueList) {
        this.estoqueList = estoqueList;
    }

    public Fornecedor getNotaIdfornecedor() {
        return notaIdfornecedor;
    }

    public void setNotaIdfornecedor(Fornecedor notaIdfornecedor) {
        this.notaIdfornecedor = notaIdfornecedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnota != null ? idnota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nota)) {
            return false;
        }
        Nota other = (Nota) object;
        if ((this.idnota == null && other.idnota != null) || (this.idnota != null && !this.idnota.equals(other.idnota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Nota[ idnota=" + idnota + " ]";
    }
    
}
