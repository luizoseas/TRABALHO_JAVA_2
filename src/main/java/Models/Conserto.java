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

/**
 *
 * @author oseas
 */
@Entity
@Table(name = "conserto")
@NamedQueries({
    @NamedQuery(name = "Conserto.findAll", query = "SELECT c FROM Conserto c"),
    @NamedQuery(name = "Conserto.findByIdconserto", query = "SELECT c FROM Conserto c WHERE c.idconserto = :idconserto"),
    @NamedQuery(name = "Conserto.findByConsDescricao", query = "SELECT c FROM Conserto c WHERE c.consDescricao = :consDescricao"),
    @NamedQuery(name = "Conserto.findByConsDatainicio", query = "SELECT c FROM Conserto c WHERE c.consDatainicio = :consDatainicio"),
    @NamedQuery(name = "Conserto.findByConsDatafim", query = "SELECT c FROM Conserto c WHERE c.consDatafim = :consDatafim")})
public class Conserto extends DAO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idconserto")
    private Integer idconserto;
    @Basic(optional = false)
    @Column(name = "cons_descricao")
    private String consDescricao;
    @Basic(optional = false)
    @Column(name = "cons_datainicio")
    @Temporal(TemporalType.DATE)
    private Date consDatainicio;
    @Column(name = "cons_datafim")
    @Temporal(TemporalType.DATE)
    private Date consDatafim;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "conserto")
    private List<Pecasconserto> pecasconsertoList;
    @JoinColumn(name = "cons_idfuncionario", referencedColumnName = "idfuncionario")
    @ManyToOne(optional = false)
    private Funcionario consIdfuncionario;
    @JoinColumn(name = "cons_idstatus", referencedColumnName = "idstatus")
    @ManyToOne(optional = false)
    private Status consIdstatus;
    @JoinColumn(name = "cons_idveiculo", referencedColumnName = "idveiculo")
    @ManyToOne(optional = false)
    private Veiculo consIdveiculo;

    public List<Conserto> getConserto(){        
        Query query = DAO.getInstance().createNamedQuery("Conserto.findAll");
        return query.getResultList();
    }
    public static List<Conserto> getConsertos(){        
        Query query = DAO.getInstance().createNamedQuery("Conserto.findAll");
        return query.getResultList();
    }
        
    
    
    public Conserto() {
    }

    public Conserto(Integer idconserto) {
        this.idconserto = idconserto;
    }

    public Conserto(Integer idconserto, String consDescricao, Date consDatainicio) {
        this.idconserto = idconserto;
        this.consDescricao = consDescricao;
        this.consDatainicio = consDatainicio;
    }

    public Integer getIdconserto() {
        return idconserto;
    }

    public void setIdconserto(Integer idconserto) {
        this.idconserto = idconserto;
    }

    public String getConsDescricao() {
        return consDescricao;
    }

    public void setConsDescricao(String consDescricao) {
        this.consDescricao = consDescricao;
    }

    public Date getConsDatainicio() {
        return consDatainicio;
    }

    public void setConsDatainicio(Date consDatainicio) {
        this.consDatainicio = consDatainicio;
    }

    public Date getConsDatafim() {
        return consDatafim;
    }

    public void setConsDatafim(Date consDatafim) {
        this.consDatafim = consDatafim;
    }

    public List<Pecasconserto> getPecasconsertoList() {
        return pecasconsertoList;
    }

    public void setPecasconsertoList(List<Pecasconserto> pecasconsertoList) {
        this.pecasconsertoList = pecasconsertoList;
    }

    public Funcionario getConsIdfuncionario() {
        return consIdfuncionario;
    }

    public void setConsIdfuncionario(Funcionario consIdfuncionario) {
        this.consIdfuncionario = consIdfuncionario;
    }

    public Status getConsIdstatus() {
        return consIdstatus;
    }

    public void setConsIdstatus(Status consIdstatus) {
        this.consIdstatus = consIdstatus;
    }

    public Veiculo getConsIdveiculo() {
        return consIdveiculo;
    }

    public void setConsIdveiculo(Veiculo consIdveiculo) {
        this.consIdveiculo = consIdveiculo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconserto != null ? idconserto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conserto)) {
            return false;
        }
        Conserto other = (Conserto) object;
        if ((this.idconserto == null && other.idconserto != null) || (this.idconserto != null && !this.idconserto.equals(other.idconserto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Conserto[ idconserto=" + idconserto + " ]";
    }
    
}
