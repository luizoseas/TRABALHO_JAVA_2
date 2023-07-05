/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author oseas
 */
@Embeddable
public class PecasconsertoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "pc_idconserto")
    private int pcIdconserto;
    @Basic(optional = false)
    @Column(name = "pc_idestoque")
    private int pcIdestoque;

    public PecasconsertoPK() {
    }

    public PecasconsertoPK(int pcIdconserto, int pcIdestoque) {
        this.pcIdconserto = pcIdconserto;
        this.pcIdestoque = pcIdestoque;
    }

    public int getPcIdconserto() {
        return pcIdconserto;
    }

    public void setPcIdconserto(int pcIdconserto) {
        this.pcIdconserto = pcIdconserto;
    }

    public int getPcIdestoque() {
        return pcIdestoque;
    }

    public void setPcIdestoque(int pcIdestoque) {
        this.pcIdestoque = pcIdestoque;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pcIdconserto;
        hash += (int) pcIdestoque;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PecasconsertoPK)) {
            return false;
        }
        PecasconsertoPK other = (PecasconsertoPK) object;
        if (this.pcIdconserto != other.pcIdconserto) {
            return false;
        }
        if (this.pcIdestoque != other.pcIdestoque) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.PecasconsertoPK[ pcIdconserto=" + pcIdconserto + ", pcIdestoque=" + pcIdestoque + " ]";
    }
    
}
