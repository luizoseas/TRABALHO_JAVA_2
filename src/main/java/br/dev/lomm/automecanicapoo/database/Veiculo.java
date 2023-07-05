/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.lomm.automecanicapoo.database;

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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author oseas
 */
@Entity
@Table(name = "veiculo")
@NamedQueries({
    @NamedQuery(name = "Veiculo.findAll", query = "SELECT v FROM Veiculo v"),
    @NamedQuery(name = "Veiculo.findByIdveiculo", query = "SELECT v FROM Veiculo v WHERE v.idveiculo = :idveiculo"),
    @NamedQuery(name = "Veiculo.findByVeiDatafabric", query = "SELECT v FROM Veiculo v WHERE v.veiDatafabric = :veiDatafabric"),
    @NamedQuery(name = "Veiculo.findByVeiPlaca", query = "SELECT v FROM Veiculo v WHERE v.veiPlaca = :veiPlaca"),
    @NamedQuery(name = "Veiculo.findByVeiQuilometragem", query = "SELECT v FROM Veiculo v WHERE v.veiQuilometragem = :veiQuilometragem")})
public class Veiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idveiculo")
    private Integer idveiculo;
    @Basic(optional = false)
    @Column(name = "vei_datafabric")
    @Temporal(TemporalType.DATE)
    private Date veiDatafabric;
    @Basic(optional = false)
    @Column(name = "vei_placa")
    private String veiPlaca;
    @Basic(optional = false)
    @Column(name = "vei_quilometragem")
    private String veiQuilometragem;
    @JoinColumn(name = "vei_idclassificacao", referencedColumnName = "idclassificacao")
    @ManyToOne(optional = false)
    private Classificacao veiIdclassificacao;
    @JoinColumn(name = "vei_idcliente", referencedColumnName = "idcliente")
    @ManyToOne(optional = false)
    private Cliente veiIdcliente;
    @JoinColumn(name = "vei_idcombustivel", referencedColumnName = "idcombustivel")
    @ManyToOne(optional = false)
    private Combustivel veiIdcombustivel;
    @JoinColumn(name = "vei_idcor", referencedColumnName = "idcor")
    @ManyToOne(optional = false)
    private Cor veiIdcor;
    @JoinColumn(name = "vei_idmodelo", referencedColumnName = "idmodelo")
    @ManyToOne
    private Modelo veiIdmodelo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consIdveiculo")
    private List<Conserto> consertoList;

    public Veiculo() {
    }

    public Veiculo(Integer idveiculo) {
        this.idveiculo = idveiculo;
    }

    public Veiculo(Integer idveiculo, Date veiDatafabric, String veiPlaca, String veiQuilometragem) {
        this.idveiculo = idveiculo;
        this.veiDatafabric = veiDatafabric;
        this.veiPlaca = veiPlaca;
        this.veiQuilometragem = veiQuilometragem;
    }

    public Integer getIdveiculo() {
        return idveiculo;
    }

    public void setIdveiculo(Integer idveiculo) {
        this.idveiculo = idveiculo;
    }

    public Date getVeiDatafabric() {
        return veiDatafabric;
    }

    public void setVeiDatafabric(Date veiDatafabric) {
        this.veiDatafabric = veiDatafabric;
    }

    public String getVeiPlaca() {
        return veiPlaca;
    }

    public void setVeiPlaca(String veiPlaca) {
        this.veiPlaca = veiPlaca;
    }

    public String getVeiQuilometragem() {
        return veiQuilometragem;
    }

    public void setVeiQuilometragem(String veiQuilometragem) {
        this.veiQuilometragem = veiQuilometragem;
    }

    public Classificacao getVeiIdclassificacao() {
        return veiIdclassificacao;
    }

    public void setVeiIdclassificacao(Classificacao veiIdclassificacao) {
        this.veiIdclassificacao = veiIdclassificacao;
    }

    public Cliente getVeiIdcliente() {
        return veiIdcliente;
    }

    public void setVeiIdcliente(Cliente veiIdcliente) {
        this.veiIdcliente = veiIdcliente;
    }

    public Combustivel getVeiIdcombustivel() {
        return veiIdcombustivel;
    }

    public void setVeiIdcombustivel(Combustivel veiIdcombustivel) {
        this.veiIdcombustivel = veiIdcombustivel;
    }

    public Cor getVeiIdcor() {
        return veiIdcor;
    }

    public void setVeiIdcor(Cor veiIdcor) {
        this.veiIdcor = veiIdcor;
    }

    public Modelo getVeiIdmodelo() {
        return veiIdmodelo;
    }

    public void setVeiIdmodelo(Modelo veiIdmodelo) {
        this.veiIdmodelo = veiIdmodelo;
    }

    public List<Conserto> getConsertoList() {
        return consertoList;
    }

    public void setConsertoList(List<Conserto> consertoList) {
        this.consertoList = consertoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idveiculo != null ? idveiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veiculo)) {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.idveiculo == null && other.idveiculo != null) || (this.idveiculo != null && !this.idveiculo.equals(other.idveiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Veiculo[ idveiculo=" + idveiculo + " ]";
    }
    
}
