/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.lomm.automecanicapoo.database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "telefone")
@NamedQueries({
    @NamedQuery(name = "Telefone.findAll", query = "SELECT t FROM Telefone t"),
    @NamedQuery(name = "Telefone.findByIdtelefone", query = "SELECT t FROM Telefone t WHERE t.idtelefone = :idtelefone"),
    @NamedQuery(name = "Telefone.findByTelCodpais", query = "SELECT t FROM Telefone t WHERE t.telCodpais = :telCodpais"),
    @NamedQuery(name = "Telefone.findByTelDdd", query = "SELECT t FROM Telefone t WHERE t.telDdd = :telDdd"),
    @NamedQuery(name = "Telefone.findByTelNumero", query = "SELECT t FROM Telefone t WHERE t.telNumero = :telNumero")})
public class Telefone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idtelefone")
    private Integer idtelefone;
    @Basic(optional = false)
    @Column(name = "tel_codpais")
    private String telCodpais;
    @Basic(optional = false)
    @Column(name = "tel_ddd")
    private String telDdd;
    @Basic(optional = false)
    @Column(name = "tel_numero")
    private String telNumero;
    @JoinColumn(name = "tel_idpessoa", referencedColumnName = "idpessoa")
    @ManyToOne(optional = false)
    private Pessoa telIdpessoa;

    public Telefone() {
    }

    public Telefone(Integer idtelefone) {
        this.idtelefone = idtelefone;
    }

    public Telefone(Integer idtelefone, String telCodpais, String telDdd, String telNumero) {
        this.idtelefone = idtelefone;
        this.telCodpais = telCodpais;
        this.telDdd = telDdd;
        this.telNumero = telNumero;
    }

    public Integer getIdtelefone() {
        return idtelefone;
    }

    public void setIdtelefone(Integer idtelefone) {
        this.idtelefone = idtelefone;
    }

    public String getTelCodpais() {
        return telCodpais;
    }

    public void setTelCodpais(String telCodpais) {
        this.telCodpais = telCodpais;
    }

    public String getTelDdd() {
        return telDdd;
    }

    public void setTelDdd(String telDdd) {
        this.telDdd = telDdd;
    }

    public String getTelNumero() {
        return telNumero;
    }

    public void setTelNumero(String telNumero) {
        this.telNumero = telNumero;
    }

    public Pessoa getTelIdpessoa() {
        return telIdpessoa;
    }

    public void setTelIdpessoa(Pessoa telIdpessoa) {
        this.telIdpessoa = telIdpessoa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtelefone != null ? idtelefone.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefone)) {
            return false;
        }
        Telefone other = (Telefone) object;
        if ((this.idtelefone == null && other.idtelefone != null) || (this.idtelefone != null && !this.idtelefone.equals(other.idtelefone))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Telefone[ idtelefone=" + idtelefone + " ]";
    }
    
}
