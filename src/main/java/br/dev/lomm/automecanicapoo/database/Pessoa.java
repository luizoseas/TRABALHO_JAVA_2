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
@Table(name = "pessoa")
@NamedQueries({
    @NamedQuery(name = "Pessoa.findAll", query = "SELECT p FROM Pessoa p"),
    @NamedQuery(name = "Pessoa.findByIdpessoa", query = "SELECT p FROM Pessoa p WHERE p.idpessoa = :idpessoa"),
    @NamedQuery(name = "Pessoa.findByPesCpf", query = "SELECT p FROM Pessoa p WHERE p.pesCpf = :pesCpf"),
    @NamedQuery(name = "Pessoa.findByPesNome", query = "SELECT p FROM Pessoa p WHERE p.pesNome = :pesNome"),
    @NamedQuery(name = "Pessoa.findByPesDatanasc", query = "SELECT p FROM Pessoa p WHERE p.pesDatanasc = :pesDatanasc"),
    @NamedQuery(name = "Pessoa.findByPesEmail", query = "SELECT p FROM Pessoa p WHERE p.pesEmail = :pesEmail")})
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idpessoa")
    private Integer idpessoa;
    @Basic(optional = false)
    @Column(name = "pes_cpf")
    private String pesCpf;
    @Basic(optional = false)
    @Column(name = "pes_nome")
    private String pesNome;
    @Basic(optional = false)
    @Column(name = "pes_datanasc")
    @Temporal(TemporalType.DATE)
    private Date pesDatanasc;
    @Column(name = "pes_email")
    private String pesEmail;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "telIdpessoa")
    private List<Telefone> telefoneList;
    @JoinColumn(name = "pes_idendereco", referencedColumnName = "idendereco")
    @ManyToOne(optional = false)
    private Endereco pesIdendereco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliIdpessoa")
    private List<Cliente> clienteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "funIdpessoa")
    private List<Funcionario> funcionarioList;

    public Pessoa() {
    }

    public Pessoa(Integer idpessoa) {
        this.idpessoa = idpessoa;
    }

    public Pessoa(Integer idpessoa, String pesCpf, String pesNome, Date pesDatanasc) {
        this.idpessoa = idpessoa;
        this.pesCpf = pesCpf;
        this.pesNome = pesNome;
        this.pesDatanasc = pesDatanasc;
    }

    public Integer getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(Integer idpessoa) {
        this.idpessoa = idpessoa;
    }

    public String getPesCpf() {
        return pesCpf;
    }

    public void setPesCpf(String pesCpf) {
        this.pesCpf = pesCpf;
    }

    public String getPesNome() {
        return pesNome;
    }

    public void setPesNome(String pesNome) {
        this.pesNome = pesNome;
    }

    public Date getPesDatanasc() {
        return pesDatanasc;
    }

    public void setPesDatanasc(Date pesDatanasc) {
        this.pesDatanasc = pesDatanasc;
    }

    public String getPesEmail() {
        return pesEmail;
    }

    public void setPesEmail(String pesEmail) {
        this.pesEmail = pesEmail;
    }

    public List<Telefone> getTelefoneList() {
        return telefoneList;
    }

    public void setTelefoneList(List<Telefone> telefoneList) {
        this.telefoneList = telefoneList;
    }

    public Endereco getPesIdendereco() {
        return pesIdendereco;
    }

    public void setPesIdendereco(Endereco pesIdendereco) {
        this.pesIdendereco = pesIdendereco;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public List<Funcionario> getFuncionarioList() {
        return funcionarioList;
    }

    public void setFuncionarioList(List<Funcionario> funcionarioList) {
        this.funcionarioList = funcionarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpessoa != null ? idpessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.idpessoa == null && other.idpessoa != null) || (this.idpessoa != null && !this.idpessoa.equals(other.idpessoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dev.lomm.automecanicapoo.database.Pessoa[ idpessoa=" + idpessoa + " ]";
    }
    
}
