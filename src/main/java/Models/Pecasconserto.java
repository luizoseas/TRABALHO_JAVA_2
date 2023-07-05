/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author oseas
 */
@Entity
@Table(name = "pecasconserto")
@NamedQueries({
    @NamedQuery(name = "Pecasconserto.findAll", query = "SELECT p FROM Pecasconserto p"),
    @NamedQuery(name = "Pecasconserto.findByPcIdconserto", query = "SELECT p FROM Pecasconserto p WHERE p.pecasconsertoPK.pcIdconserto = :pcIdconserto"),
    @NamedQuery(name = "Pecasconserto.findByPcIdestoque", query = "SELECT p FROM Pecasconserto p WHERE p.pecasconsertoPK.pcIdestoque = :pcIdestoque"),
    @NamedQuery(name = "Pecasconserto.findByPcQuantidade", query = "SELECT p FROM Pecasconserto p WHERE p.pcQuantidade = :pcQuantidade")})
public class Pecasconserto implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PecasconsertoPK pecasconsertoPK;
    @Basic(optional = false)
    @Column(name = "pc_quantidade")
    private int pcQuantidade;
    @JoinColumn(name = "pc_idconserto", referencedColumnName = "idconserto", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Conserto conserto;
    @JoinColumn(name = "pc_idestoque", referencedColumnName = "idestoque", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Estoque estoque;

    public Pecasconserto() {
    }

    public Pecasconserto(PecasconsertoPK pecasconsertoPK) {
        this.pecasconsertoPK = pecasconsertoPK;
    }

    public Pecasconserto(PecasconsertoPK pecasconsertoPK, int pcQuantidade) {
        this.pecasconsertoPK = pecasconsertoPK;
        this.pcQuantidade = pcQuantidade;
    }

    public Pecasconserto(int pcIdconserto, int pcIdestoque) {
        this.pecasconsertoPK = new PecasconsertoPK(pcIdconserto, pcIdestoque);
    }

    public PecasconsertoPK getPecasconsertoPK() {
        return pecasconsertoPK;
    }

    public void setPecasconsertoPK(PecasconsertoPK pecasconsertoPK) {
        this.pecasconsertoPK = pecasconsertoPK;
    }

    public int getPcQuantidade() {
        return pcQuantidade;
    }

    public void setPcQuantidade(int pcQuantidade) {
        this.pcQuantidade = pcQuantidade;
    }

    public Conserto getConserto() {
        return conserto;
    }

    public void setConserto(Conserto conserto) {
        this.conserto = conserto;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pecasconsertoPK != null ? pecasconsertoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pecasconserto)) {
            return false;
        }
        Pecasconserto other = (Pecasconserto) object;
        if ((this.pecasconsertoPK == null && other.pecasconsertoPK != null) || (this.pecasconsertoPK != null && !this.pecasconsertoPK.equals(other.pecasconsertoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Pecasconserto[ pecasconsertoPK=" + pecasconsertoPK + " ]";
    }
    
}
