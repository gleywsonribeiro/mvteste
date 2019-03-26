/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
 * @author gleywson
 */
@Entity
@Table(name = "FUNCIONARIO")
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findByCdFunc", query = "SELECT f FROM Funcionario f WHERE f.cdFunc = :cdFunc"),
    @NamedQuery(name = "Funcionario.findByNmFunc", query = "SELECT f FROM Funcionario f WHERE f.nmFunc = :nmFunc"),
    @NamedQuery(name = "Funcionario.findBySnAtivo", query = "SELECT f FROM Funcionario f WHERE f.snAtivo = :snAtivo"),
    @NamedQuery(name = "Funcionario.findByVlHora", query = "SELECT f FROM Funcionario f WHERE f.vlHora = :vlHora"),
    @NamedQuery(name = "Funcionario.findByVlHoraExtra", query = "SELECT f FROM Funcionario f WHERE f.vlHoraExtra = :vlHoraExtra"),
    @NamedQuery(name = "Funcionario.findByDtVigencia", query = "SELECT f FROM Funcionario f WHERE f.dtVigencia = :dtVigencia"),
    @NamedQuery(name = "Funcionario.findBySnAutorizaExtra", query = "SELECT f FROM Funcionario f WHERE f.snAutorizaExtra = :snAutorizaExtra"),
    @NamedQuery(name = "Funcionario.findByCdUsuario", query = "SELECT f FROM Funcionario f WHERE f.cdUsuario = :cdUsuario"),
    @NamedQuery(name = "Funcionario.findByCdFuncIntegra", query = "SELECT f FROM Funcionario f WHERE f.cdFuncIntegra = :cdFuncIntegra"),
    @NamedQuery(name = "Funcionario.findByCdSeqIntegra", query = "SELECT f FROM Funcionario f WHERE f.cdSeqIntegra = :cdSeqIntegra"),
    @NamedQuery(name = "Funcionario.findByDtIntegra", query = "SELECT f FROM Funcionario f WHERE f.dtIntegra = :dtIntegra"),
    @NamedQuery(name = "Funcionario.findByNrCpf", query = "SELECT f FROM Funcionario f WHERE f.nrCpf = :nrCpf"),
    @NamedQuery(name = "Funcionario.findByDsEndereco", query = "SELECT f FROM Funcionario f WHERE f.dsEndereco = :dsEndereco"),
    @NamedQuery(name = "Funcionario.findByNrEndereco", query = "SELECT f FROM Funcionario f WHERE f.nrEndereco = :nrEndereco"),
    @NamedQuery(name = "Funcionario.findByDsComplemento", query = "SELECT f FROM Funcionario f WHERE f.dsComplemento = :dsComplemento"),
    @NamedQuery(name = "Funcionario.findByDsBairro", query = "SELECT f FROM Funcionario f WHERE f.dsBairro = :dsBairro"),
    @NamedQuery(name = "Funcionario.findByNrCep", query = "SELECT f FROM Funcionario f WHERE f.nrCep = :nrCep"),
    @NamedQuery(name = "Funcionario.findByDsRua", query = "SELECT f FROM Funcionario f WHERE f.dsRua = :dsRua"),
    @NamedQuery(name = "Funcionario.findBySnInternet", query = "SELECT f FROM Funcionario f WHERE f.snInternet = :snInternet"),
    @NamedQuery(name = "Funcionario.findByNrTelefone1", query = "SELECT f FROM Funcionario f WHERE f.nrTelefone1 = :nrTelefone1"),
    @NamedQuery(name = "Funcionario.findByNrTelefone2", query = "SELECT f FROM Funcionario f WHERE f.nrTelefone2 = :nrTelefone2"),
    @NamedQuery(name = "Funcionario.findByVlVendaHora", query = "SELECT f FROM Funcionario f WHERE f.vlVendaHora = :vlVendaHora"),
    @NamedQuery(name = "Funcionario.findByDsEmail", query = "SELECT f FROM Funcionario f WHERE f.dsEmail = :dsEmail"),
    @NamedQuery(name = "Funcionario.findByDsSindicato", query = "SELECT f FROM Funcionario f WHERE f.dsSindicato = :dsSindicato"),
    @NamedQuery(name = "Funcionario.findByDsInternet", query = "SELECT f FROM Funcionario f WHERE f.dsInternet = :dsInternet")})
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_FUNC")
    private Integer cdFunc;
    @Basic(optional = false)
    @Column(name = "NM_FUNC")
    private String nmFunc;
    @Column(name = "SN_ATIVO")
    private String snAtivo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_HORA")
    private BigDecimal vlHora;
    @Column(name = "VL_HORA_EXTRA")
    private BigDecimal vlHoraExtra;
    @Column(name = "DT_VIGENCIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtVigencia;
    @Column(name = "SN_AUTORIZA_EXTRA")
    private String snAutorizaExtra;
    @Column(name = "CD_USUARIO")
    private String cdUsuario;
    @Column(name = "CD_FUNC_INTEGRA")
    private String cdFuncIntegra;
    @Column(name = "CD_SEQ_INTEGRA")
    private BigInteger cdSeqIntegra;
    @Column(name = "DT_INTEGRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtIntegra;
    @Column(name = "NR_CPF")
    private Long nrCpf;
    @Column(name = "DS_ENDERECO")
    private String dsEndereco;
    @Column(name = "NR_ENDERECO")
    private String nrEndereco;
    @Column(name = "DS_COMPLEMENTO")
    private String dsComplemento;
    @Column(name = "DS_BAIRRO")
    private String dsBairro;
    @Column(name = "NR_CEP")
    private String nrCep;
    @Column(name = "DS_RUA")
    private String dsRua;
    @Basic(optional = false)
    @Column(name = "SN_INTERNET")
    private String snInternet;
    @Column(name = "NR_TELEFONE1")
    private Long nrTelefone1;
    @Column(name = "NR_TELEFONE2")
    private Long nrTelefone2;
    @Column(name = "VL_VENDA_HORA")
    private BigDecimal vlVendaHora;
    @Column(name = "DS_EMAIL")
    private String dsEmail;
    @Column(name = "DS_SINDICATO")
    private String dsSindicato;
    @Column(name = "DS_INTERNET")
    private String dsInternet;
    @JoinColumn(name = "CD_SETOR", referencedColumnName = "CD_SETOR")
    @ManyToOne(fetch = FetchType.LAZY)
    private Setor setor;
    @OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY)
    private List<ItsolicitacaoOs> itsolicitacaoOsList;

    public Funcionario() {
    }

    public Funcionario(Integer cdFunc) {
        this.cdFunc = cdFunc;
    }

    public Funcionario(Integer cdFunc, String nmFunc, String snInternet) {
        this.cdFunc = cdFunc;
        this.nmFunc = nmFunc;
        this.snInternet = snInternet;
    }

    public Integer getCdFunc() {
        return cdFunc;
    }

    public void setCdFunc(Integer cdFunc) {
        this.cdFunc = cdFunc;
    }

    public String getNmFunc() {
        return nmFunc;
    }

    public void setNmFunc(String nmFunc) {
        this.nmFunc = nmFunc;
    }

    public String getSnAtivo() {
        return snAtivo;
    }

    public void setSnAtivo(String snAtivo) {
        this.snAtivo = snAtivo;
    }

    public BigDecimal getVlHora() {
        return vlHora;
    }

    public void setVlHora(BigDecimal vlHora) {
        this.vlHora = vlHora;
    }

    public BigDecimal getVlHoraExtra() {
        return vlHoraExtra;
    }

    public void setVlHoraExtra(BigDecimal vlHoraExtra) {
        this.vlHoraExtra = vlHoraExtra;
    }

    public Date getDtVigencia() {
        return dtVigencia;
    }

    public void setDtVigencia(Date dtVigencia) {
        this.dtVigencia = dtVigencia;
    }

    public String getSnAutorizaExtra() {
        return snAutorizaExtra;
    }

    public void setSnAutorizaExtra(String snAutorizaExtra) {
        this.snAutorizaExtra = snAutorizaExtra;
    }

    public String getCdUsuario() {
        return cdUsuario;
    }

    public void setCdUsuario(String cdUsuario) {
        this.cdUsuario = cdUsuario;
    }

    public String getCdFuncIntegra() {
        return cdFuncIntegra;
    }

    public void setCdFuncIntegra(String cdFuncIntegra) {
        this.cdFuncIntegra = cdFuncIntegra;
    }

    public BigInteger getCdSeqIntegra() {
        return cdSeqIntegra;
    }

    public void setCdSeqIntegra(BigInteger cdSeqIntegra) {
        this.cdSeqIntegra = cdSeqIntegra;
    }

    public Date getDtIntegra() {
        return dtIntegra;
    }

    public void setDtIntegra(Date dtIntegra) {
        this.dtIntegra = dtIntegra;
    }

    public Long getNrCpf() {
        return nrCpf;
    }

    public void setNrCpf(Long nrCpf) {
        this.nrCpf = nrCpf;
    }

    public String getDsEndereco() {
        return dsEndereco;
    }

    public void setDsEndereco(String dsEndereco) {
        this.dsEndereco = dsEndereco;
    }

    public String getNrEndereco() {
        return nrEndereco;
    }

    public void setNrEndereco(String nrEndereco) {
        this.nrEndereco = nrEndereco;
    }

    public String getDsComplemento() {
        return dsComplemento;
    }

    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
    }

    public String getDsBairro() {
        return dsBairro;
    }

    public void setDsBairro(String dsBairro) {
        this.dsBairro = dsBairro;
    }

    public String getNrCep() {
        return nrCep;
    }

    public void setNrCep(String nrCep) {
        this.nrCep = nrCep;
    }

    public String getDsRua() {
        return dsRua;
    }

    public void setDsRua(String dsRua) {
        this.dsRua = dsRua;
    }

    public String getSnInternet() {
        return snInternet;
    }

    public void setSnInternet(String snInternet) {
        this.snInternet = snInternet;
    }

    public Long getNrTelefone1() {
        return nrTelefone1;
    }

    public void setNrTelefone1(Long nrTelefone1) {
        this.nrTelefone1 = nrTelefone1;
    }

    public Long getNrTelefone2() {
        return nrTelefone2;
    }

    public void setNrTelefone2(Long nrTelefone2) {
        this.nrTelefone2 = nrTelefone2;
    }

    public BigDecimal getVlVendaHora() {
        return vlVendaHora;
    }

    public void setVlVendaHora(BigDecimal vlVendaHora) {
        this.vlVendaHora = vlVendaHora;
    }

    public String getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    public String getDsSindicato() {
        return dsSindicato;
    }

    public void setDsSindicato(String dsSindicato) {
        this.dsSindicato = dsSindicato;
    }

    public String getDsInternet() {
        return dsInternet;
    }

    public void setDsInternet(String dsInternet) {
        this.dsInternet = dsInternet;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public List<ItsolicitacaoOs> getItsolicitacaoOsList() {
        return itsolicitacaoOsList;
    }

    public void setItsolicitacaoOsList(List<ItsolicitacaoOs> itsolicitacaoOsList) {
        this.itsolicitacaoOsList = itsolicitacaoOsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdFunc != null ? cdFunc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.cdFunc == null && other.cdFunc != null) || (this.cdFunc != null && !this.cdFunc.equals(other.cdFunc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeamento.model.Funcionario[ cdFunc=" + cdFunc + " ]";
    }
    
}
